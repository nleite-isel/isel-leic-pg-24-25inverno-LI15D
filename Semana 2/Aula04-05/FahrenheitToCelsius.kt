

fun main() {

	// Elabore um programa que converta graus Fahrenheit para Celsius, usando a fórmula:
	// 
	// Cº = 5 * (Fº - 32) / 9 
	//

	println("Fahrenheit to Celsius")
	println("Introduza os graus Fahrenheit: ")

	val fahrenheit: Double = readln().toDouble()
	
	println("Fahrenheit = $fahrenheit") // Print val contents
	
	val celsius: Double = (fahrenheit - 32) * 5 / 9
	println("$fahrenheit graus F e' igual a $celsius graus C")

}
