object Lab1 {

  def firstTask(): Unit =
  {
    print("Hello world!\n")

  }

  def secondTask(): Unit ={
    // ************ TASK 1 ************************** //
    // Input two numbers (start, end) and print a list
    // of integers that from given distance.
    // val first = if (args.length == 2) args(0).toInt else 0
    // val last = if (args.length == 2) args(1).toInt else args(0).toInt
    // val list = List.range(first, last);

    // list.foreach(number => print(s"$number"))
  }

  def thirdTask(): Unit ={
    val inventory = List(
      ("rose while star", 12),
      ("sunflower",        3),
      ("orchid",           7),
      ("carnation red",   25),
      ("carnation white",  30)
    )

    printTuplelist(inventory)
  }

  def printTuplelist(value: List[(String, Int)]): Unit ={
    value.foreach(item => println(f"${item._1}%20s: ${item._2}"))
  }

  def main(args: Array[String]): Unit = {

    firstTask();
    secondTask();
    thirdTask();

  }
}