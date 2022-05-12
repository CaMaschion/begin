package src.main

/** Difference In Collections
 *
 * memory management
 * ability to change(Mutability)
 * performance: accessing data,  adding/removing data, iterating over values
 *
 * Array é a coleção mais básica, representa uma série de valores
 * fo mesmo tipo conectados.
 * Exemplo: várias caixinhas do mesmo tipo com valores diferentes.
 * Por esse motivo o array é classificado na maioria das linguagens de programação
 * como uma coleção estática, porque quando criamos um array temos que alocar um espaço fixo ou estático
 * da memória. O tamanho não pode mudar, não posso adicionar ou remover elementos
 *
 * Na programação tem um jeito específico de medir a rapidez das operações em coleções
 * ou operações que são repetidas.
 *
 * measuring performance - BIG O
 * - Big O notation
 * length of operations over a number of elements
 * Pessimistic approach - worst case is measured
 *
 * Big (O) examples:
 * O(1) - fixed operation - instant (accessing values)
 * O(n) - linear operation - grows slower with more elements
 * (iterating over array)
 *
 * Array Pros
 *
 * Fixed data - O(1) => acessa usando indices, é instantaneo pq sabemos cada valor guardado no bloquinho da memória
 * desde o primeiro elemento. Posso acessar qualquer elemento pela posição relativa a ele (indice)
 * Changing data - O(1)
 * Simples de usar e criar
 * Não tem remover/adicionar então não como medir a performance,
 * pois o tamanho é fixo, o que nem sempre é o que preciso. Mas no geral o array é muito
 * performático e é frequentement a melhor collection para a maioria dos casos que irei encontrar
 *
 * Array Cons
 *
 * Iteração - O(n) - one by one
 * Não tem remover/adicionar valores
 *   iterar sobre valores
 * é On porque você tem que começar no primeiro valor e terminar no último,
 * e você só pode fazer isso um por um valor. Não há suporte para remover e adicionar valores.
 * Este também é um profissional, mas depende do seu caso de uso. Se você precisar alterar o tamanho,
 * obviamente é uma coisa ruim e você deve usar uma coleção diferente
 *
 * usa espaço da memória
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