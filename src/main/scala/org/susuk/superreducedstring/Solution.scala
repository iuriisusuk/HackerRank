package org.susuk.superreducedstring

object Solution {

  def main(args: Array[String]) {
    val it = io.Source.stdin.getLines()
    val st = it.take(1).next()

    val n = st.zip(st.drop(1))
    println(n.filter({
      case (a, b) if a == b => true
      case _ => false
    }))
  }
}
