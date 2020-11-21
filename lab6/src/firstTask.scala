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

    override def toString: String = s"HORSE: $posx, $posy, $rotation"
  }

  class Car(var xpos: Double, var ypos: Double, var direction: Double) {
    var posx = xpos
    var posy = ypos
    var rotation = direction

    override def toString: String = s"CAR: $posx, $posy, $rotation"
  }

  def runFirstTask(): Unit ={
    val car1 = new Car(0, 0, 0)
    println(car1)

    val betterCar = new Car(0, 0, 0) with RichMoves
    println(betterCar)

    betterCar.forward(5.0)
    betterCar.turnLeft(1.0)
    betterCar.turnBack(1.0)
    betterCar.forward(1.0)
    println(betterCar)

    val runner = new Horse( (1,1), 270) with RichMoves
    println(runner)

    runner.turnLeft(1.0)
    println(runner)
  }
}
