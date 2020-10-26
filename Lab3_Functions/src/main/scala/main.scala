import firstTask.calculator
import secondTask.wrapMinMax

object main {
  def main(args: Array[String]): Unit ={

    val firstEquation = Array("1", "+", "1")
    val secondEquation = Array("2", "^", "3")
    val thirdEquation = Array("sin", "0.23")
    val errorEquation = Array("1", "-", "2", "+", "1")

    calculator(firstEquation)
    calculator(secondEquation)
    calculator(thirdEquation)
    calculator(errorEquation)

    val listOfIntegers = List[Int](1, 2, 3, 10, 100, 15)
    val secondListOfIntegers = List[Int](1, 2, -3, 10, 100, 9915)
    print(wrapMinMax(listOfIntegers))
    print(wrapMinMax(secondListOfIntegers))
  }
}
