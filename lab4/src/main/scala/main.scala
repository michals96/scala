import firstTask.filterList
import secondTask.calculate
import thirdTask.partition
import fourthTask.{ToDoItem, ToDoList}
object main {
  def main(args: Array[String]): Unit ={
    val predicate = (x: Int) => x % 2 == 0
    println("Hello world!")
    println(filterList(List("Hello", "there", "people"), _.contains('p')))
    calculate()
    println(
      partition(
        list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
        predicate = predicate
      )
    )

    val toDoList = new ToDoList()

    toDoList + new ToDoItem("Clean carpet", "2020-11-01")
    toDoList + new ToDoItem("Wash dishes", "2020-11-02")
    toDoList + new ToDoItem("Learn Scala", "2020-10-28")

    println(toDoList)
    println()

    toDoList.markAsDone(0)

    println(toDoList)
    println()

    toDoList.removeDone()

    println(toDoList)
    println()
  }
}
