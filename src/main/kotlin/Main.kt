package src.main

fun main() {
    var age: Int = 32
    val name: String = "camila"
    val lastName = "maschion"
    val weight = 61.0
    println(name)

    println("I am $age years old")

    age += 1
    println("I am $age years old")

    println("$name $lastName is $age years old, and weights $weight kg")

    val fullName = "$lastName, $name"

    println(fullName)

    //convertendo

    val ageToString = age.toString()
    println(ageToString)

    val ageFromString = "32".toInt()
    println(ageFromString)

    val nameLength = fullName.length
    println(nameLength)
}