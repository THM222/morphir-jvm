package morphir.ir

object ValueExprList {
  implicit class ValueExprListOps[+A](private val self: ValueExprList[A]) extends AnyVal {
    def mapAttributes[B](f: A => B): ValueExprList[B] =
      self.map(_.mapAttributes(f))
  }
}
