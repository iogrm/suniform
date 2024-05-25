package suniform.routes

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
object DocRouter {

  val route: Route =
    pathPrefix("docs") {
      get {
        getFromResourceDirectory("docs")
      }
    } ~
      path("swagger") {
        get {
          getFromResource("swagger.html")
        }
      }
}
