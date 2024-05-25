package suniform.question

import suniform.db.Connector
import akka.http.scaladsl.server.Route

class QuestionModule(connector: Connector) {
  def build(): Route = {
    val repo = new Repo(connector)
    val service = new Service(repo)
    val route = new Router(service).route
    route
  }
}
