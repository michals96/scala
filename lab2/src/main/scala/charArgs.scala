object charArgs {

  def convertToLower(x : Char): Char = {
    if (x.isUpper) x.toLower
    else x
  }

  def calculateChars(startChar : Char, endChar : Char): Unit ={
    var x:Char = convertToLower(startChar);
    var y:Char = convertToLower(endChar)

    var xVal:Int = x.toInt
    var yVal:Int = y.toInt

    for( i <- Math.min(xVal, yVal) to Math.max(xVal, yVal)){
      println(i.asInstanceOf[Char])
      println()
    }

    var it:Int = Math.min(xVal, yVal)
    var i:Int = 0
    while (it <= Math.max(xVal, yVal))
      {
        println((Math.min(xVal, yVal) + i).asInstanceOf[Char])
        println()
        it = it + 1
        i = i +1
      }
  }
}
