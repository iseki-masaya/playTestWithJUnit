package test

import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

import models._

class UsersSpec extends Specification {
  "Users Model" should {
    "be get all users" in {
      running(FakeApplication(additionalConfiguration = inMemoryDatabase("hellowtest"))) {
        val users = Users.get()
        users.map { users =>
          users must have key('name)
          users must have key('message)
        }
      }
    }
  }
}