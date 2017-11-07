// Groups //

lazy val circeGroup = "io.circe"
lazy val scalacheckGroup = "org.scalacheck"

// Artifacts //

lazy val circeCoreArtifact = "circe-core"
lazy val circeGenericArtifact = "circe-generic"
lazy val circeParserArtifact = "circe-parser"
lazy val scalacheckArtifact = "scalacheck"

// Versions //

lazy val circeVersion = "0.8.0"
lazy val scalacheckVersion = "1.13.4"

// Misc //

inThisBuild(Seq(
  scalaOrganization := "org.typelevel",
  scalaVersion := "2.12.4-bin-typelevel-4",
  crossScalaVersions := Seq("2.11.11-bin-typelevel-4")
))

// Projects //

lazy val root=(project in file(".")).settings(
  name := "Circe Example",
  libraryDependencies ++= Seq(
    circeGroup %% circeCoreArtifact % circeVersion,
    circeGroup %% circeGenericArtifact % circeVersion,
    circeGroup %% circeParserArtifact % circeVersion,
    scalacheckGroup %% scalacheckArtifact % scalacheckVersion
  )
)
