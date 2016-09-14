package org.susuk.greedy.gridchallenge

import scala.collection.mutable.ListBuffer

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val testCasesNumber = it.take(1).next().toInt

    var res = ListBuffer[String]()

    (1 to testCasesNumber).foreach { n =>
      val dimension = it.take(1).next().toInt
      val rows = it.take(dimension).toList
      var yes = true
      val sortedRows = rows.map(_.sorted).toArray
      //      sortedRows foreach println

      for (i <- 0 to rows.size - 1) {
        for (j <- 0 to rows.size - 2) {
          //          println(sortedRows(j).charAt(i))
          //          println(sortedRows(j).charAt(i) <= sortedRows(j + 1).charAt(i))
          //          println(sortedRows(j + 1).charAt(i))

          yes &= sortedRows(j).charAt(i) <= sortedRows(j + 1).charAt(i)

        }
      }

      res += (if (yes) "YES" else "NO")
    }

    println(res.mkString("\n"))
  }

}
