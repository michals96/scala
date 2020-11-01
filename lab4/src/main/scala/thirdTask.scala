import scala.annotation.tailrec

object thirdTask {
  def partition(list: List[Int], predicate: Int => Boolean): List[List[Int]] = {
    var trueList: List[Int] = Nil
    var falseList: List[Int] = Nil
    @tailrec def acc(inList: List[Int]): Any = {
      if (inList.isEmpty) { return }
      predicate(inList.head) match {
        case true  => trueList = trueList :+ inList.head
        case false => falseList = falseList :+ inList.head
      }
      acc(inList.tail)
    }
    acc(list)
    List(trueList, falseList)
  }
}