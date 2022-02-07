package ronancamargo.extras

import io.circe.Decoder
import io.circe.generic.extras.Configuration
import io.circe.generic.extras.semiauto.deriveConfiguredDecoder
import ronancamargo.entities.{DocumentEnum, SimpleCar}
import ronancamargo.util.FileManager.readJson
import ronancamargo.implicits.pipe._

object Decoding extends App {
//  import io.circe.generic.auto._
//  import io.circe.parser.decode
//  readJson("camel-snake-car") |> decode[SimpleCar] |> println
}

//object SnakeDecoder {
//  implicit val configuration: Configuration           = Configuration.default.withSnakeCaseMemberNames
//  implicit val documentDecoder: Decoder[DocumentEnum] = deriveConfiguredDecoder[DocumentEnum]
//}
