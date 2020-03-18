package profile.model

class Profile (
   val id: String,
   val login: String,
   val firstname: String,
   val lastname: String,
   val status: String,
   val avatar: String
)
{
   val fullname: String = "$firstname $lastname"
   //get

   // второй вариант
   // override fun toString(): String = "Полное имя = $firstname $lastname"
}

