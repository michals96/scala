import scala.annotation.tailrec

object firstTask {
  class Angle(val x:Double){
    override def toString(): String ={
      x.toString()
    }

    def +(that:Angle):Angle={
      new Angle(this.x + that.x)
    }

    def -(that:Angle):Angle={
      Angle(this.x - that.x)
    }

    def *(that:Double):Angle={
      Angle(that * this.x)
    }

    def /(that:Double):Angle={
      Angle(this.x / that)
    }
  }

  object Angle{

    def inRange(x: Double): Boolean ={
      (x < Math.PI && x > (-Math.PI))
    }

    def wrapAngle(angle:Double): Double ={
      @tailrec def wrap(angle:Double):Double ={
        if(inRange(angle)){
          angle
        }
        else{
          wrap(angle - 2*Math.PI)
        }
      }
      if(angle < 0) -wrap(Math.abs(angle))
      else wrap(Math.abs(angle))
    }

    def apply(x:Double):Angle = new Angle(wrapAngle(x))
  }

  def runFirstTask(): Unit ={
    val firstAngle = Angle(7.0)
    println("a: " + firstAngle)

    val secondAngle = Angle(7.0)
    println("b: " + secondAngle)


    println("a+b: " + (firstAngle+secondAngle))
    println("a-b: " + (firstAngle-secondAngle))

    println("a*b: " + (secondAngle*10.0))
    println("a/b: " + (secondAngle/0.1))
  }
}

/*
Exercise 1

Angle value range [-pi, pi).
The wrapping logic is as follows:
if value > pi then 2*pi should be subtracted from it
if value < -pi then 2*pi should be added to it
This procedure may need to be repeated i.e. if we do 200*Angle(3.14)
thus should be repeated multiple times. The implementation has to be tile recursive.
 */
