package main.scala

object thirdTask {

  class Complex(val x:Double, val y:Double){
    override def toString(): String ={
      "Re:{" + x + "} Im:{" + y +"}"
    }

    def +(that:Complex): Complex ={
      new Complex(this.x + that.x, this.y + that.y)
    }

    def -(that:Complex): Complex ={
      new Complex(this.x - that.x, this.y - that.y)
    }
  }

  object Complex{
    def apply(x:Double, y:Double) = new Complex(x, y)

    def polar(r:Int, angle:Double): Complex ={
      new Complex(r, angle)
    }
  }

  def runThirdTask(): Unit ={
    val x = Complex(1,2)
    val y = Complex(3,2)

    println("x " + x + " y " + y + " x+y " + (x+y) + " x-y " + (x-y))
    // x Re:{1.0} Im:{2.0} y Re:{3.0} Im:{2.0} x+y Re:{4.0} Im:{4.0} x-y Re:{-2.0} Im:{0.0}

    val f = Complex.polar(r=3, angle=math.Pi)
    println(f)
  }
}
