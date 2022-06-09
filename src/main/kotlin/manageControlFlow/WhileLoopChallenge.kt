package src.main.manageControlFlow

fun main() {

    /** challenge 1
     * Print numbers from 1 to 15, using a while loop.
     *
     * challenge 2
     * Create an array or list of names.
     *
     * Using a do-while loop, and an iterator, print the names in a reverse order.
     *
     * Make sure to check that the iterator is within the bounds of the array's size.
     * (from lastIndex to 0)
     * **/

    var index = 1
    while (index < 16) {
        println(index)

        index += 1
    }

    val names = arrayOf("Leo", "Tibor", "Pop", "Chanel", "Banzai", "Tila")

    index = names.lastIndex

    do {
        if (index > names.lastIndex || index < 0) return
        println(names[index])
        index -= 1
    } while (index > 0 && index < names.size)
}