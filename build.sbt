val catsEffectVersion = "2.5.4"

lazy val root = (project in file("."))
  .settings(
    name := "entitlements",
    version := "1.0",
    ThisBuild / scalaVersion := "2.13.7",
    organization := "org.metals",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-effect" % catsEffectVersion
    )
  )
