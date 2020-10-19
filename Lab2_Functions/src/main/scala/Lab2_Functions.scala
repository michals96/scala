import ExerciseOne.pythagoreanTriangle
import ExerciseTwo.nicePrint

object Lab2_Functions {

  def main(args: Array[String]): Unit ={

    val x = Array.ofDim[Int](4,4);
    for ( i <- 0 until 4; j <- 0 until 4) x(i)(j) = i+j

    println(pythagoreanTriangle(args(1).charAt(0), args(3).charAt(0), args(0).toDouble, args(2).toDouble))

    nicePrint(x)
  }
}
