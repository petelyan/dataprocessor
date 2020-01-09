import sbt._

object Dependencies {


  lazy val scalaLibrary = "org.scala-lang" % "scala-library" % "2.12.7"
  lazy val openCsv = "com.opencsv" % "opencsv" % "3.8"
  lazy val sparkCore = "org.apache.spark" %% "spark-core" % "2.4.4"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.1.0" % Test

}
