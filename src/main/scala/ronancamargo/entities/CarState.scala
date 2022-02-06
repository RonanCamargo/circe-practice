package ronancamargo.entities

import io.circe.{Decoder, Encoder}

object CarState extends Enumeration {
  type CarState = Value

  val ON_SALE, SOLD = Value

  implicit val enumDecoder: Decoder[CarState.Value] = Decoder.decodeEnumeration(CarState)
  implicit val enumEncoder: Encoder[CarState.Value] = Encoder.encodeEnumeration(CarState)
}
