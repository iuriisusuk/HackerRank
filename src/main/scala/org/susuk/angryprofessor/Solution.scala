package org.susuk.angryprofessor

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val t = it.take(1).next().toInt
    it.take(t * 2).toList.grouped(2).foreach {
        case List(thresholdStr, studentsStr) =>
          val List(_, k) = thresholdStr.split(" ").map(_.toInt).toList
          val students = studentsStr.split(" ").map(_.toInt).toList
          val attendance = students.count(_ <= 0)
          println(if (attendance >= k) "NO" else "YES")
    }
  }

}
