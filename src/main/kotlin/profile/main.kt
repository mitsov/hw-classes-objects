package profile
import profile.model.Profile


fun main() {

      val profile = Profile(
      id = "1",
      login = "admin",
      firstname = "James",
      lastname = "Bond",
      status = "active",
      avatar = ""
   )


   println ("My name is ${profile.fullname}")

   /* второй вариант
   val profile = Profile(
      id = "007",
      login = "admin",
      firstname = "James",
      lastname = "Bond",
      status = "active",
      avatar = ""
   )
   println(profile)
   */

}

