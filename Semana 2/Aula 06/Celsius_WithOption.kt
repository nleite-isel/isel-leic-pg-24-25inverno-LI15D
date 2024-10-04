

fun main() {

	// Elabore um programa converta graus Celsius para Fahrenheit, usando a fórmula:
	// 
	// Cº = 5 * (Fº - 32) / 9 
	//
	println("Choose an option: (C) Celsius to Fahrenheit; (F) Fahrenheit to Celsius")
	val line: String = readln() // Reads a line
	// Extract first char from line
	val option: Char = line[0]

	if (option == 'C' || option == 'c') {
		println("Celsius to Fahrenheit")

		println("Enter Celsius degrees:")
		val celsius: Double = readln().toDouble()
		println("Celsius = $celsius") // Print val contents

		val fahrenheit: Double = celsius * 9 / 5 + 32
		println("$celsius C degree is equal to $fahrenheit F degrees")
	}
	else if (option == 'F' || option == 'f') {
		println("Fahrenheit to Celsius")
		println("Enter Fahrenheit degrees: ")
		val fahrenheit: Double = readln().toDouble()
		println("Fahrenheit = $fahrenheit") // Print val contents
		val celsius: Double = (fahrenheit - 32) * 5 / 9
		println("$fahrenheit F degrees is equal to $celsius C degrees")
	}
	else {
		println("Wrong option!")
	}
}
