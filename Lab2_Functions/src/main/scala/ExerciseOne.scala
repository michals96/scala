import java.lang.Math.{max, min, pow, sqrt}

object ExerciseOne {
  def calculateShortSide(shortSide : Double, longSide : Double): Double ={
    sqrt(pow(longSide, 2) - pow(shortSide, 2))
  }

  def calculateLongSide(firstSide : Double, secondSide : Double): Double ={
    sqrt(pow(firstSide, 2) + pow(secondSide, 2))
  }

  def longSidePresent(firstSide : Char, secondSide : Char): Boolean ={
    if(List(firstSide, secondSide) contains('c')) true
    else false
  }

  def pythagoreanTriangle(firstSideType: Char, secondSideType: Char, firstSideLength: Double, secondSideLength: Double): Double ={
    if(longSidePresent(firstSideType, secondSideType))
      calculateShortSide(min(firstSideLength, secondSideLength), max(firstSideLength, secondSideLength))
    else
      calculateLongSide(firstSideLength, secondSideLength)
  }
}
