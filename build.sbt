name := "anorm-example"

version := "2.6.0-SNAPSHOT"

scalaVersion := "2.12.4"

lazy val root = (project in file(".")).enablePlugins(PlayScala).disablePlugins(PlayFilters)

libraryDependencies += guice
libraryDependencies += jdbc

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"

libraryDependencies += "com.typesafe.play" %% "anorm" % "2.5.3"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
