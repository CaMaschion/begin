package src.main
/**      chalenge 1
 * Check and store in a Boolean if a password is secure
 * For simplicity we can say that a password is secure if it has at least
 * 10 characters
 *       chalenge 2
 * Check if two people have the same name length
 * **/

fun main() {

    val myPassword = "y0uW1llNotH4ckM3"

    val isPasswordSecure = myPassword.length >= 10
    println(isPasswordSecure)

    val nameOne = "camila"
    val nameTwo = "maria"

    val sameLength = nameOne.length == nameTwo.length
    println(sameLength)



}