package src.main

fun main() {
    val visitedCountries = arrayOf(
        "Russia", "USA", "Poland",
        "The Netherlands", "Romania", "Greece",
        "Germany", "Spain", "Portugal", "Serbia", "Hungary", "Austria"
    )

    val rangeFromZeroToTen = 0..10
    print(rangeFromZeroToTen)

    println("")

    //quando nao quero que o numero final apareça

    val exclusiveRange = 0 until 10
    print(exclusiveRange)

    println("")

    for (index in rangeFromZeroToTen) {
        print(index)
    }

    println("")

    for (index in rangeFromZeroToTen step 2) { // step function to define how much the index is going to increase after each iteration
        print(index)
    }

    println("")

    for (index in 10 downTo 0) {
        print(index)
    }

    println("") // adiciona um "separator"

    for (countryIndex in 0..visitedCountries.size -1){
        print("${visitedCountries[countryIndex]} ")
    }

    println("")

    for (countryIndex in 0..visitedCountries.lastIndex){
        print("${visitedCountries[countryIndex]} ")
    }

    println("")

    for(country in visitedCountries){
        print("${country} ")
    }
}