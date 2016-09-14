package org.susuk.search.icecreamparlor

import scala.collection.mutable.ListBuffer

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val testCasesNumber = it.take(1).next().toInt

    var res = ListBuffer[String]()

    (1 to testCasesNumber).foreach { n =>
      val money = it.take(1).next().toInt
      val flavorsNumber = it.take(1).next().toInt
      val flavorsCosts = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toArray

      res += (for {
        i <- 0 to flavorsCosts.size - 1
        j <- 1 to flavorsCosts.size - 1
        if i != j && (flavorsCosts(i) + flavorsCosts(j)) == money
      } yield {
        if (i < j)
          s"${i + 1} ${j + 1}"
        else
          s"${j + 1} ${i + 1}"
      }).head

    }

    println(res.mkString("\n"))
  }
}
