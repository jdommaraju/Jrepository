package activeActive.Configuration

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object EndPointConfig {

    val VideogameUrl="http://video-game-db.eu-west-2.elasticbeanstalk.com"
    val subUrl="/app/videogames"

    val users = Integer.getInteger("users", 1).toInt
    val rampUp = Integer.getInteger("rampup", 1).toInt

}
