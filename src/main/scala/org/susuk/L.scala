package org.susuk

import scala.collection.mutable.ArrayBuffer

object L extends App {

  val fruits: List[String] = "apples" :: "oranges" :: "pears" :: Nil

  val List(a, b, c) = fruits
  println(a)

  val st :: nd :: rd = fruits
  println(st)

  val head :: tail = fruits
  println(head)

  Nil ::: List("")


  import scala.collection.mutable.ListBuffer
  val ls = ListBuffer[Int]()
  ls += 2
  ls += 3
  1 +=: ls

  println(ls)

  val arr = ArrayBuffer[Int]()
  arr += 1
  2 +=: arr
  3 +=: arr

  println(arr)

  val set = Set[Int]()
  println(set + 1 + 2 + 3 - 1)

  val metalCost = 20.75d
  val tipPercent = 10
  val taxPercent = 3
  val tip: Double = 12d * (tipPercent / 100d)
  val tax: Double = 12d * (taxPercent / 100d)

  println(tip)
  println(tax)
  val totalCost = metalCost + tip + tax
  println(totalCost)
  println(s"The total meal cost is ${Math.round(totalCost)} dollars.")
  // The total meal cost is 23 dollars.
}
