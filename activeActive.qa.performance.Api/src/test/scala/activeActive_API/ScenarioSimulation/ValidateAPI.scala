package activeActive_API.ScenarioSimulation

import activeActive_API.Configuration.EndPointConfig._
import activeActive_API.Requests._
import io.gatling.core.Predef.scenario
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class ValidateAPI extends Simulation {

  val scn = scenario("API Validation")
    .exec(Req1.Req1)
    .exec{session => println(session("Responsebody").as[String]);session}
    .exec(Req2.Req2)
    .exec{session => println(session("2ndID").as[String]);session}
    .exec{session => println(session("2ndname").as[String]);session}
    .exec(Req3.Req3)
    .exec{session => println(session("Responsebody").as[String]);session}

  setUp(
    scn.inject(
      atOnceUsers(1))
     // rampUsers(rampUp) during (1 seconds))
  ).protocols(http.baseUrl(EndpointUrl))

}

//mvn gatling:test -Dgatling.simulationClass=computerdatabase.Scenarios.Scenario -Dusers=5 -DrampUp=5

//mvn gatling:test -Dgatling.simulationClass=activeActive_API.Scenarios.Scenario -Dusers=1 -DrampUp=5

//mvn clean  //removes target folder

//mvn clean gatling:execute -Dusers=1

//mvn clean gatling:test