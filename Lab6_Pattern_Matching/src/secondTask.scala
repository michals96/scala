object secondTask {
  def findClosing(str: String, start: Int, delim: Char='<'): Int = {

    var counter  = 1

    for ( i <- start until str.length ){
      val current = str(i)

      counter = counter +
      (if ( current == '>' ) 1
      else if ( current == '<') -1
      else 0)

      if ( counter == 0 )
        return i
    }
    return str.length
  }

  def tagContent(str: String ) =  str.substring(2, findClosing(str, 2))

  def splitTags(str:String) =    str.replaceAll("<(.)>", "<|$1>").split('|').toList

  def parseToTree(str: String): Option[String] = {
    Some("123")
  }
  def runSecondTask(): Unit ={
    println( parseToTree("t>1234<"))
    // Text(t,1234)

    /*
    println( parseToTree("b>abcd<"))
    // Text(b,abcd)

    println( parseToTree("p>b>test1<b>test2<<"))
    // Composite(p,List(Text(b,test1), Text(b,test2)))*/

  }
}
/*
Exercise 2

The goal is to write a simple markup language parser using extractors. Specifically, the parseToTree function that converts the string like in an example has to be written.
Using match case expression then write helper that would convert objects tree to HTML:

val input =

      """p>

        p>

         h>Header<

        <

        p> t>Par 1<

         h>Par title<

         b>bold<

         i>italic<

        <

        p>t>simple par with more text<<

       <

    """.stripMargin.replaceAll("[\n]", "").replaceAll("< +(.)>", "<$1>").replaceAll("p> +", "p>").replaceAll("< +<", "<<")

    println( input )
    val parsed = parseToTree(input)
    println( parsed )
    //Composite(p,List(Composite(p,List(Text(h,Header))), Composite(p,List(Text(t,Par 1))), Text(h,par title), Text(b,bold), Text(i,italic), Composite(p,List(Text(t,simple par with more text)))))

    println( toHTML(parsed))
    // <p><p><h>header</h></p>  <p><t>par 1</t></p>  <h>par title</h>  <b>bold</b>  <i>italic</i>  <p><t>simple par wiht more text</t></p></p>*/