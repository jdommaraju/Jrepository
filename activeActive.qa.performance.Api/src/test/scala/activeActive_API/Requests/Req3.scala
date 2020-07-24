package activeActive_API.Requests

import activeActive_API.Configuration.EndPointConfig._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import activeActive_API.Requests.Req2._
object Req3 {

  val Req3 = http("Utilize Var Values").get(EndpointUrl + SubUrl +"/${2ndID}")
    .header("Accept", "application/json")
    .check(jsonPath("$.data.name") is(expected = "${2ndname}")) //fuchsia rose
    .check(bodyString.saveAs("Responsebody"))
    .check(status is 200)
}

