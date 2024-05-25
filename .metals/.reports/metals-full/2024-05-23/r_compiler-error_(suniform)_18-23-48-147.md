file://<WORKSPACE>/src/main/scala/dive/suniform/persist/mongodb/MongoQuestionRepo.scala
### java.lang.IndexOutOfBoundsException: 1176

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.13
Classpath:
<WORKSPACE>/src/main/resources [exists ], <WORKSPACE>/.bloop/suniform/bloop-bsp-clients-classes/classes-Metals-p5Av0lbVThypxB-8t_EHhA== [exists ], <HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.10/semanticdb-javac-0.9.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.13/scala-library-2.13.13.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http_2.13/10.2.10/akka-http_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-stream_2.13/2.6.21/akka-stream_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http-spray-json_2.13/10.2.10/akka-http-spray-json_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivemongo/reactivemongo_2.13/1.0.10/reactivemongo_2.13-1.0.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-simple/2.0.12/slf4j-simple-2.0.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http-core_2.13/10.2.10/akka-http-core_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor_2.13/2.6.21/akka-actor_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-protobuf-v3_2.13/2.6.21/akka-protobuf-v3_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.3/reactive-streams-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_2.13/0.4.3/ssl-config-core_2.13-0.4.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/spray/spray-json_2.13/1.3.6/spray-json_2.13-1.3.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivemongo/reactivemongo-core_2.13/1.0.10/reactivemongo-core_2.13-1.0.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dnsjava/dnsjava/3.4.3/dnsjava-3.4.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/commons-codec/commons-codec/1.15/commons-codec-1.15.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/2.0.12/slf4j-api-2.0.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-parsing_2.13/10.2.10/akka-parsing_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.2/config-1.4.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-java8-compat_2.13/1.0.0/scala-java8-compat_2.13-1.0.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.13/1.1.2/scala-parser-combinators_2.13-1.1.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivemongo/reactivemongo-bson-api_2.13/1.0.10/reactivemongo-bson-api_2.13-1.0.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivemongo/reactivemongo-shaded/1.0.10/reactivemongo-shaded-1.0.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/github/luben/zstd-jni/1.5.0-5/zstd-jni-1.5.0-5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/xerial/snappy/snappy-java/1.1.8.4/snappy-java-1.1.8.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.13/scala-reflect-2.13.13.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 1158
uri: file://<WORKSPACE>/src/main/scala/dive/suniform/persist/mongodb/MongoQuestionRepo.scala
text:
```scala
package dive.suniform.persist.mongodb

import dive.suniform.Question
import scala.concurrent.{ExecutionContext, Future}
import reactivemongo.api.bson.BSONDocument
import reactivemongo.api.bson.BSONDocumentHandler
import dive.suniform.persist.mongodb.Connector
import scala.util.Try
import reactivemongo.api.bson.Macros

class MongoQuestionRepo(connector: Connector) {

  private val col = connector.questions

  def getOne(
      questionId: String
  )(implicit ec: ExecutionContext): Future[Option[Question]] = {
    val query = BSONDocument("id" -> questionId)
    col.find(query).one[Question]
  }

  def getAll()(implicit ec: ExecutionContext): Future[Option[Question]] = {
    col.find(_).one[Question]
  }

  import CommonBsonSupport.questionIdHandler
  private implicit val questionHandler: BSONDocumentHandler[Question] =
    Macros.handler[Question]

  // private implicit val allQuestionHandler
  //     : BSONDocumentHandler[Array[Question]] =
  //   Macros.handler[Array[Question]]

  def insert(
      question: Question
  )(implicit ec: ExecutionContext): Future[Unit] =
    col
      .insert(false)
      .one(question)
      .map(_ => ())

}
@@

```



#### Error stacktrace:

```
scala.reflect.internal.util.BatchSourceFile.offsetToLine(SourceFile.scala:213)
	scala.meta.internal.pc.MetalsGlobal$XtensionPositionMetals.toPos(MetalsGlobal.scala:688)
	scala.meta.internal.pc.MetalsGlobal$XtensionPositionMetals.toLsp(MetalsGlobal.scala:701)
	scala.meta.internal.pc.AutoImportsProvider.scala$meta$internal$pc$AutoImportsProvider$$namePos$1(AutoImportsProvider.scala:53)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$autoImports$2.applyOrElse(AutoImportsProvider.scala:77)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$autoImports$2.applyOrElse(AutoImportsProvider.scala:58)
	scala.collection.immutable.List.collect(List.scala:268)
	scala.meta.internal.pc.AutoImportsProvider.autoImports(AutoImportsProvider.scala:58)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$autoImports$1(ScalaPresentationCompiler.scala:282)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: 1176