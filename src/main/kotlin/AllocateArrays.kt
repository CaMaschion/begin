package src.main

/** Difference In Collections
 *
 * memory management
 * ability to change(Mutability)
 * performance: accessing data,  adding/removing data, iterating over values
 *
 * **/

fun main() {
//    val country1 = "Brasil"
//    val country2 = "Portugal"
//    val country3 = "Italy"

    val visitCountries = arrayOf(
        "Brasil", "Portugal", "Spain",
        "France", "Italy", "Malta",
        "Croatia", "Germany", "Austria"
    )

    println(visitCountries)
    println(visitCountries.size)

    println(visitCountries[3])
//    println(visitCountries[20])
//    println(visitCountries[-1])

    visitCountries + "Belgium"
    println(visitCountries.size)

    visitCountries[1] = "The United States of America"
    println(visitCountries[1])

    //segunda opção de como criar uma array
    val sizeArray = Array(10){""} // usando o construtor do array, que recebe o tamanho
//  do array e uma função inicializadora
    val emptyArray = emptyArray<String>() // quando quero um array vazio uso essa opção, não mto usual

    val arrayOfInts = intArrayOf(2,3,4,5,6,7)
    println(arrayOfInts)

    val intArray = IntArray(10)
    println(intArray)

    println(visitCountries.lastIndex)
    println(visitCountries.last())
    println(visitCountries.first())

    val currentCountry = "Mexico"
    println(visitCountries.contains(currentCountry))

    val hasVisitedSpain = currentCountry in visitCountries
    val hasNotVisitedSpain = currentCountry !in visitCountries

    println(hasVisitedSpain)
    println(hasNotVisitedSpain)
}