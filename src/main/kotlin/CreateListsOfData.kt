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

    mutableList.remove("Japan")
    mutableList.removeAt(0)
    mutableList.removeAll(listOf("Russia", "Japan", "USA", "Germany"))

    println(mutableList)

    mutableList[2] = "Croatia"
    val combinedList = countries + mutableList
    val emptyList = emptyList<String>()

    println(mutableList)
    println(combinedList)
    println(emptyList)

    mutableList.clear()
    println(mutableList)
}