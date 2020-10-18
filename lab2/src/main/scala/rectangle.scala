object rectangle {
  val firstRectangle = (10, 20)
  val secondRectangle = (15, 30)
  val thirdRectangle = (200, 150)
  var fourthRectangle = (20, 5)

  val firstList = firstRectangle :: secondRectangle :: thirdRectangle :: fourthRectangle :: Nil;
  val secondList = List(firstRectangle, secondRectangle, thirdRectangle, fourthRectangle)
  val thirdList = List.fill(4)(firstRectangle, secondRectangle, thirdRectangle, fourthRectangle)

  def recAreaBiggerThan(myList : List[(Int, Int)], field : Int): List[(Int, Int)] ={
      return myList.filter(rectangle => rectangle._1 * rectangle._2 > field)
    }

  def call(): Unit ={
    println(recAreaBiggerThan(firstList, 200))
  }

}
