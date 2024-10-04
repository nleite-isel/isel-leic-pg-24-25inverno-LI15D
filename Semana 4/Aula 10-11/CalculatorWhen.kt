
fun main() {

    println("CalculatorWhen")

    println("Enter 1.) operand")
    val op1: Double = readln().toDouble()

    println("Enter operator")
    val opr: Char = readln()[0]

    println("Enter 2.) operand")
    val op2: Double = readln().toDouble()

    var res = 0.0

    when (opr) {
        '+' -> res = op1 + op2
        '-' -> res = op1 - op2
        '/' -> res = op1 / op2
        'x' -> res = op1 * op2
        '%' -> res = op1 % op2
        else -> println("Invalid operator!")
    }

    println("$op1 $opr $op2 = $res")
}
/*
CalculatorWhen
Enter 1.) operand
2
Enter operator
/
Enter 2.) operand
3
2.0 / 3.0 = 0.6666666666666666
 */
