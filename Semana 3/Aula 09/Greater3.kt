
fun main() {
    println("Enter 1st number")
    val num1 = readln().toInt()

    println("Enter 2nd number")
    val num2 = readln().toInt()

    println("Enter 3rd number")
    val num3 = readln().toInt()

    // 1st Implementation
    val greater: Int
    if (num1 > num2 && num1 > num3)
        greater = num1
    else if (num2 > num1 && num2 > num3)
        greater = num2
    else
        greater = num3

    println("The greater of $num1, $num2 and $num3 is $greater")
/*
OUTPUT:
Enter 1st number
10
Enter 2nd number
9
Enter 3rd number
11
The greater of 10, 9 and 11 is 11
 */

    /*
    // 2nd Implementation
//
//    num1    num2     num3
//      \    /          /
//      greater        /
//           \        /
//            \      /
//             greater1

//    val greater : Int
//    if (num1 > num2)
//        greater = num1
//    else
//        greater = num2
//
//    val greater1 : Int
//    if (num3 > greater)
//        greater1 = num3
//    else
//        greater1 = greater
//
    println("The greater of $num1, $num2 and $num3 is $greater")
*/

}






