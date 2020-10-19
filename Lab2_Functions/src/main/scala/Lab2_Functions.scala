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

/*
Exercise 1
The goal of the first exercise is to solve pythagorean triangle. That is, two sides of the triangle are given and the length of the third one has to be calculated. The sides are provided as the command line arguments as follows:

5 a 4 b

or:

5 c 2 a

where a b c denote which of the sides are given. a, b are the sorter ones adjacent to the right angle and c is the opposite to that angle.

So, if a and c are given the side b needs to be calculated etc.

To set command line args in IJ use menu: Run -> Edit Configurations |-> Set program arguments field

Exercise 2
We have a 2D array:
  val x = Array.ofDim[Int](4,4);
  for ( i <- 0 until 4; j <- 0 until 4) x(i)(j) = i+j
  or one like this:
  val y = Array.ofDim[Int](4,5);
  for ( i <- 0 until 4; j <- 0 until 5) y(i)(j) = i*j
  We want to have a function: nicePrint taking that array as an argument and making nice printout like this:
| 0 1 2 3 |
| 1 2 3 4 |
| 2 3 4 5 |
| 3 4 5 6 |
or this:
| 0 1 2 3 4 |
| 1 2 3 4 5 |
| 2 3 4 5 6 |
| 3 4 5 6 7 |
Each row has to be printed by an additional, inner function called niceRowPrint.
 */