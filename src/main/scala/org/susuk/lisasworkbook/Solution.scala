package org.susuk.lisasworkbook

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val List(chaptersNumber, maxProblemsNumberPerPage) = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList
    val problemsNumberPerChapter = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList

    val pagesWithProblems = problemsNumberPerChapter.map { problem =>
      if (problem == 1)
        Vector(Vector(1))
      else
        (1 to problem).grouped(maxProblemsNumberPerPage)
    }.flatten

    println(pagesWithProblems.zip(1 to pagesWithProblems.size).count {
      case (v, index) if (v.contains(index)) => true
      case _ => false
    })

  }
}
