package activeActive.Simulations

import activeActive.Configuration.EndPointConfig._
import activeActive.Requests._
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._


class seq extends Simulation {

  val scn1 = scenario("seq")
    .exec(seq.Req1)

  setUp(
    scn1.inject(
      atOnceUsers(users),
      rampUsers(rampUp) during (1 seconds))
  ).protocols(http.baseUrl(VideogameUrl))
// two classes will run sice added run multiple simulation in pom file
}
