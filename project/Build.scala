import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "playTestWithJUnit"
    val appVersion      = "1.1-SNAPSHOT"

    lazy val s = Defaults.defaultSettings ++ Seq(ScctPlugin.instrumentSettings: _*)

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA, settings=s).settings(
      // val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here
      parallelExecution in test := false
    )

}
