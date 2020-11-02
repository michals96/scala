object secondTask {
  class MyDate(val year:Int, val month:Int, val day:Int){

    override def toString: String ={
      year+"-"+month+"-"+day
    }

    def nextDay(): MyDate ={
      MyDate(this.year, this.month, this.day+1)
    }

    def <(that: MyDate): Boolean = this.year < that.year || this.month < that.month || this.day < that.day

    def -(that: MyDate): Int ={
      if(this.month == that.month)
        Math.abs(this.day - that.day)
      else
        Math.abs(((this.month)*31+this.day) - ((that.month)*31+that.day))+1
    }

  }

  object MyDate{
    def apply(year:Int, month:Int, day:Int) = new MyDate(year, month, day)
  }

  class MyPeriod(val begin:MyDate, val end:MyDate){
    override def toString: String ={
      " < " + begin + " : " + end + " >"
    }
  }

  object MyPeriod{
    def apply(begin:MyDate, end:MyDate) = new MyPeriod(begin, end)
  }
}

/*
Exercise 2

In the second exercise two classes are supposed to be written. That is MyDate and MyPeriod.
The purpose is to represent calendar date and time period (in granularity of days).
Disregard implementation details like length of each month etc.

 val d1 = MyDate(2021, 10, 10)
 val d2 = MyDate(2021, 11, 10)
 val d3 = d2.nextDay()

 println( d1 +" "+ d2 +" "+ d3 )
 println( (d1 < d2) + " " + (d2 < d1) )

 val days: Int = d1 - d2
 println("dni " + days + " " +(d2 - d1))

 val period = MyPeriod(begin=d1, end=d2  )
 println( " " + d1 + d2 + period)

  // expected result

   2021-10-10 2021-11-10 2021-11-11
   true false
   days 32 32
   2021-10-10 2021-11-10< 2021-10-10 : 2021-11-10 >
 */