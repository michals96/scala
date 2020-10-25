object firstTask {

  def print2Darray(arr : Array[Array[Int]]){
    arr foreach{row => row foreach print; println}
  }

  def print1Darray(arr : Array[Int]): Unit ={
    arr foreach{element => print(element + " ")}
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

  def sumColumn(arr : Array[Array[Int]]): Array[Int] ={
    var sumCols = Array.ofDim[Int](5)

    for(i <- 0 until 4){
      for(j<-0 until 5){
        sumCols.update(j, sumCols(j) + arr(i)(j))
      }
    }

    sumCols
  }

  def transposeArray(arr : Array[Array[Int]]): Array[Array[Int]] ={
    val arrT = Array.ofDim[Int](5,4)

    for(i <- 0 until 4){
      for(j<-0 until 5){
        arrT(j)(i) = arr(i)(j)
      }
    }
    arrT
  }

  def mergeArrays(firstArr: Array[Array[Int]], secondArr: Array[Array[Int]]): Array[Array[Int]] ={
    val mergedArr = Array.ofDim[Int](4,5)
    for(i <- 0 until 4){
      for(j<-0 until 5){
        mergedArr(i)(j) = firstArr(i)(j) + secondArr(i)(j)
      }
    }
    mergedArr
  }
}

/*
Goal is to write functions:
 1) to print this array in the following form:
| 0 1 2 3 4 |
| 1 2 3 4 5 |
| 2 3 4 5 6 |
| 3 4 5 6 7 |
2) obtain two 1D arrays, one containing sum of elements in each row, and second containing sum of elements in each column
3) to create an array that is transposed
4) merge two arrays x and y of identical sizes (here 4x5) so that each element in the resulting array is larger of the corresponding element in x and y

 */
