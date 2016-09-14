package org.susuk.solvemefirst

object Solution {

  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().take(3).map(_.toInt).sum)
  }
}

