package ronancamargo.implicits

import scala.util.chaining._

object pipe {
  final implicit class Piper[A](private val a: A) extends AnyVal {
    def |[B](f: A => B): B  = a.pipe(f)
    def |>[B](f: A => B): B = f(a)
  }
}
