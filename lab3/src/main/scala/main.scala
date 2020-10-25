import firstTask.print2Darray
import firstTask.sumRow
import firstTask.print1Darray
import firstTask.sumColumn
import firstTask.transposeArray
import firstTask.mergeArrays
import scala.math.{Pi}
import thirdTask.solveEquation
import fourthClass.foruthTask

object main {

  def pi = Pi
  def pi(pi : Double) = pi*Pi
  def repN(iterations : Int, x:Int => Int, arg: Int): Int ={
    if(iterations != 1){
      x(repN(iterations - 1, x, arg))
    }
    else x(arg)
  }
  def main(args: Array[String]): Unit ={
    val x = Array.ofDim[Int](4,5);
    for(i <- 0 until 4; j<-0 until 5) x(i)(j) = i+j

    print2Darray(x)
    print1Darray((sumRow(x)))
    println()
    print1Darray(sumColumn(x))
    println()
    print2Darray(transposeArray(x))
    println()
    print2Darray(mergeArrays(x,x))

    println("TASK2")

    println(pi)
    println(pi(pi))
    println(pi(pi(pi)))
    println(repN(5, (x:Int) => 2*x, 1))

    solveEquation(("1 + 2"))
    println()
    foruthTask()
  }
}

/*
The goal is to write such function that the example code below compiles and gives expected results (on the right). Reminder, no external materials are allowed. 
    println( pi )
    println( pi(pi) ) //multiplication
    println( pi(pi(pi)) )
    println(repN(5,  (x: Int) => 2*x , 1 )) // repeat function application N times i.e. f(f(f(f(f(1))))), 1 the argument of the ﬁrst invocation
 */