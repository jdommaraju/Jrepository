package activeActive_API.Configuration

import io.gatling.http.Predef._

object EndPointConfig {

    val EndpointUrl = "https://reqres.in/api"
    val SubUrl= "/unknown"

    val users = Integer.getInteger("users", 1).toInt
    val rampUp = Integer.getInteger("rampup", 1).toInt

}
