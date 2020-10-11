object Hello {
  def main(args: Array[String]): Unit = {

    print("Hello world!")


    // ************ TASK 1 ************************** //
    // Input two numbers (start, end) and print a list
    // of integers that from given distance.
    val first = if (args.length == 2) args(0).toInt else 0
    val last = if (args.length == 2) args(1).toInt else args(0).toInt
    val list = List.range(first, last);

    list.foreach(number => print(s"$number"))
  }
}