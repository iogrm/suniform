file://<WORKSPACE>/src/main/scala/dive/suniform/api/QuestionJsonSupport.scala
### scala.MatchError: implicit class <error> extends  (of class scala.reflect.internal.Trees$ClassDef)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.13
Classpath:
<WORKSPACE>/src/main/resources [exists ], <WORKSPACE>/.bloop/suniform/bloop-bsp-clients-classes/classes-Metals-3SetSyQiQ5yr5W0C6_8CHA== [exists ], <HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.10/semanticdb-javac-0.9.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.13/scala-library-2.13.13.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http_2.13/10.2.10/akka-http_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-stream_2.13/2.6.21/akka-stream_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http-spray-json_2.13/10.2.10/akka-http-spray-json_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivemongo/reactivemongo_2.13/1.0.10/reactivemongo_2.13-1.0.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-simple/2.0.12/slf4j-simple-2.0.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http-core_2.13/10.2.10/akka-http-core_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor_2.13/2.6.21/akka-actor_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-protobuf-v3_2.13/2.6.21/akka-protobuf-v3_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.3/reactive-streams-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_2.13/0.4.3/ssl-config-core_2.13-0.4.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/spray/spray-json_2.13/1.3.6/spray-json_2.13-1.3.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivemongo/reactivemongo-core_2.13/1.0.10/reactivemongo-core_2.13-1.0.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dnsjava/dnsjava/3.4.3/dnsjava-3.4.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/commons-codec/commons-codec/1.15/commons-codec-1.15.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/2.0.12/slf4j-api-2.0.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-parsing_2.13/10.2.10/akka-parsing_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.2/config-1.4.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-java8-compat_2.13/1.0.0/scala-java8-compat_2.13-1.0.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.13/1.1.2/scala-parser-combinators_2.13-1.1.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivemongo/reactivemongo-bson-api_2.13/1.0.10/reactivemongo-bson-api_2.13-1.0.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivemongo/reactivemongo-shaded/1.0.10/reactivemongo-shaded-1.0.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/github/luben/zstd-jni/1.5.0-5/zstd-jni-1.5.0-5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/xerial/snappy/snappy-java/1.1.8.4/snappy-java-1.1.8.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.13/scala-reflect-2.13.13.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
uri: file://<WORKSPACE>/src/main/scala/dive/suniform/api/QuestionJsonSupport.scala
text:
```scala
package dive.suniform.api

import spray.json.JsonFormat
import spray.json._
import spray.json.DefaultJsonProtocol._
import dive.suniform.api.NewQuestion.Error.StringValidation
import dive.suniform.Question

object NewQuestionJsonSupport {
  import CommonJsonSupport.formatQuestionId

  implicit val paramHandler: RootJsonFormat[NewQuestion.Param] =
    jsonFormat3(NewQuestion.Param)

  implicit val resultHandler: RootJsonFormat[NewQuestion.Result] = jsonFormat1(
    NewQuestion.Result
  )

  object ErrorSupport {
    private object Formats {
      val stringValidation = jsonFormat1(
        NewQuestion.Error.StringValidation
      )
    }

    private object Name {
      val stringValidation = "StringValidation"
    }

    implicit val errorFormat: RootJsonFormat[NewQuestion.Error] =
      new RootJsonFormat[NewQuestion.Error] {
        override def read(json: JsValue): NewQuestion.Error = {
          json.asJsObject.fields(CommonJsonSupport.tag) match {
            case JsString(value) =>
              value match {
                case Name.stringValidation =>
                  Formats.stringValidation.read(json)
                case _ =>
                  ???
              }
            case _ =>
              ???
          }
        }

        override def write(obj: NewQuestion.Error): JsValue = {
          val (name, js) = obj match {
            case o: StringValidation =>
              Name.stringValidation -> Formats.stringValidation.write(o)
          }

          val fields =
            js.asJsObject.fields + (CommonJsonSupport.tag -> JsString(name))
          new JsObject(fields)
        }

      }
  }
}

object QuestionIdHandler {
  implicit 
}

object GetQuestionJsonSupport {
  import CommonJsonSupport.formatQuestionId

  implicit val paramHandler: RootJsonFormat[GetQuestion.Param] =
    jsonFormat1(GetQuestion.Param)

  implicit val resultHandler: RootJsonFormat[Question] = jsonFormat4(
    Question
  )
}

// object AllQuestionJsonSupport {
//   import CommonJsonSupport.formatQuestionId

//   implicit val resultHandler: RootJsonFormat[AllQuestion.Result] = jsonFormat4(
//     AllQuestion.Result
//   )
// }

```



#### Error stacktrace:

```
scala.tools.nsc.typechecker.Unapplies.constrParamss(Unapplies.scala:90)
	scala.tools.nsc.typechecker.Unapplies.factoryMeth(Unapplies.scala:149)
	scala.tools.nsc.typechecker.Unapplies.factoryMeth$(Unapplies.scala:146)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.factoryMeth(MetalsGlobal.scala:68)
	scala.tools.nsc.typechecker.MethodSynthesis$MethodSynth.enterImplicitWrapper(MethodSynthesis.scala:238)
	scala.tools.nsc.typechecker.MethodSynthesis$MethodSynth.enterImplicitWrapper$(MethodSynthesis.scala:237)
	scala.tools.nsc.typechecker.Namers$Namer.enterImplicitWrapper(Namers.scala:58)
	scala.tools.nsc.interactive.InteractiveAnalyzer$InteractiveNamer.enterExistingSym(Global.scala:95)
	scala.tools.nsc.interactive.InteractiveAnalyzer$InteractiveNamer.enterExistingSym$(Global.scala:81)
	scala.tools.nsc.interactive.InteractiveAnalyzer$$anon$2.enterExistingSym(Global.scala:51)
	scala.tools.nsc.typechecker.Namers$Namer.standardEnterSym(Namers.scala:314)
	scala.tools.nsc.typechecker.AnalyzerPlugins.pluginsEnterSym(AnalyzerPlugins.scala:496)
	scala.tools.nsc.typechecker.AnalyzerPlugins.pluginsEnterSym$(AnalyzerPlugins.scala:495)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.pluginsEnterSym(MetalsGlobal.scala:68)
	scala.tools.nsc.typechecker.Namers$Namer.enterSym(Namers.scala:288)
	scala.tools.nsc.typechecker.Typers$Typer.enterSym(Typers.scala:2055)
	scala.tools.nsc.typechecker.Typers$Typer.enterSyms(Typers.scala:2050)
	scala.tools.nsc.typechecker.Typers$Typer.typedTemplate(Typers.scala:2110)
	scala.tools.nsc.typechecker.Typers$Typer.typedModuleDef(Typers.scala:2010)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6157)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6249)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6327)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$9(Typers.scala:3529)
	scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3529)
	scala.tools.nsc.typechecker.Typers$Typer.typedPackageDef$1(Typers.scala:5836)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6159)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6249)
	scala.tools.nsc.typechecker.Analyzer$typerFactory$TyperPhase.apply(Analyzer.scala:125)
	scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:481)
	scala.tools.nsc.interactive.Global$TyperRun.applyPhase(Global.scala:1369)
	scala.tools.nsc.interactive.Global$TyperRun.typeCheck(Global.scala:1362)
	scala.tools.nsc.interactive.Global.typeCheck(Global.scala:680)
	scala.meta.internal.pc.PcCollector.<init>(PcCollector.scala:29)
	scala.meta.internal.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:19)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector$lzycompute$1(PcSemanticTokensProvider.scala:19)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:19)
	scala.meta.internal.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:73)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticTokens$1(ScalaPresentationCompiler.scala:170)
```
#### Short summary: 

scala.MatchError: implicit class <error> extends  (of class scala.reflect.internal.Trees$ClassDef)