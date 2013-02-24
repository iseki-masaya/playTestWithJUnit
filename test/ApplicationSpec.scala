package test

import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

import controllers._

class ApplicationSpec extends Specification {

  "Application" should {
    "render index" in {
      running(FakeApplication()) {
        val Some(index) = routeAndCall(FakeRequest(GET, "/"))

        status(index) must equalTo(OK)
        contentType(index) must beSome.which(_ == "text/html")
      }
    }
  }
}