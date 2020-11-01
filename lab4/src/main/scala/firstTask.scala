import scala.annotation.tailrec

object firstTask {
  def filterList(list: List[String], pred: String => Boolean): List[String] ={
    @tailrec def filterListImpl(sourceList: List[String], returnList: List[String]): List[String] ={
        if(sourceList.isEmpty){
          returnList
        }
        else if(pred(sourceList.head)){
          filterListImpl(sourceList.tail, sourceList.head :: returnList )
        }
        else{
          filterListImpl(sourceList.tail, returnList)
        }
    }
    filterListImpl(list, List[String]())
  }
}

// write filterList function that does filtering for example:
// filterList(List("Hello", "there", "people"), _.contains('p)) will return List("people")

