

// Transforms string received into argument in uppercase, returning this new string (it is not possible to change the string received into argument)
fun upper(str: String): String {
    var upper: String = ""
    for (i in 0..str.length-1) {
        if (str[i] in 'a'..'z')
            upper += (str[i] - ' '.code) // Or upper += str[i] - 32
        else
            upper += str[i]
    }
    return upper
}

// Returns first character of the received string
fun firstChar(str: String): Char {
    return str[0]
}

// Generates and returns a string containing size A's
fun generateStringOfAs(size: Int): String {
    var strAs: String = ""
    for (i in 1..size) {
        strAs += 'A'
    }
    return strAs
}

fun main() {
    val str = "Ola, bom dia!"

    val upper = upper(str)
    println(upper)

    println(firstChar(upper)) // 'O'

    val aaa = generateStringOfAs(10)
    println(aaa)
}

/*
OUTPUT:

OLA, BOM DIA!
O
AAAAAAAAAA
 */