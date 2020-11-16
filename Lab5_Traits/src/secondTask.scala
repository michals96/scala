import java.util.Calendar

object secondTask {

  abstract class Log(){
    def pprint(s:String): Unit
  }

  trait TimeStamp{
    def pprint(s:String):Unit={
      println(Calendar.getInstance().getTime() + " " + s)
    }
  }

  trait Quote{
    def pprint(s:String):Unit={
      println("''" + s + "''")
    }
  }

  class Logger() extends Log() with TimeStamp {
    override def pprint(s:String):Unit={super.pprint(s)}
  }


  def runSecondTask(): Unit ={

    val l = new Logger with TimeStamp
    l.pprint("Hello world") // Tue Nov 27 17:15:56 CET 2018 "Hello world"

    println("")

    //val ql = new Logger with Quote
    //ql.pprint("No date, just quote") // "No date, just quote"

    /*




        println("")

        val tl = new Logger with TimeStamp

        tl.pprint("Some time stamped message")

        println("")

        val plain = new Logger

        plain.pprint("Just he text")

        println("")
    */
  }
}

/*





Tue Nov 27 17:15:56 CET 2018 Some time stamped message

Just he text

 */
