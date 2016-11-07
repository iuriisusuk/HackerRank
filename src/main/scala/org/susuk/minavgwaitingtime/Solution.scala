package org.susuk.minavgwaitingtime

import scala.annotation.tailrec

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val numberOfCustomers = it.take(1).next().toInt
    val customers = it.take(numberOfCustomers).map(_.split(" ").map(_.toInt)).toArray

    val timesOfOrder = customers.map(_ (0))
    val sortedTimesToCook = customers.map(_ (1)).sorted

    val customersSortedByTimeToCook = timesOfOrder.zip(sortedTimesToCook)

    @tailrec
    def avgWaitingTime(customers: Array[(Int, Int)], waitingTimeAcc: Int = 0, timeToCookAcc: Int = 0): Int = {
      if (customers.isEmpty)
        waitingTimeAcc / numberOfCustomers
      else {
        val (timeOfOrder, timeToCook) = customers.head
        val acc = timeToCookAcc + timeToCook
        val waitingTime = acc - timeOfOrder
        avgWaitingTime(customers.tail, waitingTimeAcc + waitingTime, acc)
      }
    }

    println(avgWaitingTime(customersSortedByTimeToCook))
  }
}