package suniform.question.present.json

import spray.json.RootJsonFormat
import suniform.question.present.GetQuestion
import spray.json.DefaultJsonProtocol._

object GetQuestionJsonSupport {
  import QuestionIdJsonSupport.formatQuestionId

  implicit val resultHandler: RootJsonFormat[GetQuestion.Result] = jsonFormat4(
    GetQuestion.Result
  )
}
