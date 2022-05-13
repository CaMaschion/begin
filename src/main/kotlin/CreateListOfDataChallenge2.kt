package src.main

/** Using an array of the days of the week, practice your collection skills.
 *
 * 1 Change the value of an element by accessing them using an index.
 * 2 Add one element, and remove one element. Hint: use `Mutablelist´
 * 3 Print the changed List to check that all the elements are there.
 * 4. After removing an element, check if it's in the list, and print
 * the result.
 * **/

fun main() {
    val week = arrayOf("segunda", "terca", "quarta", "quinta", "sexta", "sabado", "domingo")
    week[4] = "sextAAA"

    val weekList = week.toMutableList()
    weekList.add("sexta")
    weekList.remove("segunda")
    println(weekList)

    println("segunda" in weekList)

}