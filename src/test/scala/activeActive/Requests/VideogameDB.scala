package activeActive.Requests

import activeActive.Configuration.EndPointConfig._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object VideogameDB {

      val Req1 = http("Validate Video Game API").get(VideogameUrl+subUrl)
        .header("Accept", "application/json")
        .check(status is 200)

    }

