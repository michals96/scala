import firstTask.print2Darray
import firstTask.sumRow
import firstTask.print1Darray
import firstTask.sumColumn
import firstTask.transposeArray
import firstTask.mergeArrays

object main {
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
  }
}
