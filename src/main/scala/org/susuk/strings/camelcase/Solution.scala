package org.susuk.strings.camelcase

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val s = it.take(1).next()

    println(s.count(_.isUpper) + 1)

  }
}

