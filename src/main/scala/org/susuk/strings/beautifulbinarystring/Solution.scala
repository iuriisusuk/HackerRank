package org.susuk.strings.beautifulbinarystring

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    var str = it.take(2).drop(1).next()

    val notBeautiful = "010"
    var steps = 0

    if (str.contains(notBeautiful))
      for (i <- 0 to str.length - 4) {
        val j = i + 1
        val fst = str.substring(i, i + 3)
        val snd = str.substring(j, j + 3)
        (fst, snd) match {
          case ("010", "101") =>
//            println("010 101")
//            println(str)
            str = str.take(i + 2) + "1" + str.drop(i + 3)
            steps += 1
//            println(str)
//            println()
          case ("010", _) =>
//            println("010 _")
//            println(str)
            str = str.take(i + 1) + "0" + str.drop(i + 2)
            steps += 1
//            println(str)
//            println()
          case (_, "010") if j + 3 == str.length =>
//            println("_ 010")
//            println(str)
            str = str.take(j + 1) + "0" + str.drop(j + 2)
            steps += 1
//            println(str)
//            println()
          case _ => str
      }
    }

    println(steps)

  }
}
