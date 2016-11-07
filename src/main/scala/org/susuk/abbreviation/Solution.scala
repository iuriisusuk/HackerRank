package org.susuk.abbreviation

import scala.collection.mutable.ListBuffer

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val testCases = it.take(1).next().toInt

    val res = ListBuffer[String]()

    (1 to testCases) foreach { i =>
      val List(a, b) = it.take(2).toList


      val aU = a.map(_.toUpper)

      Some(aU.contains(b))
        .map {
          case true =>
            val start = aU.indexOf(b)
            Some((a.take(start) + a.drop(start + b.length)).forall(_.isLower)).map {
              case true => "YES"
              case false => "NO"
            }.get
          case false =>
            val onlyUpperCase = a.filterNot(_.isLower)
            //println(i + s": ${onlyUpperCase}")
            Some(onlyUpperCase.contains(b)).map {
              case true => "YES"
              case false => "NO"
            }.get
        } foreach { str =>
        res += str
      }
    }

    res foreach println

  }
}
