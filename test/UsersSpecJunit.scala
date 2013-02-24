package test

import org.junit._
import Assert._

import models._

class UserSpecJunit {
	@Test def UsersModelHasKey() {
		val users = Users.get()
		users.map { user =>
			val key = user.keys
			assertEquals(key,Set('name,'message))
		}
		assertEquals(users.head.apply('name),"Mario")
	}
}