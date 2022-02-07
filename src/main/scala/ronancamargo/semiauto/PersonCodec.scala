package ronancamargo.semiauto

import cats.data.ValidatedNel
import io.circe
import io.circe.generic.semiauto.{deriveDecoder, deriveEncoder}
import io.circe.parser.{decode, decodeAccumulating, parse}
import io.circe._
import ronancamargo.entities.{Document, Person}
import ronancamargo.implicits.pipe._
import ronancamargo.util.FileManager

object PersonCodec extends App {
  val jsonFileName = "01.person"
  val json: String = FileManager.readJson(jsonFileName)

  implicit val documentDecoder: Decoder[Document] = deriveDecoder[Document]
  implicit val decoder: Decoder[Person]           = deriveDecoder[Person]

  val decodedPerson: Either[circe.Error, Person]    = decode[Person](json)
  val decodedAcc: ValidatedNel[circe.Error, Person] = decodeAccumulating[Person](json)

  val parsed: Either[ParsingFailure, Json] = parse(json)

  decodedPerson | println
  decodedAcc |> println

  implicit val documentEncoder: Encoder[Document] = deriveEncoder[Document]
  implicit val encoder: Encoder[Person]           = deriveEncoder[Person]

  val person        = Person("Juan", 20, Document("12345678", "DNI"))
  val encoded: Json = encoder.apply(person)

  val r: Either[ParsingFailure, Either[DecodingFailure, Person]] = parsed.map(decoder.decodeJson)

  val r2: Either[circe.Error, Person] = r.flatten
  val r3: Either[circe.Error, Person] = parsed.flatMap(decoder.decodeJson)

  assert(parsed == Right(encoded))

  encoded |> println

}
