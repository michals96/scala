package main.scala

object fourthTask {

  abstract class Shape(val center: (Int, Int), val size: Int) {
    def toString: String
  }

  class Triangle(center: (Int, Int), val rotation: Int, size: Int) extends Shape(center, size) {
    override def toString: String = f"Trangle of side size $size rotation $rotation at $center"
  }

  object Triangle {
    def apply(center: (Int, Int), rotation: Int, size: Int): Triangle = new Triangle(center, rotation, size)
  }

  class Square(center: (Int, Int), size: Int) extends Shape(center, size) {
    override def toString: String = f"Square of side size $size rotation at $center "
  }

  object Square {
    def apply(center: (Int, Int), size: Int): Square = new Square(center, size)
  }

  class ColorSquare(center: (Int, Int), size: Int, var color: (Int, Int, Int)) extends Square(center, size) with HasColor {
    override def toString: String = f"ColorSquare of side size $size rotation at $center with color r:${color._1} g:${color._3} b:${color._3}"
  }

  object ColorSquare {
    def apply(center: (Int, Int), size: Int, color: (Int, Int, Int)): ColorSquare = new ColorSquare(center, size, color)
  }

  trait HasColor {
    var color: (Int, Int, Int)

    def setColor(x: Int, y: Int, z: Int): Unit = {
      color = new Tuple3[Int, Int, Int](x, y, z)
    }

    def increaseRedBy(arg: Int): Unit = { // b.decreaseGreenBy(0.3) etc
      var newVal = color._1 * arg
      color = color.copy(_1 = newVal)
    }
  }

  class ColorTriangle(center: (Int, Int), rotation: Int, size: Int, var color: (Int, Int, Int)) extends Triangle(center, rotation, size) with HasColor {
    override def toString: String = f"ColorTrangle of side size $size rotation $rotation at $center with color r:${color._1} g:${color._2} b:${color._3}"
  }

  object ColorTriangle {
    def apply(center: (Int, Int), rotation: Int, size: Int, color: (Int, Int, Int)): ColorTriangle = new ColorTriangle(center, rotation, size, color)
  }

  def runFourthTask(): Unit = {
    val a = ColorTriangle(center = (0, 0), rotation = 30, size = 25, color = (20, 20, 120))

    a.setColor(100, 0, 70)
    println(a.color)
    a.increaseRedBy(2)

    val b = ColorSquare(center = (3, 3), size = 12, color = (20, 20, 120))
    b.setColor(10, 255, 0)

    val shapes = List[Shape](Triangle((0, 0), 90, 50), a, Square((3, -3), 10), b)
    println(shapes.mkString("\n"))
  }
}
