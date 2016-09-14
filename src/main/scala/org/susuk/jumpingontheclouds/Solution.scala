package org.susuk.jumpingontheclouds

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val clouds = it.take(2).drop(1).map(_.split(" ").map(_.toInt)).flatten.toList

    def jumps(clouds: List[Int], n: Int = 0): Int = clouds match {
      case Nil => n
      case x :: Nil => n + 1
      case x :: y :: xs =>
        if (y == 0)
          jumps(clouds.drop(2), n + 1)
        else
          jumps(clouds.drop(1), n + 1)
    }

    println(jumps(clouds.drop(1)))
  }
}
