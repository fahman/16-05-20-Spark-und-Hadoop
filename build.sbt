import AssemblySettings._

name := "SparkAtGoldschmiede"

version := "1.0"

scalaVersion := "2.10.6"

assemblySettings

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.3.1",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test",
  "org.postgresql" % "postgresql" % "9.4.1208.jre7",
  "org.apache.spark" % "spark-sql_2.10" % "1.3.1",
  "org.apache.spark" % "spark-mllib_2.10" % "1.3.1",
  "org.apache.hadoop" % "hadoop-common" % "2.7.0-mapr-1602",
  "org.apache.hadoop" % "hadoop-hdfs" % "2.7.0-mapr-1602",
  "com.mapr.hadoop" % "maprfs" % "4.1.0-mapr",
  "org.apache.zookeeper" % "zookeeper" % "3.4.10"
).map(_.excludeAll(Seq(ExclusionRule("commons-logging"), ExclusionRule("javax.servlet")): _*))


