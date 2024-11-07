package `Semana 5`.`Aula 13-14`

// Exercise GreaterThanFirst.kt:
// Program that reads 10 numbers and displays all those that are greater than the first value read.

fun main() {
    println("Enter 10 numbers")

    val first = readln().toInt()
    var number: Int
    // Read another 9 numbers
    for (i in 1..9) {
        number = readln().toInt()
        if (number > first)
            println("$number is > $first")
    }

}

/*
OUTPUT:

Enter 10 numbers
10
3
29
29 is > 10
45
45 is > 10
-1
7
19
19 is > 10
13
13 is > 10
4
0

 */