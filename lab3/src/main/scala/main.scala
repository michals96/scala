import firstTask.print2Darray

object main {
  def main(args: Array[String]): Unit ={
    val x = Array.ofDim[Int](4,5);
    for(i <- 0 until 4; j<-0 until 5) x(i)(j) = i+j

    print2Darray(x)
  }
}
