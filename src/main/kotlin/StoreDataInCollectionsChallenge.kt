package src.main

/**Challenge
 *
 * create a pair which holds information about a bank account
 *  A bank account needs to have a credit card connected to it, and a balance. Hint:
 *  you can nest a triple in a pair
 *  A credit card should have a card number, security code, and the type of the card (VISA, MASTER)
 * Print out the data for the account, while hiding the security
 *
 * **/

fun main() {
    val creditCard = Triple("12345678910", "123", "VISA")
    val bankAccount = Pair(1500.00, creditCard)

    val (balance, card) = bankAccount
    val (creditCardNumber, securityCode, cardType) = card
    println("The account has $balance of balance, with the credit card number: $creditCardNumber and the card type: $cardType, security: ***")

}