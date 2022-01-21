package animefacts

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import animefacts.HttpConfig.config

class GetOneAnimeFact extends Simulation {
  val anime = "naruto"
  def getAllAnimeFacts() = {
    exec(
      http("Get all anime")
        .get("/" + anime)
        .check(status is 200)
    )
  }

  val scn = scenario("Get all facts about anime: " + anime)
    .exec(getAllAnimeFacts())

  setUp(scn.inject(rampUsers(100) during 5).protocols(config))
}

