package org.susuk.circulararrayrotation

import scala.collection.mutable.ArrayBuffer

object Solution {

  def main(args: Array[String]) {
    val it = io.Source.stdin.getLines()
    val List(n, k, q) = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList
    var arrB = it.take(1).map(_.split(" ").map(_.toInt)).flatten.to[ArrayBuffer]
    val m = it.take(q).map(_.toInt).toList

    for (i <- 1 to k) {
      val l = arrB(arrB.size - i)
      l +=: arrB
    }

    m.foreach { i =>
      println(arrB(i))
    }
  }
}
