name := "ThirdTest"

version := "0.1"

scalaVersion := "2.12.8"

lazy val ThirdTest = Project("ThirdTest", file("."))
  .settings(
    name := "common",
    libraryDependencies ++= commonDependencies
  )

lazy val dependencies = new {
  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  val scalaMockito = "org.scalamock" %% "scalamock" % "4.0.0" % Test
  val logger = "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"
  val logBack = "ch.qos.logback" % "logback-classic" % "1.1.2"
  val slf4j = "org.slf4j" % "slf4j-api" % "1.7.10"
  val TypeSafeConfig = "com.typesafe" % "config" % "1.3.3"

}

lazy val commonDependencies = Seq(
  dependencies.scalaTest,
  dependencies.scalaMockito,
  dependencies.logger,
  dependencies.logBack,
  dependencies.slf4j,
  dependencies.TypeSafeConfig
)