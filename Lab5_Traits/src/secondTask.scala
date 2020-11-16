import java.util.Calendar

object secondTask {

  abstract class Log(){
    def pprint(s:String): Unit
  }

  trait TimeStamp extends Log{
    abstract override def pprint(s:String):Unit={
      print(Calendar.getInstance().getTime())
      super.pprint(" " + s)
    }
  }

  trait Quote extends Log{
    abstract override def pprint(s:String):Unit={
      super.pprint(" ''" + s + "''")
    }
  }

  class Logger() extends Log(){
    override def pprint(s:String):Unit={println(s)}
  }

  def runSecondTask(): Unit ={

    val l = new Logger with Quote with TimeStamp
    l.pprint("Hello world") // Tue Nov 27 17:15:56 CET 2018 "Hello world"

    println("")

    val ql = new Logger with Quote
    ql.pprint("No date, just quote") // "No date, just quote"

    println("")

    val tl = new Logger with TimeStamp
    tl.pprint("Some time stamped message") // Tue Nov 27 17:15:56 CET 2018 Some time stamped message

    println("")

    val plain = new Logger
    plain.pprint("Just the text") // Just he text

    println("")
  }
}
