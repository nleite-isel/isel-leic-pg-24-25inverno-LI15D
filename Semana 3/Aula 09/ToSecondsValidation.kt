package `Semana 3`.`Aula 09`
fun main() {
	println("Hours?")
	val hour = readln().toInt()
	if (hour in 0..23) {
	// Equivalent to:
	// if (hour >= 0 && hour <= 23) {
		println("Minutes?")
		val min = readln().toInt()
		if (min in 0..59) {
			println("Seconds?")
			val sec = readln().toInt()
			if (sec in 0..59) {
				val secs = hour*3600 + min*60 + sec
		
				println("$hour:$min:$sec = $secs seconds.")
			}
			else
				println("Invalid seconds")
		}
		else
			println("Invalid minutes")
	}
	else
		println("Invalid hours")

}

/*
OUTPUT:
Hours?
1
Minutes?
2
Seconds?
-1
Invalid seconds
*/

/*
Hours?
1
Minutes?
2
Seconds?
7
1:2:7 = 3727 seconds.

*/
