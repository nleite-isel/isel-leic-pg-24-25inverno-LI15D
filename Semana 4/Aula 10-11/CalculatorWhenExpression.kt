
fun main() {

    println("CalculatorWhen")

    println("Enter 1.) operand")
    val op1: Double = readln().toDouble()

    println("Enter operator")
    val opr: Char = readln()[0]

    println("Enter 2.) operand")
    val op2: Double = readln().toDouble()
    val res: Double = when (opr) {
        '+'  -> op1 + op2
        '-'  -> op1 - op2
        '/'  -> op1 / op2
        'x'  -> op1 * op2
        else -> op1 % op2
    }
    // Warning: In this case, if the operator is invalid, it is assumed operator '%'.
    // So, a when expression is not good in this case.

    println("$op1 $opr $op2 = $res")
}
/*
CalculatorWhen
Enter 1.) operand
1
Enter operator
(
Enter 2.) operand
10
1.0 ( 10.0 = 1.0
 */
