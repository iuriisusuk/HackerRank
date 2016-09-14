package org.susuk.beautifultriplets

import scala.collection.mutable.ListBuffer

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val List(_, d) = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList

    val a: Array[Int] = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toArray
    val triplets = new ListBuffer[Boolean]()

    for {
      i <- 0 to a.size - 1
      j <- 1 to a.size - 1
      k <- 2 to a.size - 1
      if (i < j && j < k)
    } {
      val ajminai = a(j) - a(i)
      val akminaj = a(k) - a(j)
      triplets += ajminai == akminaj && akminaj == d
    }

//    println(triplets)
    println(triplets.count(_ == true))
  }
}
