package activeActive_API.Requests

import activeActive_API.Configuration.EndPointConfig._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Req1 {

      val Req1 = http("Get Response Body").get(EndpointUrl + SubUrl)
        .header("Accept", "application/json")
        .check(bodyString.saveAs("Responsebody"))
        .check(status is 200)
    }

