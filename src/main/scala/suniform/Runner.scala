package suniform

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import suniform.db.Connector
import akka.http.scaladsl.server.Route
import suniform.question.QuestionModule
import suniform.routes.DocRouter.route

object Runner {
  def main(args: Array[String]): Unit = {

    implicit val system = ActorSystem("suniform-http-system")
    val connector = new Connector()
    val questionRoute = new QuestionModule(connector).build()
    val route: Route = questionRoute

    val bindingFuture =
      Http().newServerAt("0.0.0.0", 8080).bind(route)
    println("Server Running")
  }
}
