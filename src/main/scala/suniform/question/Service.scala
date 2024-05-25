package suniform.question

import scala.concurrent.{ExecutionContext, Future}
import suniform.question.model.{QuestionId}
import suniform.question.persist.Question
import scala.concurrent.{ExecutionContext, Future}
import java.util.UUID
import scala.util.{Success, Failure}
import suniform.question.present.{AddQuestion, GetQuestion}

class Service(repo: Repo) {

  def addQuestion(param: AddQuestion.Param)(implicit
      ec: ExecutionContext
  ): Future[AddQuestion.Result] = {

    val question =
      Question(
        _id = QuestionId(randomId),
        text = param.text,
        agree = param.agree,
        disagree = param.disagree
      )

    for {
      _ <- repo.insert(question)
    } yield AddQuestion.Result(question._id)

  }

  def getQuestion(questionId: String)(implicit
      ec: ExecutionContext
  ): Future[GetQuestion.Result] = {
    repo
      .getOne(questionId)
      .map(option =>
        option match {
          case Some(question) =>
            GetQuestion.Result(
              question._id,
              question.text,
              question.agree,
              question.disagree
            )
          case None => {
            println("we were here!!!")
            println(questionId)
            ???
          }
        }
      )
  }

  def getAll()(implicit
      ec: ExecutionContext
  ): Future[List[GetQuestion.Result]] = {
    repo
      .getAll()
      .map(
        _.map(question =>
          GetQuestion.Result(
            question._id,
            question.text,
            question.agree,
            question.disagree
          )
        )
      )
  }

  def randomId = UUID.randomUUID().toString()
}
