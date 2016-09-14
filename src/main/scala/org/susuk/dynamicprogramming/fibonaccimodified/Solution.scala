package org.susuk.dynamicprogramming.fibonaccimodified

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val List(t1, t2, n) = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList

    lazy val fibs: Stream[BigInt] = BigInt(t1) #:: BigInt(t2) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 * n._2 }

    println(fibs.take(n).last)
  }
}
