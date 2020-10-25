object firstTask {

  def print2Darray(arr : Array[Array[Int]]){
    arr foreach{row => row foreach print; println}
  }

  def print1Darray(arr : Array[Int]): Unit ={
    
  }

  def sumRow(arr : Array[Array[Int]]): Array[Int] ={
    var sumRows = Array.ofDim[Int](4)

    for(i <- 0 until 4){
      for(j<-0 until 5){
        sumRows.update(i, sumRows(i) + arr(i)(j))
      }
    }

    sumRows
  }

  def sumColumn(arr : Array[Array[Int]]): Unit ={

  }
}
