import scala.annotation.tailrec
import Math.max
import Math.min

object secondTask {
  def wrapMinMax(list : List[Int]) ={
    @tailrec def minmax(list: List[Int], minVal: Int, maxVal: Int): Tuple2[Int, Int] ={
      if(list.nonEmpty){
        minmax(list.tail, min(list.head, minVal), max(list.head, maxVal))
      }
      else{
        (minVal, maxVal)
      }
    }
    minmax(list, list.head, list.head)
  }

}

/*
Exercise 2
The goal is to write a minmax function that
searches for a minimum and maximum values stored in the list of integers.
The search should be performed in one pass over the list. And it *has to* be a tail recursive solution.
 */