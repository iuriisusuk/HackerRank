package org.susuk.divisiblesumpairs

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val List(n, k) = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList
    val l = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList

    var i = 0
    var count = 0
    for (a1 <- l){
      i += 1
      for (a2 <- l.drop(i)) {
        if (((a1 + a2) % k == 0))
          count += 1
      }
    }

    println(count)
  }
}
