val ProjectName      = "dec64"
val OrganisationName = "splatter"
val ProjectVersion   = "0.0.1"

val ScalaVersion     = "2.11.8"

def common: Seq[Setting[_]] = Seq(
  organization := OrganisationName,
  version      := ProjectVersion,
  scalaVersion := ScalaVersion
)

lazy val root = (project in file("."))
  .settings( common: _*)
  .settings(
    name := ProjectName,
    libraryDependencies ++= Seq(
      "org.scalatest"     %% "scalatest"     % "3.0.0"       % "test",
      "org.scalacheck"    %% "scalacheck"    % "1.13.2"      % "test"
    )
  )
