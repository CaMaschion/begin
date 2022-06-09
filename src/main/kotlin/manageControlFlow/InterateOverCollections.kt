package src.main.manageControlFlow


fun main() {
    val daysOfWeek = listOf(
        "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday", "Sunday"
    )

//    exiting early from loops
    for (day in daysOfWeek) {
        if (day == "Monday") {
            continue
        }
        println("Working!")

        if (day == "Thursday") {
            println("Get ready for the weekend!")
            break
        }
    }

//    matrizes ou coleções bidimensionais também
//    chamadas de matrizes são usadas com bastante frequência

//    Criando uma matrix de string usando list
//    cada elemento é uma lista de 5 strings
//    este codigo cria uma matrix de strings vazias de 5 por 5

    val matrix = MutableList<MutableList<String>>(5) {
        MutableList(5) { "" }
    }
//        for loop para iterar atraves das linhas da matrix e nested for loop
    for (row in 0..matrix.lastIndex)
        for (column in 0..matrix.lastIndex) {
            matrix[row][column] = "$row:$column"
        }

    println(matrix)
    println("------")

    for (row in matrix)
        println(row)

    val thirdRowFifthColumnElement = matrix[2][4]
    println(thirdRowFifthColumnElement)

    row@ for (row in 0..5){
        column@ for (column in 0..5){
            if (column == 2 && row == 2)
                break@row
            print("x\t")
        }
        println()
    }
}

//  Lidar com matrizes e nested loops é complexo entao é importante aplicar algumas saidas estratégicas
//    e por isso para sair do loop mais cedo preciso especificar qual dos nested loops quero sair e
//    para isso posso usar labels, que sao como checkpoitns no codigo que pode ser usado para
//    voltar pra onde preciso ou se referir a alguma parte do codigo

/**
 * Nested loops tem uma péssima perfomance
 * Complexidade da Matrix:
 * Iteration - O(M*N)
 * In square matrices (NxN) - O (N^2)
 * 1000 elements - 1 million operations
 * 4K image - 8+ million pixels
 *
 * **/