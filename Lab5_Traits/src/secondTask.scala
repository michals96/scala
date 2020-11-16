object secondTask {

}

/*Exercise 2

The goal for the first exercise is to prepare two traits that will be used to add additional info to printed messages.

  TimeStamp will prefix the printed message with the time stamp:

val today = Calendar.getInstance().getTime() (from java.util.Calendar can be used to obtain current time)

The Quote trait that will wrap printed text in "".



val logger = Loger with Quote with TimeStamp

logger.pprint("Hello there")

Tue Dec 01 14:13:23 CET 2017 "Hello world"



The structure of classes should contain:

abstract base class - having an abstract pprint

Quote trait -

TimeStamp trait -

Logger class

val l = new Logger with Quote with TimeStamp

l.pprint("Hello world")

println("")

val ql = new Logger with Quote

ql.pprint("No date, just quote")

println("")

val tl = new Logger with TimeStamp

tl.pprint("Some time stamped message")

println("")

val plain = new Logger

plain.pprint("Just he text")

println("") */

/*

 Tue Nov 27 17:15:56 CET 2018 "Hello world"

"No date, just quote"

Tue Nov 27 17:15:56 CET 2018 Some time stamped message

Just he text

 */