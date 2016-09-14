package org.susuk.daysofcode.cond

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val n = it.take(1).next().toInt

    def isOdd(n: Int): Boolean =
      if ((n % 2) != 0)
        true
      else
        false


    Some(n).map {
      case n if isOdd(n) =>
        "Weird"
      case n if (2 <= n && n <= 5) =>
        "Not Weird"
      case n if (6 <= n && n <= 20) =>
        "Weird"
      case _ =>
        "Not Weird"
    } foreach { s =>
      println(s)
    }
  }
}
