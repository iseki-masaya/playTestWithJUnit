import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "test"
    val appVersion      = "1.0-SNAPSHOT"

    lazy val s = Defaults.defaultSettings ++ Seq(ScctPlugin.instrumentSettings: _*)

    val appDependencies = Seq(
      // Add your project dependencies here,
      "com.novocode"  % "junit-interface" % "0.10-M2"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA, settings=s).settings(
      // Add your own project settings here
      parallelExecution in test := false
    )

}
