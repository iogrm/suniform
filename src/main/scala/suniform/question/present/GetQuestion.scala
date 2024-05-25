package suniform.question.present

import suniform.question.model.QuestionId

object GetQuestion {

  final case class Result(
      id: QuestionId,
      text: String,
      agree: String,
      disagree: String
  )

  final case class Param(questionId: QuestionId)

  sealed trait Error
  object Error {
    final case class StringValidation(msg: String) extends Error
  }
}
