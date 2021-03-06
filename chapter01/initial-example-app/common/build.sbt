name := "initial-example-common"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.15",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.15",
  "com.typesafe.akka" %% "akka-slf4j" % "2.3.15",
  "ch.qos.logback" % "logback-classic" % "1.0.9",
  "com.typesafe.slick" %% "slick" % "3.2.3",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.3",
  "net.databinder" %% "unfiltered-filter" % "0.8.4",
  "net.databinder" %% "unfiltered-netty" % "0.8.4",
  "net.databinder" %% "unfiltered-netty-server" % "0.8.4",
  "net.databinder" %% "unfiltered-json4s" % "0.8.4",
  "org.json4s" %% "json4s-ext" % "3.2.9",
  "org.postgresql" % "postgresql" % "42.2.2",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.2"
)
