package src.main

/** Combine data in pairs and triples
 *
 * o construtor de pares recebe dois valores de qualquer tipo ou combinação de tipos
 * o pair permite misturar e combinar qualquer tipo de valor que quiser, ou seja,
 * nao preciso guardar duas strings em um pair, posso guardar uma string e um integer
 * ou até mesmo outro pair
 *
 * **/

fun main() {
//   val name = "camila"
//    val lastname = "martins"
//    val age = 33

    //substitui as variáveis acima por um PAIR:
    val fullName = Pair<String, String>("camila", "martins") //a pair object using generic variants
    val age = 33

    //dois jeitos para acessar os valores
    //primeiro: acessar as propriedades definadas no "pair" com o first e second por exemplo
    println("My name is ${fullName.first} ${fullName.second}")

    //a segunda maneira de acessar o valor é chamada de estruturação
    // aqui nao estou realocando valores ou criando novas variaveis,
    // só usando uma sintaxe especial de desestruturação para quebrar o pair em 2 valores
    // esses valores apontam para os valores do primeiro par e do segundo par quando usados
    val (name2, lastname) = fullName
    println("My name is $name2, $lastname")

    //exemplo com pair
    val person = Pair("camila martins", 33)

    //____________________________________________________

    //exemplo de triple
    val birthday = Triple(18, 4, 1989)
    //guardando o valor do "triple" no "pair"
    val person2 = Pair("camila martins", birthday)

    //posso acessar assim:
    val nameUsingOrdering = person2.first
    val birthdayUsingOrdering = person2.second

    //ou posso acessar assim, com desestruturação é mais simples:
    val (name, bday) = person2
    val (day, month, year) = bday
    val (day2, month2, _) = bday // underscore para valores que nao "precisamos"

    val yearOfBirth = bday.third
    println("$name was born on $day/$month, year $year")
    println("$name was born on $day2/$month2, year unknown")
}

