import sbt._

object Depend {
  lazy val fs2 = Seq(
    "co.fs2" %% "fs2-core" % "0.10.4"
  )

  lazy val awsSqs = Seq(
    "com.amazonaws" % "aws-java-sdk-sqs" % "1.11.319"
  )

  lazy val depResolvers = Seq(
    "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases",
    Resolver.sonatypeRepo("releases")
  )

  lazy val dependencies =
    fs2 ++
    awsSqs
}
