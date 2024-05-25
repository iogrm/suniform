package suniform.question.persist

import suniform.question.model.QuestionId

import reactivemongo.api.bson.BSONObjectID
import reactivemongo.api.bson.BSONDocumentReader
import reactivemongo.api.bson.BSONDocument

final case class Question(
    _id: QuestionId,
    text: String,
    agree: String,
    disagree: String
)
