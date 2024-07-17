name := """koya"""
organization := "io.github.owken64"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.14"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
// JPA 2.2 の依存関係を追加
libraryDependencies += "javax.persistence" % "javax.persistence-api" % "2.2"
// Hibernate Entity Manager を追加（JPA の実装として）
//libraryDependencies += "org.hibernate" % "hibernate-core" % "5.6.5.Final"
// H2 Database を追加
libraryDependencies += "com.h2database" % "h2" % "1.4.200"
libraryDependencies ++= Seq(
  javaJpa,
  "org.hibernate" % "hibernate-core" % "6.5.2.Final" // replace by your jpa implementation
)
libraryDependencies += "com.typesafe.play" %% "play-java-jpa" % "2.9.0"
libraryDependencies ++= Seq(evolutions, jdbc)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "io.github.owken64.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "io.github.owken64.binders._"

PlayKeys.externalizeResourcesExcludes += baseDirectory.value / "conf" / "META-INF" / "persistence.xml"
