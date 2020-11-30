object secondTask {

  abstract class abstrT(val l: String)

  case class SPair[+A, +B](x: A, y: B){
    def _1(ti: T1I) = new SPair(ti, this.y)
    def _2(t: T) = new SPair(this.x, t)

    def one: A = x
    def two: B = y
  }
  case class T(val lstr: String) extends abstrT(lstr)

  case class T1I(val key: Int) extends abstrT(key.toString)

  def <<(t: SPair[abstrT,abstrT]) {
    println(""+t.one +" "+ t.two)
  }

  def runSecondTask(): Unit = {
    val r = new SPair(1,3)
    println(""+r.one +" "+ r.two)

    val z = new SPair(T("k1"), T("k2"))
    <<(z) // T(k1) T(k2)

    val k = new SPair(T("k1"), T1I(67))
    <<(k) // T(k1) T1I(67)

    val kk = new SPair(T1I(88765), T1I(67))
    <<(kk) // T1I(88765) T1I(67)

    val krep1 = k._1(new T1I(1))
    <<(krep1) // T1I(1) T1I(67)

    val krep2 = krep1._2(new T("One"))
    <<(krep2) // T1I(1) T(One)
  }
}