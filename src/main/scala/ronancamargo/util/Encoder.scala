package ronancamargo.util

import io.circe.{Encoder, Json}

object Encoder {
  def encode[A](a: A)(implicit encoder: Encoder[A]): Json = encoder(a)
}
