package org.susuk.diagonaldifference

object Solution {

  def main(args: Array[String]) {
    val it = io.Source.stdin.getLines()
    val dimension = it.take(1).next().toInt
    val matrix = it.take(dimension).map(_.split(" ").map(_.toInt)).toList
    def diagonal(matrix: List[Array[Int]]): List[Int] = {
      var i = 0
      var l = List[Int]()
      for (arr <- matrix) {
        l = arr(i) :: l
        i += 1
      }
      l
    }

    val primaryDiagonal = diagonal(matrix)
    val secondaryDiagonal = diagonal(matrix.map(_.reverse))

    println(Math.abs(primaryDiagonal.sum - secondaryDiagonal.sum))
  }
}
