package animefacts

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import animefacts.HttpConfig.config

class GetAllAnimeSimulation extends Simulation {
  def getAllAnime() = {
    exec(
      http("Get all anime")
        .get("/")
        .check(status is 200)
    )
  }

  val scn = scenario("Get all anime")
    .exec(getAllAnime())

  setUp(scn.inject(atOnceUsers(50)).protocols(config))
}

