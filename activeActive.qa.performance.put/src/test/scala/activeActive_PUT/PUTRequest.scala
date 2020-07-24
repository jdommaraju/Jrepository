package activeActive_PUT

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.util.Random

class PUTRequest extends Simulation {

  val httpConf = http.baseUrl("http://video-game-db.eu-west-2.elasticbeanstalk.com/")
    .header("Accept", "application/json")

  var idNumbers = (33 to 50).iterator
  val rnd = new Random()
  val now = LocalDate.now()
  val pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd")

  def randomString(length: Int) = {
    rnd.alphanumeric.filter(_.isLetter).take(length).mkString
  }

  def getRandomDate(startDate: LocalDate, random: Random): String = {
    startDate.minusDays(random.nextInt(30)).format(pattern)
  }

  val customFeeder = Iterator.continually(Map(
    "gameId" -> idNumbers.next(),
    "name" -> ("Game-" + randomString(5)),
    "releaseDate" -> getRandomDate(now, rnd),
    "reviewScore" -> rnd.nextInt(100),
    "category" -> ("Category-" + randomString(6)),
    "rating" -> ("Rating-" + randomString(4))
  ))

  def postNewGame() = {
    repeat(1) {
      feed(customFeeder)
        .exec(http("Post New Game")
          .put("app/videogames/33")
          .body(StringBody("""{
                                          "id": "33",
                                          "name": "game_abc",
                                          "releaseDate": "${releaseDate}",
                                          "reviewScore": ${reviewScore},
                                          "category": "${category}",
                                          "rating": "${rating}"
                                           }""")).asJson
          //.body(ElFileBody("bodies/NewGameTemplate.json")).asJson
          .check(status.is(200)))
        .pause(1)
    }
  }

  val scn = scenario("Post new games")
    .exec(postNewGame())

  setUp(
    scn.inject(atOnceUsers(1))
  ).protocols(httpConf)

}
