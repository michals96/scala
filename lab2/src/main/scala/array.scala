object array {

  def niceRowPrint(array : Array[Int]): Unit ={
    array foreach {
      element => print(element);
    }
    println()
  }

  def nicePrint(array : Array[Array[Int]]): Unit ={
    array foreach {
      row => niceRowPrint(row)
    }
  }
}
