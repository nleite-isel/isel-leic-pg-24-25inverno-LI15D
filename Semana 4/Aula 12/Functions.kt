
// function myPrint(numb: Int); Prints an Int number in output
fun myPrint(numb: Int) {
    println("Number: $numb")
}

// function toUpper(ch: Char): Char
// Converts caracter to uppercase in case that it is a lowercase letter and return it.
// If it is not a letter nor uppercase, returns the original caracter
fun toUpper(ch: Char): Char {
    if (ch in 'a'..'z') {
        println("Lowercase: $ch")
        val upperChar: Char = ch - 32 // Subtracts offset 32
        return upperChar
    }
    // If it is not a letter nor uppercase, returns the original caracter
    else {
        return ch
    }
}

// function toLower(ch: Char): Char
// Converts caracter to lowercase in case that it is a uppercase letter and return it.
// If it is not a letter nor lowercase, returns the original caracter
fun toLower(ch: Char): Char {
    if (ch in 'A'..'Z') {
        println("Uppercase: $ch")
        val lowerChar: Char = ch + 32 // Adds offset 32
        return lowerChar
    }
    // If it is not a letter nor uppercase, returns the original caracter
    else {
        return ch
    }
}

fun main() {
    myPrint(10)

    val ch1 = toUpper('c')
    println(ch1)

    val ch2 = toUpper('1')
    println(ch2)

    val ch3 = toLower('X')
    println(ch3)

    val ch4 = toLower('#')
    println(ch4)

}
/* OUTPUT:

Number: 10
Lowercase: c
C
1
Uppercase: X
x
#
 */