package ronancamargo.auto

import io.circe.Decoder
import io.circe.generic.extras.Configuration
import io.circe.generic.extras.semiauto.deriveConfiguredDecoder
import ronancamargo.entities._
import ronancamargo.implicits.pipe._
import ronancamargo.util.{Encoder, FileManager}

import scala.util.chaining.scalaUtilChainingOps

object Decoding extends App {
//  import io.circe.generic.extras.auto._
//  implicit val configuration: Configuration = Configuration.default.withSnakeCaseMemberNames
//
//  val json = FileManager.readJson("person")
//  io.circe.parser.decode[PersonWithDocumentEnum](json).pipe(println)
//
//  val carJson = FileManager.readJson("car1")
//  io.circe.parser.decode[SimpleCar](carJson).pipe(println)
//
//  import io.circe.parser.decode
//  import ronancamargo.util.FileManager.readJson
//
//  val car2Json = readJson("car2")
//  decode[CarMaybeOwner](car2Json).pipe(println)
//
//  val car3Json = readJson("car3")
//  decode[CarMaybeOwner](car3Json).pipe(println)
//
//  val carsJson = readJson("cars-array")
//  decode[List[CarMaybeOwner]](carsJson).pipe(println)
//
//  val carsObjectJson = readJson("cars-object")
//  decode[Cars](carsObjectJson)
//    .|>(x => s"Cars $x")
//    .|>(println)
//
//  readJson("cars-object") |> decode[Cars] |> println
//
//  PersonWithDocumentEnum("Juan", 20, DocumentEnum("123", "DNI")) |> Encoder
//    .encode[PersonWithDocumentEnum] |> (_.noSpaces) |> println
//
//  val dec: Decoder[PersonWithDocumentEnum] = deriveConfiguredDecoder[PersonWithDocumentEnum]

}
