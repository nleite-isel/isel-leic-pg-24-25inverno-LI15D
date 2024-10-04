
fun main() {
    println("Enter 1st number")
    val num1 = readln().toInt()

    println("Enter 2nd number")
    val num2 = readln().toInt()

    // Greater2
    val greater: Int
    if (num1 > num2)
        greater = num1
    else
        greater = num2

    println("The greater of $num1 and $num2 is $greater")
}