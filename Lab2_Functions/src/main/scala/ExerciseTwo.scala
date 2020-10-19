object ExerciseTwo {

  def niceRowPrint(array : Array[Int]): Unit ={
    print("| ")
    array foreach(
      element => print(element + " ")
    )
    print("|")
    println()
  }

  def nicePrint(array : Array[Array[Int]]): Unit ={
    array foreach(row => niceRowPrint(row))
  }
}
