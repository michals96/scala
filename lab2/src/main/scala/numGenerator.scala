import Math.sqrt

object numGenerator {
  def printNotSquares(range: Int): Unit ={
    for(i <- 1 to range){
      val sqrtVal = sqrt(i)
      if(sqrtVal % 1 != 0) print(i + " ")
      else None
    }
  }
}
