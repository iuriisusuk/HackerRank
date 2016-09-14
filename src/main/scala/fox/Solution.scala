package fox

object Solution extends App {

  def maxLength(a: Array[Int], k: Int): Int = {
    val length = a.length
    for {
      i <- length to 1 by -1
      j <- 0 to length - i
    } {
      // sliding instead of grouped
      val aaa = a.drop(j).grouped(i)

      val res = aaa.map(_.sum).filter(_ <= k)
      if (res.nonEmpty) {
        return i
      }
    }
    0
  }

  println(maxLength(Array(1, 2, 3), 4))
  println(maxLength(Array(3, 1, 2, 1), 4))

}
