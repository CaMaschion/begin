package src.main.manageControlFlow

fun main() {
    val myAge = 33

//    when(myAge){
//        35 -> println("Quarter century!")
//        33 -> println("Close to a quarter century!")
//        else -> {
//            println("Don't know your age!")
//        }
//    }

//    val message = when(myAge){
//        in 0..12 -> "Still a young boy"
//        in 13..19 -> "Teenager"
//        in 20..29 -> "In my twenties"
//        in 30..39 -> "In my thirties"
//        in 40..49 -> "In my forties"
//        else -> "I'm a wise man :]"
//    }
//    println(message)

//    quando o when não tem argumentos, requer uma expressão em cada caso:

    val email: String = "mail@mail.com"
    val password: String = "iLoveKotlin"

    when {
        email == null || email.isEmpty() -> println("You need to choose an email")
        "@" !in email -> println("Your email is invalid")
        password == null || password.isEmpty() -> println("Password not strong enough")
        password.length < 10 -> println("Password not strong enough")
        else -> println("Email length: ${email.length}, Password length: ${password.length}")

    }
}

//    private fun passwordValidate(password1: String, password2: String): Boolean {
//        when {
//            password1.length < 9 -> {
//                textView2.text = "Password Has To Be At Least 9 Characters Long"
//                return false
//            }
//            !password1.matches(".*[A-Z].*".toRegex()) -> {
//                textView2.text = "Password Must Contain 1 Upper-case Character"
//                return false
//            }
//            !password1.matches(".*[a-z].*".toRegex()) -> {
//                textView2.text = "Password Must Contain 1 Lower-case Character"
//                return false
//            }
//            !password1.matches(".*[!@#$%^&*+=/?].*".toRegex()) -> {
//                textView2.text = "Password Must Contain 1 Symbol"
//                return false
//            }
//            password1 != password2 -> {
//                textView3.text = "Passwords Don't Match"
//                return false
//            }
//            else -> return true
//}
