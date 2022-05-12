package src.main

fun main() {
    val countries = listOf("Russia", "USA", "The Netherlands") // e mais
    println(countries)

    val mutableList = countries.toMutableList()
    mutableList.add("Germany")
    mutableList.add("Greece")

    println(mutableList)

    mutableList.addAll(3, listOf("Austria", "Poland", "Hungary"))
    println(mutableList)

    val hasBeenToJapan = "Japan" in mutableList
    println(hasBeenToJapan)


}