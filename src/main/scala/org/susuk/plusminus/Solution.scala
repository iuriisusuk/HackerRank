package org.susuk.plusminus

object Solution {

  def main(args: Array[String]) {
    val it = io.Source.stdin.getLines()
    val numbers = it.take(2).drop(1).map(_.split(" ").map(_.toInt)).flatten.toList
    val positive = numbers.count(_ > 0)
    val negative = numbers.count(_ < 0)
    val zero = numbers.count(_ == 0)

    val size = BigDecimal(numbers.size)
    println((BigDecimal(positive) / size).setScale(6, BigDecimal.RoundingMode.HALF_UP))
    println((BigDecimal(negative) / size).setScale(6, BigDecimal.RoundingMode.HALF_UP))
    println((BigDecimal(zero) / size).setScale(6, BigDecimal.RoundingMode.HALF_UP))

  }
}
