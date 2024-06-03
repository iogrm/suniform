package suniform.mbti

sealed trait Trait
object Trait {

  sealed trait IE extends Trait
  object IE {
    case object Extraversion extends IE
    case object Introversion extends IE
  }

  sealed trait NS extends Trait
  object NS {
    case object Sensing extends NS
    case object Intuition extends NS
  }

  sealed trait TF extends Trait
  object TF {
    case object Thinking extends TF
    case object Feeling extends TF
  }

  sealed trait JP extends Trait
  object JP {
    case object Judging extends JP
    case object Perceiving extends JP
  }

  val all: List[Trait] =
    IE.Extraversion :: IE.Introversion :: NS.Sensing :: NS.Intuition :: TF.Thinking :: TF.Feeling :: JP.Judging :: JP.Perceiving :: Nil

  def make(s: String): Trait = {
    s match {
      case ("e" | "E") => IE.Extraversion
      case ("i" | "I") => IE.Introversion
      case ("s" | "S") => NS.Sensing
      case ("n" | "N") => NS.Intuition
      case ("t" | "T") => TF.Thinking
      case ("f" | "F") => TF.Feeling
      case ("j" | "J") => JP.Judging
      case ("p" | "P") => JP.Perceiving
      case x => throw new Exception("Expected trait string but got " + x)
    }
  }

  def toString(t: Trait): String = {
    t match {
      case IE.Extraversion => "e"
      case IE.Introversion => "i"
      case NS.Sensing      => "s"
      case NS.Intuition    => "n"
      case TF.Thinking     => "t"
      case TF.Feeling      => "f"
      case JP.Judging      => "j"
      case JP.Perceiving   => "p"
    }
  }
}

// case class Mbti(ie: Trait.IE, ns: Trait.NS, tf: Trait.TF, jp: Trait.JP)
