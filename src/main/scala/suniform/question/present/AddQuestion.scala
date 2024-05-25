package suniform.question.present

import suniform.question.model.QuestionId

object AddQuestion {

  final case class Result(questionId: QuestionId)

  final case class Param(
      text: String,
      agree: String,
      disagree: String
  )

  sealed trait Error
  object Error {
    final case class StringValidation(msg: String) extends Error
  }
}
