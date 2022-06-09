package src.main.manageControlFlow

//Challenge: simulate a game where you have to find the X in a matrix
// Step1: choose the matrix size. ex. 3x3
// Step2: create the matrix
// Step3: create a nested loop, which will fill the matrix with `.` symbols for all of the elements,
// instead of 1 of your choice, which will be an `X` symbol.
// Step4: find the element, and print out its coordinates. Then stop the loop from going further!

fun main() {
    IterantingCollectionChallenge()
}
fun IterantingCollectionChallenge() {

    val matrixRow = 5
    val matrixColumn = 8
    val matrix = Array(matrixRow) {Array(matrixColumn) {'.'} }

    matrix[3][6] = 'X'

    loop@ for (row in 0 until matrixRow){
        println("Searching in row $row")

        for(column in 0 until matrixColumn) {
            if (matrix[row][column] == 'X') {
                println("Found X at: $row:$column")
                break@loop
            }
        }
    }
}