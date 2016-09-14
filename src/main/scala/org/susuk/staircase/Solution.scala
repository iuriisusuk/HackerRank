package org.susuk.staircase

object Solution {

  def main(args: Array[String]) {
    val it = io.Source.stdin.getLines()
    val size = it.take(1).next().toInt

    for(stair <-  1 to size) {
      println(" " * (size - stair) + "#" * stair)
    }
  }
}
