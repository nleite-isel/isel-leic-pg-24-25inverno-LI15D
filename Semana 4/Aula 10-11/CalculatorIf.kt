
fun main() {

    println("CalculatorIf")
    println("Enter 1.) operand")
    val op1: Double = readln().toDouble()

    println("Enter operator")
    val opr: Char = readln()[0]

    println("Enter 2.) operand")
    val op2: Double = readln().toDouble()

    var res = 0.0

    if (opr == '+')
        res = op1 + op2
    else if (opr == '-')
        res = op1 - op2
    else if (opr == '/')
        res = op1 / op2
    else if (opr == 'x')
        res = op1 * op2
    else if (opr == '%')
        res = op1 % op2
    else
        println("Operador invalido")

    println("$op1 $opr $op2 = $res")
}
/*
CalculatorIf
Enter 1.) operand
3
Enter operator
x
Enter 2.) operand
2
3.0 x 2.0 = 6.0
 */
