package org.susuk.strings.marsexploration

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val s = it.take(1).next()

    var n: Int = 0
    s.grouped(3).foreach {
      sos =>
        if (sos(0) != 'S')
          n += 1
        if (sos(1) != 'O')
          n += 1
        if (sos(2) != 'S')
          n += 1
    }

    println(n)

  }
}
