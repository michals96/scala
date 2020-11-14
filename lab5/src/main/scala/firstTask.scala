package main.scala

object firstTask {

  class ExpensesList(){

    var expensesList = List[Expense]()

    def +=(that: Expense): Unit ={
      expensesList = that :: expensesList
    }

    def printList(): Unit = expensesList.foreach(println)

    def sum(): Double={
      var counter = 0.0
      expensesList.foreach(counter += _.amount)
      counter
    }

    def max(): Double={
      var max = 0.0
      for(item <- expensesList) if (item.amount > max) max = item.amount
      max
    }
  }

  object ExpensesList{
    def apply() = new ExpensesList()
  }

  class Expense(val amount:Double, val name:String, val category:String){
    override def toString: String ={
      amount.toString() + " " + name + " " + category
    }
  }

  object Expense{
    def apply(amount:Double, name:String, category:String) = new Expense(amount, name, category)
  }

  def runFirstTask(): Unit ={
    val el = ExpensesList()

    el += Expense(5, "Bread", "food") // amount, item name, category
    el += Expense(3.2, "Tomatoes", "food") // amount, item name, category

    el.printList()

    println( el.sum )
    println( el.max )
  }

}

// Dwie klasy do obslugi codziennych wydatkow
// Jedna trzyma informacje o pojedynczym wypadku (Expense) -> klasa funkcyjna
// Druga klasa to ExpensesList trzymająca wszystkie Expense
// Mozemy: dodac wydatek, wylistowac dodatki, zsumowac wydatki