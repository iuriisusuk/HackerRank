package org.susuk.simplearraysum

object Solution {

  def main(args: Array[String]) {
    val it = io.Source.stdin.getLines()
    val res = it.take(2).drop(1).flatMap(_.split(" ")).map(_.toLong).sum
    println(res)
  }
}
