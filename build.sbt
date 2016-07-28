organization := "tv.cntt"
name         := "usnames"
version      := "1.0.0-SNAPSHOT"

// Remove Scala dependency
autoScalaLibrary := false

// Remove Scala version in output paths and artifacts
crossPaths := false

javacOptions ++= Seq("-source", "1.6", "-target", "1.6", "-Xlint:deprecation")

javacOptions in doc := Seq("-source", "1.6")
