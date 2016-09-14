package org.susuk.cutthesticks

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val sticks = it.take(2).drop(1).map(_.split(" ").map(_.toInt)).flatten.toList

    def cut(sticks: List[Int]): Unit = sticks match {
      case Nil => Nil
      case x :: xs =>
        println(sticks.size)
        val smalletsStick = sticks.min
        val sticksAfterCut = sticks.map(_ - smalletsStick).filter(_ != 0)
        cut(sticksAfterCut)
    }

    cut(sticks)
  }
}
