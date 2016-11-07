package org.susuk.greedy.luckbalance

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val List(numberOfPreliminaryContests, maxNumberOfImportantContests) = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList


    val contests = it.take(numberOfPreliminaryContests).map(_.split(" ").map(_.toInt).toList).toList

    //    implicit object PersonOrdering extends Ordering[List[Int]] {
    //      def compare(x: List[Int], y: List[Int]): Int = x(0) - y(0)
    //    }

    val (notImportant, important) = contests.partition(_ (1) == 0)
    val importantSorted = important.sortBy(_ (0))
    val importantToLose = importantSorted.takeRight(maxNumberOfImportantContests)
    val importantToWin = importantSorted.dropRight(maxNumberOfImportantContests)

    //    val min = contests.take(maxNumberOfImportantContests).minBy(_(0))
    //    val filtered = contests.filterNot(_ == min)
    //    val sum = filtered.map(_(0)).sum - min(0)
    //    println(filtered)
//    println(importantToLose + " and sum " + importantToLose.map(_ (0)).sum)
//    println(importantToWin + " and sum " + importantToWin.map(_ (0)).sum)
//    println(notImportant + " and sum " + notImportant.map(_ (0)).sum)
    println(importantToLose.map(_ (0)).sum + notImportant.map(_ (0)).sum - importantToWin.map(_ (0)).sum)

  }
}
