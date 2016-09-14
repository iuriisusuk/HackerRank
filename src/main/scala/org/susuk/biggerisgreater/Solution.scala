package org.susuk.biggerisgreater

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val n = it.take(1).next().toInt
    it.take(n).toList.foreach(str => println(str.sorted))
  }
}
