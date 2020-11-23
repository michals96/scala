object firstTask {

  class Car ( var xpos: Int , var ypos: Int ){
    override def toString =  "Car x: "+xpos.toString + " y:"+ypos.toString

    def getX(): Int ={
      xpos
    }
    def getY(): Int ={
      ypos
    }
    def setY(x: Int): Unit ={
      ypos = x
    }
    def setX(x: Int): Unit ={
      xpos = x
    }
  }

  class Horse ( var mypos: (Int, Int)){
    override def toString = "Horse x: "+mypos._1.toString + " y:"+mypos._2.toString

    def getX(): Int ={
      mypos._2
    }
    def getY(): Int ={
      mypos._1
    }
    def setY(x: Int): Unit ={
      this.mypos = (this.mypos._1, x)
    }
    def setX(x: Int): Unit ={
      this.mypos = (x, this.mypos._2)
    }
  }

  trait IntRichMoves{
    def getX(): Int
    def getY(): Int
    def setY(x: Int): Unit
    def setX(x: Int): Unit

    def up():Unit = {
      setY(getY() + 1)
    }
    def right(move: Int):Unit = {
      setX(getX() + move)
    }
    def down(move: Int):Unit = {
      setY(getY() - move)
    }
    def left(move: Int):Unit = {
      setX(getX() - move)
    }
    def here(obj: IntRichMoves):Unit = {
      setX(obj.getX())
      setY(obj.getY())
    }
    def zero(): Unit = {
      setX(0)
      setY(0)
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