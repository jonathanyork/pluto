import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.bidlittled"
ThisBuild / organizationName := "bidlittled"

lazy val root = (project in file("."))
  .settings(
    name := "pluto",
    libraryDependencies += scalaTest % Test
  )

libraryDependencies += "dev.zio" %% "zio" % "1.0.12"
libraryDependencies += "dev.zio" %% "zio-streams" % "1.0.12"
libraryDependencies += "io.d11" %% "zhttp"      % "1.0.0.0-RC19"
libraryDependencies += "io.d11" %% "zhttp-test" % "1.0.0.0-RC19" % Test

resolvers ++= Seq("public", "snapshots", "releases").map(Resolver.sonatypeRepo)
//libraryDependencies += "dev.zio" % "zio-json"  % "0.3.0-RC1-1"