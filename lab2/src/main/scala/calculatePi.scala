import scala.util.Random
import math.sqrt
import math.pow


object calculatePi {
  val generator = new Random()
  val rand = generator.nextDouble()

  def getRandomPoint(): (Double, Double) ={
    return (generator.nextDouble(), generator.nextDouble())
  }

  //point(x,y) and zero(0,0)
  def ifInTheCircle(point : (Double, Double)): Boolean ={
    if(sqrt(pow(point._1,2) + pow(point._2,2)) < 1) true
    else false
  }

  def calculateInsideCircle(n: Int): Double ={
    var returnValue = 0.0
      for(i <- 0 to n)
        {
          if(ifInTheCircle(getRandomPoint())) returnValue = returnValue + 1.0
          else None
        }
    println(returnValue)
    val rv = 4.0 * (returnValue/n.asInstanceOf[Double]);
    return rv
  }

}
