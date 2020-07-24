package activeActive.Requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import activeActive.baseUrlConfig.UrlConfiguration
import scala.concurrent.duration._

class AuthenticationValidation extends UrlConfiguration {

  val scn=scenario(scenarioName = "Authorization validation")

//    //Test Case or request 1
         .exec(http(requestName = "Verify User Credentials")
                .get("/basic-auth/user/passwd")
                .basicAuth("user", "passwd")
                .check(status.is(200)))
                .pause(2)

//    //Test Case or request 2
         .exec(http(requestName = "Verify Bearer Token")
                  .get("/get")
                  .check(status.is(200)))
                  .pause(2)

    setUp(
           scn.inject(atOnceUsers(users))
         ).protocols(httpConf)



  //Users per sec assertion *****START***********
//  setUp(
//    scn.inject(
//      nothingFor(5 seconds),
//      constantUsersPerSec(25) during (1 second)))
//     .assertions(
//       global.responseTime.max.lt(1000))
//       //details("Search").requestsPerSec.gt(100))
//    .protocols(httpConf)

  //Users per sec assertion *****END***********

}
//Run Command to run from Terminal
//mvn clean gatling:test -Dusers=5