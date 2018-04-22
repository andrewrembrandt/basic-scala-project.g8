name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.5"

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.5.0", // command line parsing
  "ch.qos.logback" % "logback-classic" % "1.2.3", // logging
  "org.scalatest" %% "scalatest" % "3.0.1" % Test
)
