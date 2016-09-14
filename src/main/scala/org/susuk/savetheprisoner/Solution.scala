package org.susuk.savetheprisoner

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val t = it.take(1).next().toInt

    val testCases = it.take(t).map(_.split(" ").map(_.toLong))

    val res = testCases.map { testCase =>
        testCase.toList match {
          case List(n: Long, m: Long, s: Long) =>
            var currPrisonerId: Long = s
            var candiesLeft: Long = m

            while (candiesLeft != 1) {
              if (currPrisonerId == n)
                currPrisonerId = 1
              else
                currPrisonerId += 1

              candiesLeft -= 1
            }

            currPrisonerId
        }
      }

    println(res.mkString("\n"))
  }
}
