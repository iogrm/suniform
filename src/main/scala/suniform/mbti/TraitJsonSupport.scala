package suniform.mbti

import spray.json.JsonFormat
import spray.json.JsString
import spray.json.JsValue
import spray.json._
import DefaultJsonProtocol._

object MbtiJsonSupport {
  implicit object TraitJsonSupport extends JsonFormat[Trait] {
    val fmt = """([ienstfpj]{1})""".r
    def write(t: Trait): JsString = JsString(t.getClass().getName())
    def read(json: JsValue): Trait = json match {
      case JsString(fmt(c)) => Trait.make(c)
      case _                => deserializationError("String expected")
    }
  }
}
