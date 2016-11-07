import sbt.Logger

trait DatabaseHelper {
  def runQuery(sql: String, log: Logger): Unit
}