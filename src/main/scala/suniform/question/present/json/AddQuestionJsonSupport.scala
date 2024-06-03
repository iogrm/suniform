package suniform.question.present.json

import spray.json.RootJsonFormat
import spray.json.JsValue
import spray.json.JsString
import spray.json.JsObject
import spray.json.DefaultJsonProtocol._
import suniform.question.present.AddQuestion
import suniform.question.present.json.QuestionIdJsonSupport

object AddQuestionJsonSupport {

  import QuestionIdJsonSupport.formatQuestionId
  import suniform.mbti.MbtiJsonSupport.TraitJsonSupport

  implicit val paramHandler: RootJsonFormat[AddQuestion.Param] =
    jsonFormat3(AddQuestion.Param)

  implicit val resultHandler: RootJsonFormat[AddQuestion.Result] =
    jsonFormat1(AddQuestion.Result)

  object ErrorSupport {
    private object Formats {
      val stringValidation = jsonFormat1(
        AddQuestion.Error.StringValidation
      )
    }

    private object Name {
      val stringValidation = "StringValidation"
    }

    implicit val errorFormat: RootJsonFormat[AddQuestion.Error] =
      new RootJsonFormat[AddQuestion.Error] {
        override def read(json: JsValue): AddQuestion.Error = {
          json.asJsObject.fields(suniform.common.JsonSupport.tag) match {
            case JsString(value) =>
              value match {
                case Name.stringValidation =>
                  Formats.stringValidation.read(json)
                case _ =>
                  ???
              }
            case _ =>
              ???
          }
        }

        override def write(obj: AddQuestion.Error): JsValue = {
          val (name, js) = obj match {
            case o: AddQuestion.Error.StringValidation =>
              Name.stringValidation -> Formats.stringValidation.write(o)
          }

          val fields =
            js.asJsObject.fields + (suniform.common.JsonSupport.tag -> JsString(
              name
            ))
          new JsObject(fields)
        }

      }
  }
}
