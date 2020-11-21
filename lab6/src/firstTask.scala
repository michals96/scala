object firstTask {
  trait RichMoves {

    var posx: Double
    var posy: Double
    var rotation: Double

    def turnLeft(phi: Double): Unit = { rotation = rotation + phi }
    def turnRight(phi: Double): Unit = { rotation = rotation - phi }
    def turnBack(phi: Double): Unit = { rotation = -rotation }
    def forward(p: Double): Unit = {
      posx = posx + p*Math.cos(rotation)
      posy = posy + p*Math.sin(rotation)
    }
  }

  class Horse(var mypos: (Double, Double), var whereHeading: Double) {
    var posx = mypos._1
    var posy = mypos._2
    var rotation = whereHeading

    override def toString: String = s"$posx, $posy, $rotation"
  }

  def runFirstTask(): Unit ={
    /*val car1 = new Car(0, 0, 0)
    println(car1)

    val betterCar = new Car(0, 0, 0) with RichMoves
    println(betterCar)
    betterCar.forward(5.0)
    betterCAr.turnLeft
    betterCar.turnBack
    betterCar.forward(1)
    println(betterCar)*/

    val runner = new Horse( (1,1), 270) with RichMoves
    println(runner)
  }
}
