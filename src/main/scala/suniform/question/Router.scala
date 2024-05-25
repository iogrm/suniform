package suniform.question

import scala.util.{Success, Failure}
import akka.http.scaladsl.model.StatusCodes
import org.slf4j.LoggerFactory

import scala.concurrent.ExecutionContext.Implicits.global
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

import spray.json.DefaultJsonProtocol._
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import suniform.question.Service
import suniform.question.present.json.{
  GetQuestionJsonSupport,
  AllQuestionJsonSupport,
  AddQuestionJsonSupport
}
import suniform.question.present.AddQuestion

class Router(service: Service) {

  private val log = LoggerFactory.getLogger(getClass)

  import GetQuestionJsonSupport.{resultHandler}

  private val oneApiRoute: Route = pathPrefix("api" / "question" / "one") {
    path(RemainingPath) { case (id) =>
      complete(service.getQuestion(id.toString()))
    }
  }

  private val addApiRoute: Route = pathPrefix("api" / "question") {

    import AddQuestionJsonSupport.{resultHandler, paramHandler}
    path("add") {
      post {
        entity(as[AddQuestion.Param]) { body =>
          val question = service.addQuestion(body)
          onComplete(question) {
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

  private val allApiRoute: Route = pathPrefix("api" / "question") {
    import AllQuestionJsonSupport.{allResultHandler}
    path("all") {
      get {
        onComplete(service.getAll()) {
          case Success(value) =>
            complete(value)

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
  val route: Route = addApiRoute ~ oneApiRoute ~ allApiRoute
}
