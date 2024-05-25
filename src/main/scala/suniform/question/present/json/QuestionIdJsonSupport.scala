package suniform.question.present.json

import spray.json.JsonFormat
import suniform.question.model.QuestionId
import suniform.common.JsonSupport.idFormat

object QuestionIdJsonSupport {
  implicit val formatQuestionId: JsonFormat[QuestionId] =
    idFormat[QuestionId](QuestionId.apply)
}
