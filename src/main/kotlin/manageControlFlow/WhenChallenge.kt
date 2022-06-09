package src.main.manageControlFlow

//Use a when expression to return which century an arbitrary year is from (as a String).
//Cover at least the last three centuries, and return "This was loooong ago" for others.
//Then print out the returned value
//Use ranges for year comparsion

fun main() {

    val year = 1500

    val century = when (year) {
        in 2001..2100 -> "Século XXI"
        in 1901..2000 -> "Século XX"
        in 1801..1900 -> "Século XIX"
        in 1701..1800 -> "Século XVIII"
        else -> "This was loooong ago"
    }
    println(century)

}