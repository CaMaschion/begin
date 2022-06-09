package src.main

/** Challenge 1:
 * Create a range of 20 numbers, and iterate over it, printing out the numbers.
 *
 * Challenge 2:
 * Iterate over the range in Challenge 1 again, but print every third number.
 *
 * Challenge 3:
 * Create a decreasing range of 15 numbers, and print every second number.
 *
 * **/

fun main() {

    val range = 10..30
    for (number in range) {
        print("$number, ")
    }
    println("")

//    challenge 2

    for (number in range step 3) {
        print("$number, ")
    }
    println("")

//    challenge 3

    val reverse = 30 downTo 15
    for (number in reverse step 2) {
        print("$number, ")
    }
    println("")

}
