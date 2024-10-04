fun main() {

	println("Enter a word where the first char will be extracted")
	val line: String = readln() // Read a line
	val char: Char = line[0] // Gets first char of line
	
	// Test if char is an uppercase letter
	// Operator && is the Logic AND
 	// if (char >= 'A' && char <= 'Z') {
	// Or:
	if (char in 'A'..'Z') {
 		println("Uppercase: $char")
 		val lowerChar: Char = char + 32 // Adds offset 32
 		println("$char converted to lowercase is: $lowerChar")
 	}
 	//else if (char >= 'a' && char <= 'z') {
	// Or:
	else if (char in 'a'..'z') {
 		println("Lowercase: $char")
 		val upperChar: Char = char - 32 // Subtracts offset 32
 		println("$char converted to uppercase is: $upperChar")
 	}
 	else {
 		println("$char is not a letter")
 	}
	
}

/* OUTPUT:

Enter a word where the first char will be extracted
ola
Lowercase: o
o converted to uppercase is: O

Enter a word where the first char will be extracted
Xpto
Uppercase: X
X converted to lowercase is: x

Enter a word where the first char will be extracted
123123131qweqeq
1 is not a letter



 */


















