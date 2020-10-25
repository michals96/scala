import scala.annotation.tailrec

object fourthClass {
  val firstPoint = (0, 0)
  val secondPoint = (10, 10)

  val listOfPoints = List[(Int, Int)]((11,11), (50, 50), (5,5), (2, 2))

  def isInside(leftBottomCorner: (Int, Int), rightTopCorner: (Int, Int), point: (Int, Int)): Boolean = point._1 >= leftBottomCorner._1 && point._2 >= leftBottomCorner._2 && point._1 <= rightTopCorner._1 && point._2 <= rightTopCorner._2

  def checkListOfPoints(leftBottomCorner: (Int, Int), rightTopCorner: (Int, Int), list : List[(Int, Int)]): Unit ={
    var counter = 0
    @tailrec def fun(list : List[(Int,Int)]): Unit ={
      if(list.nonEmpty){
        if(isInside(leftBottomCorner, rightTopCorner, list.head)){
          print(list.head + " is inside")
        }
        fun(list.tail)
      }
    }
    fun(list)
  }

  def foruthTask(): Unit ={
    checkListOfPoints(firstPoint, secondPoint, listOfPoints)
  }
}

/**
 * Create program which will count number of points, which are inside rectangle created by two different points.
 *
 * Requirements:
 *
 * Create two values, each being a (Int, Int) tuple, which will have X and Y coordinates of points, which will be left bottom and right top corners of rectangle. You can pick (0, 0) and (10, 10) for example.
 * Create list of points (type: List[(Int, Int)]), which will contain points. Make sure that you add some points, which are inside and outside rectangle created by points from bullet number one to check, whether program works correctly.
 * Create tail recursive function (normal recursion = half of points), which will count how many points from List from bullet point 2 are inside rectangle from bullet point 1.
 * Function, which checks, whether point is inside rectangle:
 *
 * def isInside(leftBottomCorner: (Int, Int), rightTopCorner: (Int, Int), point: (Int, Int)): Boolean = point._1 >= leftBottomCorner._1 && point._2 >= leftBottomCorner._2 && point._1 <= rightTopCorner._1 && point._2 <= rightTopCorner._2
 *
 *
 * Hints:
 * Remember about Boolean -> Int conversion.
 * Check what methods List has - they are two, which are very helpful here.
 * Use "@scala.annotation.tailrec" annotation in front of function declaration to make sure it is tail recursive.
 */