import scala.annotation.tailrec

object firstTask {
  def merge(firstList: List[Int], secondList: List[Int]): List[Int] ={
    @tailrec def mergeImpl(sourceList: List[Int], targetList: List[Int], returnList: List[Int]): List[Int] ={
      if(sourceList.isEmpty || targetList.isEmpty){
        returnList
      }
      else{
        mergeImpl(sourceList.tail, targetList.tail, sourceList.head :: targetList.head :: returnList)
      }
    }
    mergeImpl(firstList, secondList, List[Int]())
  }
}
/*
Exercise 1

The goal is to write tail-recursive function that merges two lists as in the examples below:
 println(merge( List(1,3,5,7,9), List(2,4,6,8,10) ))

  println(merge( List(1,5,6), List(2,2,9) ))

  println(merge( List(1,5,6,7), List(2,2,9) ))

// expected result (order is not relevant)

List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

List(1, 2, 5, 2, 6, 9)

List(1, 2, 5, 2, 6, 9)

Notice that if the lists are of different length the merging progresses only until exhaustion of elements in the shorter one.

In the implementation only three list methods can be used: head, tail and isEmpty and one of the concatenation.
 */