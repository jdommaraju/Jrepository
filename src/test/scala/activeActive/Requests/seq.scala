package activeActive.Requests

import activeActive.Configuration.EndPointConfig._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object seq {

  val Req1 = http("seq").get(VideogameUrl+subUrl)
    .header("Accept", "application/json")
    .check(status is 200)

}

