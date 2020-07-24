package activeActive_API.Requests

import activeActive_API.Configuration.EndPointConfig._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Req2 {

      val Req2 = http("Save ResBody values into variables ").get(EndpointUrl + SubUrl)
        .header("Accept", "application/json")
        .check(jsonPath("$.data[1].id").saveAs("2ndID"))
        .check(jsonPath("$.data[1].name").saveAs("2ndname"))
        .check(status is 200)

    }

