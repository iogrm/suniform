package suniform.question.present

import suniform.question.model.QuestionId
import suniform.mbti.Trait

object AddQuestion {

  final case class Result(questionId: QuestionId)

  final case class Param(
      text: String,
      agree: Trait,
      disagree: Trait
  )

  sealed trait Error
  object Error {
    final case class StringValidation(msg: String) extends Error
  }
}
