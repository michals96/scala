package main.scala

object secondTask {

  trait htmlH2{
    override def toString: String = {
      "<H2>" + super.toString + "</H2>"
    }
  }

  trait html{
    override def toString: String = {
      "<L>" + super.toString + "</L>"
    }
  }

  trait Capitalisation{
    override def toString: String = {
      super.toString.capitalize
    }
  }

  trait PageStretch{
    val llen = 49
    val sep = llen - super.toString.length - 2
    override def toString: String = {
      super.toString.replace(" ", (" ") * (sep/2))
    }
  }

  class StringWrap(val s: String){
    override def toString() = s
  }

  class Pre(val text:String) extends StringWrap(text) with htmlH2 with html{}

  class X(val text: String, override val llen: Int) extends StringWrap(text) with Capitalisation with PageStretch

  def runSecondTask(): Unit ={
    val h = new Pre("Paragraph header") // <l><H2>Paragraph header</H2></l2>
    println(h)
    println(new X("abra ka dabra", 50)) //
    val z = new StringWrap("a tricky text with tricky content") with PageStretch
    println(z)
  }
}
