object thirdTask {

  def addFun(x: Int, y: Int): Int ={
    x + y
  }

  def substractFun(x: Int, y: Int): Int={
    x - y
  }

  def multiplyFun(x: Int, y: Int): Int={
    x * y
  }

  def divideFun(x: Int, y: Int): Int={
    x / y
  }

  val functionsMap = Map[Char, (Int,Int) => Int]('+' -> addFun, '-' -> divideFun, '*' -> multiplyFun, '/' -> substractFun)

  def solveEquation(equation : String): Unit ={
    val equationArray = equation.split(" ")
    print(functionsMap(equationArray(1).charAt(0))(equationArray(0).toInt, equationArray(2).toInt))
  }
}
/**
 * Create program which will be able to solve mathematical equations
 * (just addition, substraction, multiplication and division) from string form.
 *
 * Requirements:
 *
 * You have to have 4 functions, each accepting two integers and returning one integer,
 * which is result of mathematical operation. Division operates on Integers and returns Integer too.
 *
 * Keep these functions in Map[Char, (Int, Int) => Int], where char is sign of operation
 * and function is one of the functions from point number 1.
 *
 * You have to have one function called "solveEquation" which accepts string with
 * equation as parameter and can determinate and solve all equation types
 * (there's method in String class, which divide string to Array[String] by character,
 * use REPL to find it, it should be rather easy :) ).
 * So in the nutshell it has to divide string into 3 pieces
 * (two Ints and one char, which determines the operation type),
 * pick operation from Map, use the function returned by map on two Ints and return the result.
 */