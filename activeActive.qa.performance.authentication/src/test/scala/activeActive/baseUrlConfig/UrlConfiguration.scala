package activeActive.baseUrlConfig

import io.gatling.core.Predef._
import io.gatling.http.Predef._

trait UrlConfiguration extends Simulation {
// Basic URL Configuration
  val httpConf = http.baseUrl("https://httpbin.org")
    .header("Accept", "application/json")

// Default users for Simulation
 val users = Integer.getInteger("users", 1).toInt
val rampUp = Integer.getInteger("rampup", 1).toInt

}
