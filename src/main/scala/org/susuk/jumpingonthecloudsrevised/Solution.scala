package org.susuk.jumpingonthecloudsrevised

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val List(n, k) = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList
    val clouds = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList

    var e = 100
    e -= 1
    var cloudI = (0 + k) % n
    if (clouds(cloudI) == 1)
      e -= 2

    while (cloudI != 0 || e == 0) {
      e -= 1
//      println("E=" + e)
      cloudI = (cloudI + k) % n
//      println("id=" + cloudI)
      if (clouds(cloudI) == 1)
        e -= 2
    }


    println(e)
  }
}
