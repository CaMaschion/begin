package src.main

/** Challenge: check if the user data for registration an account is valid. Data is valid if:
 * 1. Proprieties are not empty
 * 2.username has at least 6 characters
 * 3.password has at least 10 characters
 * 4.The email contains a @ and `.`
 * hint: use the contains() function on a String
 * Use if as an expression to assign a respective error message if any of the
 * cases fail!
 *
 * The appropriate String messages are:
 * 1. All values are empty -> "You must fill in your data!"
 * 2. Username is too short -> "Username needs to be at least 6 characters long!"
 * 3. Password is too short -> "Password needs to be at least 10 characters long!"
 * 4. Email doesn't contain a '@' or a '.' -> "Invalid email format."
 * 5. Every field is valid -> "Successful registration!"
 *
 * Print out the respective message!
 *
 * **/

fun main() {
    registration()
}

fun registration() {

    val userName = "camila"
    val password = "@Abc1234&$"
    val email = "abc@gmail.com"

    val message = if (email.isEmpty() || password.isEmpty() || userName.isEmpty()) {
        "You must fill in your data!"
    } else if (userName.length < 6) {
        "Username needs to be at least 6 characters long!"
    } else if (password.length < 10) {
        "Password needs to be at least 10 characters long!"
    } else if (!email.contains("@") || !email.contains(".")) {
        "Invalid email format."
    } else {
        "Successful registration!"
    }
    println(message)
}