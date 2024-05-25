package suniform.question.persist.bson

import reactivemongo.api.bson.BSONHandler
import suniform.question.model.QuestionId
import reactivemongo.api.bson.Macros

object QuestionIdBsonSupport {
  implicit val questionIdHandler: BSONHandler[QuestionId] =
    Macros.handler[QuestionId]
}
