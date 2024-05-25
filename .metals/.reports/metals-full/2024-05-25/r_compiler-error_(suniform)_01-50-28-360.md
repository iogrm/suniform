file://<WORKSPACE>/src/main/scala/dive/suniform/routes/MainRouter.scala
### scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Directives

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.13
Classpath:
<WORKSPACE>/src/main/resources [exists ], <WORKSPACE>/.bloop/suniform/bloop-bsp-clients-classes/classes-Metals-H4prektERei6cuoUN7gOBg== [exists ], <HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.9.10/semanticdb-javac-0.9.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.13/scala-library-2.13.13.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http_2.13/10.2.10/akka-http_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-stream_2.13/2.6.21/akka-stream_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http-spray-json_2.13/10.2.10/akka-http-spray-json_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivemongo/reactivemongo_2.13/1.0.10/reactivemongo_2.13-1.0.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-simple/2.0.12/slf4j-simple-2.0.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http-core_2.13/10.2.10/akka-http-core_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor_2.13/2.6.21/akka-actor_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-protobuf-v3_2.13/2.6.21/akka-protobuf-v3_2.13-2.6.21.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.3/reactive-streams-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_2.13/0.4.3/ssl-config-core_2.13-0.4.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/spray/spray-json_2.13/1.3.6/spray-json_2.13-1.3.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivemongo/reactivemongo-core_2.13/1.0.10/reactivemongo-core_2.13-1.0.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/dnsjava/dnsjava/3.4.3/dnsjava-3.4.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/commons-codec/commons-codec/1.15/commons-codec-1.15.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/2.0.12/slf4j-api-2.0.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-parsing_2.13/10.2.10/akka-parsing_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.2/config-1.4.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-java8-compat_2.13/1.0.0/scala-java8-compat_2.13-1.0.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.13/1.1.2/scala-parser-combinators_2.13-1.1.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivemongo/reactivemongo-bson-api_2.13/1.0.10/reactivemongo-bson-api_2.13-1.0.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivemongo/reactivemongo-shaded/1.0.10/reactivemongo-shaded-1.0.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/github/luben/zstd-jni/1.5.0-5/zstd-jni-1.5.0-5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/xerial/snappy/snappy-java/1.1.8.4/snappy-java-1.1.8.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.13/scala-reflect-2.13.13.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
uri: file://<WORKSPACE>/src/main/scala/dive/suniform/routes/MainRouter.scala
text:
```scala
package dive.suniform.routes

import scala.concurrent.ExecutionContext.Implicits.global
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import spray.json._
import dive.suniform.api.NewQuestionJsonSupport
import dive.suniform.api.GetQuestionJsonSupport
import dive.suniform.logic.QuestionLogic
import scala.util.Success
import scala.util.Failure
import akka.http.scaladsl.model.StatusCodes
import org.slf4j.LoggerFactory
import dive.suniform.api.IssueId
import dive.suniform.util.IO
import akka.http.scaladsl.server.{RequestContext, RouteResult}
import scala.concurrent.Future
import dive.suniform.api.NewQuestion
import dive.suniform.logic.QuestionLogic
import scala.concurrent.ExecutionContext.Implicits.global
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

import spray.json.DefaultJsonProtocol._
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._

class MainRouter(logic: QuestionLogic) {

  private val log = LoggerFactory.getLogger(getClass)

  import NewQuestionJsonSupport.{resultHandler, paramHandler}
  import NewQuestionJsonSupport.ErrorSupport.errorFormat

  private val addApiRoute: Route = pathPrefix("api" / "question") {
    path("add") {
      post {
        entity(as[NewQuestion.Param]) { body =>
          val question = logic.newQuestion(body)
          question match {
            case Success(value) => complete(value)
            case Failure(ex) =>
              ex.printStackTrace()
              log.error(s"Failed to process due to ", ex)
              complete(
                status = StatusCodes.InternalServerError,
                "Failed to execute"
              )

          }
        }
      }
    }
  }

  import GetQuestionJsonSupport.{resultHandler}

  private val oneApiRoute: Route = pathPrefix("api" / "question" / "one") {
    path(RemainingPath) { case (id) =>
      ioComplete("", logic.getQuestion(id.toString()))
    }
  }

  private val allApiRoute: Route = pathPrefix("api" / "question") {
    path("all") {
      get {
        onComplete(logic.getAll()) {
          case Success(value) =>
            println(value)
            complete("value")

          case Failure(ex) =>
            ex.printStackTrace()
            log.error(s"Failed to process due to ", ex)
            complete(
              status = StatusCodes.InternalServerError,
              "Failed to execute"
            )
        }
      }
    }
  }

  // import NewIssueJsonSupport.{resultHandler, paramHandler}
  // import NewIssueJsonSupport.ErrorSupport.errorFormat

  // private val apiRoute: Route = pathPrefix("api" / "issues") {
  //   path("add") { //     POST /api/issues/add
  //     post {
  //       entity(as[Param]) { body =>
  //         ioComplete(body, IssueLogic.newIssue(body))
  //       }
  //     }
  //   }
  // }

  private val docRouter: Route =
    pathPrefix("docs") {
      get {
        getFromResourceDirectory("docs")
      }
    } ~
      path("swagger") {
        get {
          getFromResource("swagger.html")
        }
      }

  val route: Route = addApiRoute ~ oneApiRoute ~ allApiRoute ~ docRouter

  private def ioComplete[P, E, A](
      param: P,
      io: IO[E, A]
  )(implicit eFormat: RootJsonFormat[E], aFormat: RootJsonFormat[A]): Route = {
    onComplete(io.future) {
      case Success(Right(value)) =>
        complete(value)

      case Success(Left(fail)) =>
        complete(status = StatusCodes.BadRequest, fail)

      case Failure(ex) =>
        ex.printStackTrace()
        log.error(s"Failed to process $param due to ", ex)
        complete(
          status = StatusCodes.InternalServerError,
          "Failed to execute"
        )
    }
  }

}

```



#### Error stacktrace:

```

```
#### Short summary: 

scala.reflect.internal.Types$TypeError: illegal cyclic reference involving object Directives