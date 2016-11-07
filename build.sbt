name := "HackerRank"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "nl.grons" %% "metrics-scala" % "3.5.4_a2.3"

    lazy val runDev = taskKey[Unit]("Run with custom java options")

    fork in runDev := true
    javaOptions in runDev += "-Dlogback.configurationFile=logback-dev.xml"

    fullRunTask(runDev, Compile, "mainClass")