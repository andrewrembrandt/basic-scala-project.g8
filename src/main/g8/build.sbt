name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.5.0", // command line parsing
  "com.lihaoyi" % "ammonite" % "0.8.2" cross CrossVersion.full,
  "org.scalaz" %% "scalaz-core" % "7.2.10",
  "org.scalaz" %% "scalaz-effect" % "7.2.10",
  "org.scalaz" %% "scalaz-concurrent" % "7.2.10",
  "ch.qos.logback" % "logback-classic" % "1.2.2", // logging
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")

scalacOptions ++= Seq(
  "-Yrangepos",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-Ywarn-dead-code",
  "-Xlint",
  "-Xfatal-warnings")

scalacOptions in Test ++= Seq(
  "-Yrangepos",
  "-deprecation",
  "-unchecked",
  "-feature",
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-Ywarn-dead-code",
  "-Xlint",
  "-Xfatal-warnings")

// Read here for optional dependencies:
// https://etorreborre.github.io/specs2/guide/SPECS2-3.8.3/org.specs2.guide.Installation.html#other-dependencies

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

initialCommands := "import $organization$._"
