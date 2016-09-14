package org.susuk.strings.stringconstruction

import com.codahale.metrics.MetricRegistry

import scala.collection.mutable.ListBuffer

object Solution extends nl.grons.metrics.scala.InstrumentedBuilder {

  val metricRegistry: MetricRegistry = new MetricRegistry

  private[this] val calc = metrics.timer("calc")

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val sNumber = it.next().toInt

    var res = ListBuffer[String]()

    it.take(sNumber).foreach { str =>
      var s = str
      var money = 0
      val length = s.length

      val p = new StringBuilder
      p ++= s.substring(0, 2)
      s = s.substring(2)
      money += 2

      def substr(str: String) = for {
        start <- 0 to str.length - 2
        end <- start + 2 to str.length
      } yield str.substring(start, end)

      //      println("init p: " + p)
      while (p.size != length) {
        //        println(substr(p.toString()))
        var substrings = IndexedSeq[String]()
        calc.time {
          substrings = substr(p.toString()).filter(s.contains(_)).sortBy(_.length)
        }
        val substring: String = substrings.headOption.getOrElse("")
        //        println("substr: " + substring)
        if (substring.nonEmpty) {
          p ++= substring
          val start = s.indexOf(substring)
          val end = start + substring.length
          s = s.substring(start, end)
          //          println("nonempty " + p + "-" + s)
        } else {
          if (s.nonEmpty) {
            p += s.head
            s = s.substring(1)
          }
          money += 1
          //          println("empty " + p + "-" + s + "-" + money)
        }
      }

      res += money.toString
    }

    println(res.mkString("\n"))

  }
}
