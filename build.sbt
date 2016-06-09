name := """Application"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  // If you enable PlayEbean plugin you must remove these
  // JPA dependencies to avoid conflicts.
  javaJpa,
  javaJdbc,
  javaWs,
  cache,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.7.Final",
   "org.webjars" % "bootstrap" % "3.0.2",
    "org.webjars" % "jquery" % "1.11.1"
)
fork in run := true
