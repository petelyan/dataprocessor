name := "dataprocessor"

organization := "com.dataprocessor"

version := "1.1"

scalaVersion := "2.10.5"


ivyScala := ivyScala.value map{_.copy(overrideScalaVersion = true)}

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6"
  ,"org.scala-lang" % "scala-library" % "2.10.5"
  ,"com.opencsv" % "opencsv" % "3.8"
  ,"org.apache.spark" % "spark-core_2.10" % "1.5.1"
)


publishTo := Some(Resolver.file("file",new File(Path.userHome.absolutePath + "/.ivy2/cache/")))
    