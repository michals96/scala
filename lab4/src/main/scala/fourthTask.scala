object fourthTask {
  class ToDoItem(what: String, when: String, var done: Boolean = false) {
    override def toString: String = s"$what\t- till $when\t| DONE: $done"
    def markAsDone(): Unit = done = true
  }

  class ToDoList() {
    var list: List[ToDoItem] = Nil
    def +(item: ToDoItem): Unit = list = list :+ item
    def markAsDone(index: Int): Unit = list(index).markAsDone()
    def removeDone(): Unit = list = list.filter(_.done == false)
    override def toString: String = list.map(_.toString).mkString("\n")
  }
}
