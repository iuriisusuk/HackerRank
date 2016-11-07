package org.susuk.minimumdistances

object Solution {
  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()

    val ds = it.take(2).drop(1).map(_.split(" ").map(_.toInt)).flatten.toArray
    val res = for {
      i <- 0 to ds.size - 1
      j <- 0 to ds.size - 1
      if i != j
      if ds(i) == ds(j)
    } yield {
//      println(s"${i}: ${ds(i)}")
//      println(s"${j}: ${ds(j)}")
//      println(ds(i) - ds(j))
//      println()
      Math.abs(i - j)
    }

    println(res match {
      case l if l.isEmpty => -1
      case l => l.min
    })
  }
}
