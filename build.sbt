name := "blockgen"

ThisBuild / baseVersion := "0.1"
ThisBuild / organization := "com.dcsobral"
ThisBuild / publishGithubUser := "dcsobral"
ThisBuild / publishFullName := "Daniel Sobral"
ThisBuild / homepage := Some(url("https://github.com/dcsobral/BlockGen"))
ThisBuild / scalaVersion := "2.13.1"

Test / scalacOptions ++= Seq("-Yrangepos")

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % "2.0.0-M1",
  "org.scala-graph" %% "graph-core" % "1.13.1",
  "org.scala-graph" %% "graph-dot" % "1.13.0",
//  "org.specs2" %% "specs2-core" % "4.8.3" % "test"
)

initialCommands +=
  """
    |import scalax.collection.Graph
    |import scalax.collection.GraphPredef._
    |import scalax.collection.edge.Implicits._
    |import scalax.collection.edge.LBase.LEdgeImplicits
    |import scalax.collection.edge.LkDiEdge
    |import scalax.collection.edge.LkDiEdge
    |import scala.xml._
    |import scala.xml.transform._
    |""".stripMargin

/* vim: set ts=2 sw=2 tw=100 et :*/
