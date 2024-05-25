package suniform.question.present.json

import spray.json.RootJsonFormat
import suniform.question.present.AllQuestion
import spray.json.DefaultJsonProtocol._

object AllQuestionJsonSupport {

  import GetQuestionJsonSupport.resultHandler
  implicit def allResultHandler: RootJsonFormat[AllQuestion.Result] =
    jsonFormat1(
      AllQuestion.Result
    )
}
