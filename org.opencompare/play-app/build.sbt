import play.Project._
import scala.xml.XML

name := """OpenCompare"""

version := XML.loadFile("pom.xml").\("version").text

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.2",
  "org.webjars" % "bootstrap" % "3.2.0",
  "org.webjars" % "angularjs" % "1.3.0",
  "org.webjars" % "font-awesome" % "4.3.0-1",
  "org.webjars" % "ui-grid" % "3.0.0-rc.21")
//  "org.webjars" % "handsontable" % "0.14.1"


playJavaSettings