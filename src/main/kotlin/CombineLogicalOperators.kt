package src.main

fun main() {
    var myAge = 12
    val country = "Brasil"

    val isLegalDrivingAge = (myAge >= 18 && country == "Croatia") || (country == "Brasil" && myAge >= 16)
    println(isLegalDrivingAge)

    if(isLegalDrivingAge){
        println("You can drive!")
    } else {
        println("You´ve got a bit more time to go!")
    }

    if(myAge >= 18) println("I´m an adult!") else println("I´m still underaged")

    println(if(myAge >= 18) "I´m an adult!" else "I´m still underaged")

}