import Dependencies._

lazy val root = (project in file("."))
  .settings(commonSettings, libraryDependencies ++= Seq(scalaLibrary, openCsv, sparkCore, scalaTest))

lazy val commonSettings = Seq(
  name := "dataprocessor",

  organization := "com.dataprocessor",

  version := "1.1",

  scalaVersion := "2.12.7"

)

//ivyScala := ivyScala.value map{_.copy(overrideScalaVersion = true)}


resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases"

resolvers += "Sonatype OSS Maven Repository" at "https://oss.sonatype.org/content/repositories/public"

resolvers += "Maven Central" at "http://central.maven.org/maven2/"


publishTo := Some(Resolver.file("file", new File(Path.userHome.absolutePath + "/.ivy2/cache")))
    