package ronancamargo.entities

import io.circe.{Decoder, Encoder}

sealed trait CarStateADT

object CarStateADT {
  case object OnSale extends CarStateADT
  case object Sold   extends CarStateADT

  private val stringEncoder: Encoder[String] = Encoder.encodeString
  implicit val encoder: Encoder[CarStateADT] = stringEncoder.contramap {
    case OnSale => "ON_SALE"
    case Sold   => "SOLD"
  }

  implicit val decoder: Decoder[CarStateADT] = Decoder.decodeString.map {
    case "ON_SALE" => OnSale
    case "SOLD"    => Sold
  }

//  import cats.syntax.either._
//  implicit val eitherDecoder: Decoder[CarStateADT] = Decoder.decodeString.emap[CarStateADT] {
//    case "ON_SALE" => Right(OnSale)
//    case "SOLD"    => Sold.asRight
//    case other     => Left(other)
//  }

//  import scala.util.{Failure, Success}
//  implicit val tryDecoder: Decoder[CarStateADT] = Decoder.decodeString.emapTry[CarStateADT] {
//    case "ON_SALE" => Success(OnSale)
//    case "SOLD"    => Success(Sold)
//    case other     => Failure(new RuntimeException(s"Invalid value [$other]"))
//  }
}
