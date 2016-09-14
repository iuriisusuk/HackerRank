package org.susuk.search.sherlockandarray

import scala.collection.mutable.ListBuffer
import scala.concurrent.Future
import scala.util.control.Breaks._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await


object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val testCasesNumber = it.take(1).next().toInt

    var res = ListBuffer[String]()
    var fs = ListBuffer[(Int, Future[List[Boolean]])]()


    (1 to testCasesNumber).map { n =>
      val elementsNumber = it.take(1).next().toInt
      val elements = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toArray

      var yes = false

      val futures = ListBuffer[Future[Boolean]]()

      //res += (if (yes) "YES" else "NO")

      for (i <- 0 to elements.size - 1) {
        val lF = Future(elements.take(i).sum)
        val rF = Future(elements.drop(i + 1).sum)

        futures += (for {
          lSum <- lF
          rSum <- rF
        } yield {
          lSum == rSum
        })
      }

      fs.+=((n, Future.sequence(futures.toList)))
    }


    fs.foreach { case (n, f) =>

    }

    println(res.mkString("\n"))
  }

}