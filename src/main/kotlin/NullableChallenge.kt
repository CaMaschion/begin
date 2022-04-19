package src.main

//Declare a variable of type String? called `password` and assign a value to it.
//Using an if expression, check the level of password strength, and assign an appropriate
//message to another constant named ´message´.Then print out the message.
//Levels and messages are predefined and included in the project

/* Levels are designed as follows:
0 characters or `null` -> "Ehm, you  need a password to keep safe!"
1-5 characters -> "Weak password! Try adding a few more symbols to it!"
6-10 characters -> "Medium-strength password"
11-15 characters -> "No one is getting through this!"
15+ -> characters -> "Ironclad"
**/

fun main() {
    val password: String? = "abc12347yyy"

//    val message = if(password.isNullOrEmpty()) {
//        "Ehm, you  need a password to keep safe!"
//    } else if (password.length > 0 && password.length < 6) {
//        "Weak password! Try adding a few more symbols to it!"
//    } else if (password.length > 10) {
//        "No one is getting through this!"
//    } else {
//        "Ironclad"
//    }

//    println(message)

    // outro jeito de resolver:

    val passwordLength = password?.length ?: 0

    val message1 = if(password.isNullOrEmpty()) {
        "Ehm, you  need a password to keep safe!"
    } else if (passwordLength > 0 && passwordLength < 6) {
        "Weak password! Try adding a few more symbols to it!"
    } else if (passwordLength > 10) {
        "No one is getting through this!"
    } else {
        "Ironclad"
    }

    println(message1)
}