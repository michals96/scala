object secondTask {
  class MapPoint(val city:String, val longitude:Double, val latitude:Double) {

    override def toString: String ={
      val longitudeSign = if (longitude < 0) "S" else "N"
      val latitudeSign = if ( latitude < 0) "W" else "E"
      city + " " + Math.abs(longitude) + longitudeSign + " " + Math.abs(latitude) + latitudeSign
    }

    def distanceTo(other: MapPoint) : Double = {
      Math.sqrt(Math.pow(other.longitude - longitude, 2) + Math.pow(other.latitude - latitude, 2))
    }

    def -(that: MapPoint): Double ={
     this.distanceTo(that)
    }

    def move(x: Int, y: Int): MapPoint = {
      MapPoint("Nearby " + this.city, this.longitude + x, this.latitude + y)
    }
  }

  object MapPoint {
    def apply(city:String, longitude:Double, latitude:Double) = new MapPoint(city, longitude, latitude)

    def inTheMiddle(firstPoint : MapPoint, secondPoint : MapPoint, str : String): MapPoint={
      MapPoint(str, (firstPoint.longitude + secondPoint.longitude)/2.0, (firstPoint.latitude + secondPoint.latitude)/2.0)
    }
  }

  class Route(var mapPointList: List[MapPoint]){
    override def toString: String ={
      var returnStr = mapPointList(mapPointList.length- 1).toString
      for(i <- 0 until mapPointList.length-1){
        returnStr += " -> " + mapPointList(mapPointList.length - 2 - i).toString
      }
      returnStr
    }

    def addStop(obj:MapPoint): Unit ={
      mapPointList = obj :: mapPointList
    }
  }

  object Route{
    def apply(mapPointList:List[MapPoint]) = new Route(mapPointList)
  }

  def calculate(): Unit ={
    val krk = MapPoint( "Krakow", 50.061389, 19.938333 )
    println( krk )
    val nyc = MapPoint( "NYC", 40.7127, -74.0059 )
    println( nyc )
    val porto = MapPoint( "Porto", 41.162142, -8.621953 )
    val irkutsk = MapPoint( "Irkutsk",  52.283333, 104.283333 )
    println( irkutsk )
    println( porto - irkutsk )
    println( krk - irkutsk )
    println( krk.distanceTo(porto) )
    val mp = MapPoint.inTheMiddle( krk,  irkutsk, "Somewhere in Russia" )
    println( mp+" "+( mp - krk ) +" "+ ( mp - irkutsk ) )
    val r = Route( List(krk, nyc, porto) )
    println( r )
    r.addStop( porto.move( 1, 1 ) )
    r.addStop( irkutsk )
    println( r )
  }
}
