
// Function that reads n integers and calculates the average.
fun printAvgAndSum(n: Int): Double {
    var sum = 0
    println("Enter $n integers")
    for (i in 1..n) {
        sum += readln().toInt()
    }
    return sum.toDouble() / n // It is necessary to convert, at least, one of the operands to Double, in order to do the real division
}

// Function that reads n integers and places them in a list, which is finally returned.
fun readValues(n: Int): List<Int> {
    var list = emptyList<Int>()
    println("Enter $n integers")
    for (i in 1..n) {
        list += readln().toInt()
    }
    return list
}


// Function that adds the elements present in a list.
fun sum(list: List<Int>): Int {
    var sum = 0
    for (elem in list) {
        sum += elem
    }
    return sum
}


fun main() {
    val avg = printAvgAndSum(5)
    println("Average = $avg")

    val list = readValues(5)
    println("Read list: $list")

    println(sum(list))

}

/**
 * OUTPUT:
 *
 * Enter 5 integers
 * 10
 * 12
 * 9
 * 16
 * 18
 * Average = 13.0
 * Enter 5 integers
 * 10
 * 12
 * 9
 * 16
 * 18
 * Read list: [10, 12, 9, 16, 18]
 * 65
 *
 */
