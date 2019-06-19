name := "Scala.js Hello World"
version := "1.0"
scalaVersion := "2.12.8"                 // or any other Scala version >= 2.10.2

// ScalaJS
scalaJSUseMainModuleInitializer := true  // this is an application with a main method

// not working with fastOptJS
//scalaJSMainModuleInitializer := Some(org.scalajs.core.tools.linker.ModuleInitializer.mainMethod("hello.Hello2", "main"))
//scalaJSModuleInitializers += ModuleInitializer.mainMethod("hello.Hello2", "main")

mainClass in Compile := Some("hello.Hello4")
enablePlugins(ScalaJSPlugin)

// DOM
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.7"

// jQuery
libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"
skip in packageJSDependencies := false
jsDependencies += "org.webjars" % "jquery" % "2.2.1" / "jquery.js" minified "jquery.min.js"

// Li Haoyi Scalatags project
libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.7"        

