object firstTask {

  class Car ( var xpos: Int , var ypos: Int ) {
    var posx = xpos
    var posy = ypos
    override def toString = "Car x: "+posx.toString + " y:"+posy.toString
  }

  class Horse ( var mypos: (Int, Int)) {
    var posx = mypos._1
    var posy = mypos._2
    override def toString = "Horse x: "+posx.toString + " y:"+posy.toString
  }

  trait IntRichMoves{
    var posx: Int
    var posy: Int

    def up():Unit = {posy = posy + 1}
    def right(move: Int):Unit = {posx = posx + move}
    def down(move: Int):Unit = {posy = posy - move}
    def left(move: Int):Unit = {posx = posx - move}

    def here(obj: Car):Unit = {
      posx = obj.posx
      posy = obj.posy
    }

    def zero(): Unit = {
      posx = 0
      posy = 0
    }
  }

  def runFirstTask(): Unit ={
    val car1 = new Car(0, 0)
    println(car1) // Car x: 0 y:0
    val car2 = new Car(1, 0)
    println(car2) // Car x: 1 y:0

    val betterCar = new Car ( 0, 0) with IntRichMoves
    println(betterCar) // Car x: 0 y:0
    betterCar.up()
    println(betterCar) // Car x: 0 y:1
    betterCar.right(3)
    println(betterCar) // Car x: 3 y:1
    betterCar.down(5)
    println(betterCar) // Car x: 3 y:-4
    betterCar.left(5)
    println(betterCar) // Car x: -2 y:-4

    val runner = new Horse( (1,1) ) with IntRichMoves
    println(runner) // Horse x: 1 y:1
    runner.here(betterCar)
    println(runner) // Horse x: -2 y:-4
    runner.zero()
    println(runner) // Horse x: 0 y:0
  }
}

/*
Exercise 1
The goal is to write trait that provides a rich interface for the movements in XY plane.
The trait should provide a number of methods to move around objects that are defined with position x, y (both are integers).
The methods zero, left, right, up, down need to be provided by the trait-based some elementary methods to set/get positions. Also, a method to move with respect to the other point.
 */