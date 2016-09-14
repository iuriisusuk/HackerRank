package org.susuk.flatlandspacestations

object Solution {

  def main(args: Array[String]): Unit = {
    val it = io.Source.stdin.getLines()
    val List(cities, spaceStations) = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList
    val citiesWithSpaceStations = it.take(1).map(_.split(" ").map(_.toInt)).flatten.toList

    var distances = List[Int]()

    for (cityIndex <- 0 to cities - 1) {
      if (citiesWithSpaceStations.contains(cityIndex))
        distances = 0 :: distances
      else
        distances = citiesWithSpaceStations.map(i => Math.abs(cityIndex - i)).min :: distances
    }

    println(distances.max)
  }
}
