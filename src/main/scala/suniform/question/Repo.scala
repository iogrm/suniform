package suniform.question

import suniform.question.persist.Question
import scala.concurrent.{ExecutionContext, Future}
import reactivemongo.api.bson.{BSONDocument, BSONDocumentHandler}
import suniform.db.Connector
import scala.util.Try
import reactivemongo.api.Cursor
import reactivemongo.api.bson.{Macros, BSONObjectID}
import suniform.question.persist.bson.QuestionIdBsonSupport
import suniform.question.model.QuestionId

class Repo(connector: Connector) {

  private val col = connector.questions
  import QuestionIdBsonSupport.questionIdHandler
  private implicit val questionHandler: BSONDocumentHandler[Question] =
    Macros.handler[Question]
  def getOne(
      questionId: QuestionId
  )(implicit ec: ExecutionContext): Future[Option[Question]] = {
    val query = BSONDocument("_id" -> questionId)
    col.find(query).one[Question]
  }

  def getAll()(implicit ec: ExecutionContext): Future[List[Question]] = {
    col
      .find(BSONDocument())
      .cursor[Question]()
      .collect[List](-1, Cursor.FailOnError[List[Question]]())
  }

  def insert(
      question: Question
  )(implicit ec: ExecutionContext): Future[Unit] =
    col
      .insert(false)
      .one(question)
      .map(_ => ())
}
