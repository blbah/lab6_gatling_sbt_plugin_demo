enablePlugins(GatlingPlugin)

scalaVersion := "2.13.8"

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.8", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")

val gatlingVersion = "3.7.4"
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test,animefacts"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % gatlingVersion % "test,animefacts"
