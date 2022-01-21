package animefacts

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import animefacts.HttpConfig.config

class GetAllAnimeFacts extends Simulation {
  val anime = "naruto"
  val factId = 5
  def getAllAnimeFacts() = {
    exec(
      http("Get all anime")
        .get("/" + anime + "/" + factId)
        .check(status is 200)
    )
  }

  val scn = scenario("Get anime fact #" + factId + " from anime: " + anime)
    .exec(getAllAnimeFacts())

  setUp(scn.inject(rampUsers(500) during 5).protocols(config))
}

