import firstTask.filterList
import secondTask.calculate

object main {
  def main(args: Array[String]): Unit ={
    println("Hello world!")
    println(filterList(List("Hello", "there", "people"), _.contains('p')))
    calculate()
  }
}
