package org.susuk.kangaroo

import scala.annotation.tailrec

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val List(x1, v1, x2, v2) = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList


    val meet =
      if (v1 <= v2)
        "NO"
      else
        "YES"

      println(meet)

  }
}
