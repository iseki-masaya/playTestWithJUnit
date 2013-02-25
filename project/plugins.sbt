// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("play" % "sbt-plugin" % "2.0.4")

resolvers += Classpaths.typesafeResolver

resolvers += "scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo"

resolvers += "sbt-simple-junit-xml-reporter-plugin-github-repository" at "https://github.com/iseki-masaya/sbt-simple-junit-xml-reporter-plugin"

addSbtPlugin("reaktor" %% "sbt-scct" % "0.2-SNAPSHOT")