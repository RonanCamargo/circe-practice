package ronancamargo.util

object pipe {
  final implicit class Piper[A](private val a: A) extends AnyVal {
    def |>[B](f: A => B): B = f(a)
  }
}
