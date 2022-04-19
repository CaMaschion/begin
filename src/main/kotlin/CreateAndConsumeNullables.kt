package src.main

//Nullable types are types which allow you to use null to represent a constant
//or a valuable, if a value is not marked with a nullable type, it cannot be null
// You´ll get a compile time error.
fun main() {
    val name = "Camila"
    val nickname: String? = "Camis"
    val lastname: String? = null

    println(nickname)

    val nicknameLength = nickname?.length?.toDouble()
    println(nicknameLength)
    //melhor maneira de lidar com valores que podem ser nulos é usar o "safe operator -> ?"
    // retorna null se for nulo, e nao quebra o programa

    //val nicknameLength = nickname!!.length
    // !! -> evitar usar o operador non-null, pq ele força o valor a não ser nulo e se
    //se for nulo o programa vai quebrar = Null Pointer Exception

    if(lastname != null){
        println("My last name is ${lastname.length} characters long")
    } else {
        println("I don´t have a last name")
    }

    if(nickname?.isEmpty() == true){
        println("You don´t have a nickname! It´s length is ${nickname.length}")
    }
//    val notNullNickname = requireNotNull(nickname)
//    println(notNullNickname.length)

    val myNickname = nickname ?: name
    println(myNickname)

    val lastBirthdayYear = 2019
    val myAge: Int? = 32

    val myAgeNotNull = myAge ?: return

    val yearOfBirth = lastBirthdayYear - myAgeNotNull
    println("I was born in $lastBirthdayYear")

}