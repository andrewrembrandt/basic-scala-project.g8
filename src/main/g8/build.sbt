name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.7.1", // command line parsing
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "ch.qos.logback" % "logback-classic" % "1.2.3", // logging
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)
