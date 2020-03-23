name := "Spark_ICP_1"
version:= "1.0"
scalaVersion := "2.11.8"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.5" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.4.5",
  "org.apache.spark" %% "spark-streaming" % "2.4.5",
  "org.apache.spark" %% "spark-mllib" % "2.4.5"
)