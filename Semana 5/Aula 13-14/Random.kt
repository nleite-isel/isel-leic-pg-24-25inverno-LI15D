

fun main() {

    // Generate a random number between 1 and 6
    val rand = (1..6).random()

    println("random number between 1 and 6: $rand")

    println("Generate two random dice numbers until its sum > 6")

    val dice1 = (1..6).random()
    var dice2: Int

    do {
        dice2 = (1..6).random()
        println("Dice1 = ${dice1}, dice2 = ${dice2}")
    }
    while (dice1 + dice2 <= 6)

    println("Dice sum = ${dice1 + dice2}")




}