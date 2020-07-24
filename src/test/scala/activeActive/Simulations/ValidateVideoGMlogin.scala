package activeActive.Simulations

import activeActive.Configuration.EndPointConfig._
import activeActive.Requests._
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class ValidateVideoGMlogin extends Simulation {

  val scn = scenario("API Authentication")
    .exec(VideogameDB.Req1)
// .exec(seq.Req1)
  setUp(
    scn.inject(
      atOnceUsers(users),
      rampUsers(rampUp) during (1 seconds))
  ).protocols(http.baseUrl(VideogameUrl))

}

//mvn gatling:test -Dgatling.simulationClass=computerdatabase.Scenarios.Scenario -Dusers=5 -DrampUp=5

//mvn gatling:test -Dgatling.simulationClass=activeActive.Simulations.Scenario -Dusers=5 -DrampUp=5

//mvn clean  //removes target folder

//mvn clean gatling:execute -Dusers=1

//mvn clean gatling:test -Dusers=5