
// Execute program for example as:
c:\kotlin ArgsMain ola xpto 123 a 11.3
c:\kotlin ArgsMain ola2
c:\kotlin ArgsMain 1 ola


fun main(args: Array<String>) {
    println("Array recebido nos argumentos de main")

    println("Numero de argumentos = ${args.size}")
    println("Argumentos")
    for (str in args) {
        println(str)
    }

    if (args.size > 0) {
        if (args[0] == "ola") {
            println("Executa comando 1")
        } else if (args[0] == "ola2") {
            println("Executa comando 2")
        } else {
            val number: Int? = args[0].toIntOrNull()
            if (number != null) {
                println(number + 12)
            }
        }
    }
}
