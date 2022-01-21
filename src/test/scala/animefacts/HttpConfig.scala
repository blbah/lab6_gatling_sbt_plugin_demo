package animefacts

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

object HttpConfig {
  val config = http
    .baseUrl("https://anime-facts-rest-api.herokuapp.com/api/v1")
}

