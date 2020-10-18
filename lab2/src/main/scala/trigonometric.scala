import Math.sin
import Math.cos
import Math.tan
import scala.math.Pi

object trigonometric {

  def calculate(arg: String, typeOfConversion: String): Unit ={
    var doubleArg = arg.toDouble

    if( typeOfConversion == "rad")
    {
      var value = doubleArg
      println("sin = " + sin(value))
      println("cos = " + cos(value))
      println("tan = " + tan(value))
    }
    else
    {
      var value = Pi / (180.0/doubleArg)
      println("sin = " + sin(value))
      println("cos = " + cos(value))
      println("tan = " + tan(value))
    }
    println()
  }
}
