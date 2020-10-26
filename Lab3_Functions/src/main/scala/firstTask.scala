import math.sin
import math.pow

object firstTask {

  def addFun(x: Int, y: Int): Int ={
    x + y
  }

  def substractFun(x: Int, y: Int): Int ={
    x - y
  }

  def multiplyFun(x: Int, y: Int): Int ={
    x * y
  }

  def divideFun(x: Int, y: Int): Int ={
    x / y
  }

  def powerFun(x: Int, y: Int): Int ={
    pow(x, y).toInt
  }


  val functionsMap = Map[Char, (Int, Int) => Int]('+' -> addFun, '-' -> substractFun, '*' -> multiplyFun, '/' -> divideFun, '^' -> powerFun)
  val trigonometricFunctionsMap = Map[String, Double => Double]("sin" -> sin)

  def calculator(arr : Array[String]): Unit ={
    if(arr.length == 3)
      println(functionsMap(arr(1).charAt(0))(arr(0).toInt, arr(2).toInt))
    else if(arr.length ==2)
      println(trigonometricFunctionsMap(arr(0))(arr(1).toDouble))
    else
      println("Wrong array!")
  }
}
