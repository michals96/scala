import trigonometric.calculate
import array.nicePrint
import charArgs.calculateChars
import rectangle.call

object Lab2 {
  def main(args: Array[String]): Unit ={

    val x = Array.ofDim[Int](4,4);
    for (i <- 0 until 4; j <- 0 until 4) x(i)(j) = i+j;

    // calculate(args(0), args(1));
    // nicePrint(x);
    //calculateChars(args(0).charAt(0), args(1).charAt(0))

    call()

  }
}
