import firstTask.merge
import secondTask.MyDate
import secondTask.MyPeriod

object main {
  def main(args: Array[String]): Unit ={
    println(merge( List(1,3,5,7,9), List(2,4,6,8,10) ))
    println(merge( List(1,5,6), List(2,2,9) ))
    println(merge( List(1,5,6,7), List(2,2,9) ))

    val d1 = MyDate(2021, 10, 10)
    val d2 = MyDate(2021, 11, 10)
    val d3 = d2.nextDay()

    println( d1 +" "+ d2 +" "+ d3 )
    println( (d1 < d2) + " " + (d2 < d1) )

    val days: Int = d1 - d2
    println("dni " + days + " " +(d2 - d1))

    val period = MyPeriod(begin=d1, end=d2  )
    println( " " + d1 + d2 + period)
  }
}
