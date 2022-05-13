package src.main

/**
 * Create an Array of your five favorite games. Any game type.
 * Change an element within the Array, and print out the second game.
 * Transform the array to a list that can change its contents, and add two
 * more games you'd like to play or finish.
 * Then remove a game you've played most recently.
 * Finally, print out the list of games you ended up with.
 * **/

fun main() {

    val games = arrayOf("Assassin's Areed", "Dark Souls",
        "Dungeons & Dragons", "Devil May Cry", "Prince of Persia",
        "Tomb Raider")

    games[2] = "Drive"
    println(games[1])

    val mutableGames = games.toMutableList()
    println(mutableGames)
    mutableGames.addAll(listOf("Mafia", "Need For Speed"))
    println(mutableGames)
    mutableGames.remove("Drive")
    println(mutableGames)

   println("Drive" in mutableGames)
}