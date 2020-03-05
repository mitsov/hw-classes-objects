package profile
import profile.model.Profile


fun main() {

   println(Profile(
      id = "1",
      login = "admin",
      firstname = "James",
      lastname = "Bond",
      status = "active",
      avatar = ""
   ).fullname)

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

