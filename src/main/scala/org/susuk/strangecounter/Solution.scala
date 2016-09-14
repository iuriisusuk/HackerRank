package org.susuk.strangecounter

import scala.annotation.tailrec

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val t = it.take(1).next().toLong

    @tailrec
    def i(count: Long = 3, value: Long = 3, n: Long = t): Long =
      if (n == 0)
        (value)
      else
        i({
          if (value == 1)
            count * 2l
          else
            count
        }, {
          if (value == 1)
            count * 2l
          else
            value - 1l
        }, n - 1l)

    println(i(3l, 4l))
  }
}
