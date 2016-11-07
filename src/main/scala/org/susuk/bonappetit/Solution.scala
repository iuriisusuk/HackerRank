package org.susuk.bonappetit

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val List(numberOfItemsOrdered, indexOfNotEatenItem) = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList
    val items = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList
    val charged = it.take(1).next().toInt

    val itemsEaten = items.take(indexOfNotEatenItem) ::: items.drop(indexOfNotEatenItem + 1)
    val cost = itemsEaten.sum / 2
    val diff = charged - cost
    Some(diff) map {
      case d if d > 0 =>
        d.toString
      case d if d == 0 =>
        "Bon Appetit"
    } foreach { answear =>
      println(answear)
    }

    val configMap: Map[String, String] = Map[String, String]("runOnGrid" -> "true")

    val runOnGrid : Boolean = configMap.get("runOnGrid") match {
      case Some("true") => true
      case Some("false") => false
      case _ => false
    }

  }
}
