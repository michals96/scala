object secondTask {

  def checkType(x: Any): String = x match {
    case s: String => "String(" + s + ")"
    case n: Int => "Int(" + n + ")"
    case d: Double => "Double(" + d + ")"
  }

  def stream(l: List[Any]): String = {
    @scala.annotation.tailrec
    def streamImpl(l: List[Any], res: String = ""): String = l match {
      case Nil => res
      case el :: listBuffer => streamImpl(listBuffer, res + checkType(el) + " ") }
    streamImpl(l)
  }

  def runSecondTask(): Unit ={
    val l = List(1, "hello", 2.56, 0x45, "key")
    val streamed = stream(l)
    println(streamed) // should result in: Int(1) String(hello) Double(2.56) Int(69) String(key)
  }
}
