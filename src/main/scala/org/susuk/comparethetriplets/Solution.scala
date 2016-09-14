package org.susuk.comparethetriplets

object Solution {

  def main(args: Array[String]) {
    val it = io.Source.stdin.getLines()
    val List(aliceRating, bobRating) = it.take(2).map(_.split(" ").map(_.toInt)).toList

    val res = aliceRating.zip(bobRating).map {
      case (a, b) if a > b => (1, 0)
      case (a, b) if a < b => (0, 1)
      case _ => (0, 0)
    } reduce {
      (diff1, diff2) => (diff1._1 + diff2._1, diff1._2 + diff2._2)
    }

    println("" + res._1 + " " + res._2)
  }
}

