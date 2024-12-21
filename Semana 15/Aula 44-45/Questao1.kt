import javax.swing.text.Position

enum class Ori(val dRow: Int, val dCol: Int) {
    N(-1,0),
    S(+1,0),
    E(0,+1),
    W(0,-1)
}

data class RCO(val row: Int, val col: Int, val ori: Ori)
data class Guess(val word: String, val rco: RCO)

val mat = listOf("FITA", "OSAV", "CEVO", "ALIV")
val words = listOf("ISEL", "VILA", "FITA", "AVO", "FOCA", "IVA")


// Q1
fun Char.toOri(): Ori? =
    when (this) {
        'N' -> Ori.N
        'S' -> Ori.S
        'E' -> Ori.E
        'W' -> Ori.W
        else -> null
    }

// Q2
fun Char.toRowOrCol(): Int? {
    val digit: Int? = this.digitToIntOrNull()
//    if (digit == null || digit !in 0..<mat.size)
//        return null
//    // else
//    return digit

    return if (digit == null || digit !in 0..<mat.size)
        null else digit
}

// Q3
fun readGuess(): Guess? {
    print("Palavra RCO? ")
    val ln = readln().uppercase().split(' ')
    if (ln.size != 2 || ln[0].length !in 3..mat.size)
        return null
    val rco = ln[1].toRCO() ?: return null
    return Guess(ln[0], rco)
}

private fun String.toRCO(): RCO? {
    if (this.length != 3)
        return null

    val row: Int? = this[0].toRowOrCol()
    val col: Int? = this[1].toRowOrCol()
    val ori: Ori? = this[2].toOri()
    return if (row != null && col != null && ori != null)
        RCO(row, col, ori)
    else
        null
}

// Q4
fun readValidGuess(toFind: List<String>): Guess {
    var guess: Guess?
//    do {
//        guess = readGuess()
//        if (guess == null || guess.word !in toFind)
//            println("Jogada inválida")
//    }
//    while (guess == null || guess.word !in toFind)

//    var notValid: Boolean = false
//    do {
//        guess = readGuess()
//        notValid = guess == null || guess.word !in toFind
//        if (notValid)
//            println("Jogada inválida")
//    }
//    while (notValid)

    do {
        guess = readGuess()
        if (guess == null || guess.word !in toFind)
            println("Jogada inválida")
    }
    while (guess == null)

    return guess
}

fun getWordOf(rco: RCO): String {
    return "" // To implement
}

// Q5
fun Guess.isCorrect(): Boolean {
    val matrixWord = getWordOf(this.rco)
    for (idx in this.word.indices) {
        if (this.word[idx] != matrixWord[idx])
            return false
    }
    return true
}


// Q6
fun main() {
//    mat.forEach {
//        println(it)
//    }
    for (word in mat) {
        println(word)
    }
    val mutableList = words.toMutableList()

    while (mutableList.size > 0) {
        print("Por descobrir: ")
        println(mutableList)

        // Lê tentativa e verifica se está na matriz e retira
        val guess = readValidGuess(mutableList)
        if (!guess.isCorrect()) {
            println("Não existe ${guess.word} no local indicado.")
        }
        else {
            mutableList -= guess.word
        }
    }
    println("Parabéns!")
}


//
// Grupo 2
//
data class Game(
    val man: Man,
    val floor: List<Cell>,
    val hill: List<Cell>,
    val stairs: List<Cell>
)
data class Cell(
    val row: Int,
    val col: Int
)

const val CELL_WIDTH: Int = 10
const val CELL_HEIGHT: Int = 10


data class Man(
    val pos: Point,
    val faced: Direction = Direction.RIGHT,
    val speed: Speed = Speed(dx=CELL_WIDTH, dy=-CELL_HEIGHT)
)
enum class Direction(val dRow: Int, val dCol: Int) {
    LEFT(0,-1), RIGHT(0,+1), UP(-1,0), DOWN(+1,0)
}
data class Point(val x: Int, val y: Int)
data class Speed(val dx: Int, val dy: Int)

// II.1
fun onTheHill(game:Game): Boolean {
    val manPos: Point = game.man.pos
    val manCell: Cell = manPos.toCell()
    return (manCell.plus(Direction.DOWN) in game.hill)
}

fun Point.toCell(): Cell {
    return Cell(0, 0) // To Implement

}

fun Cell.plus(dir: Direction): Cell {
    return Cell(0, 0) // To Implement
}

fun Point.plus(speed: Speed): Cell {
    return Cell(0, 0) // To Implement
}


// II.1
fun topOfHill(game:Game): Cell {
    // Embora já exista a função max, vamos fazê-la
    var idxMax = 0 // Assume-se que a Cell com row
    // mais alto se encontra no índice 0
    for (idx in 1 until game.hill.size) {
        // Verificar nos blocos de montanha de 1 para a frente,
        // se existe um bloco de montanha com altura (y) maior
        if (game.hill[idx].row > game.hill[idxMax].row)
            idxMax = idx
    }
    return game.hill[idxMax]
}


// II.3
fun Man.stepClimbHill(game:Game): Man {
    // Verificar se está na montanha
    if (!onTheHill(game))
        return this

    val manPos: Point = game.man.pos
    var climb = true
    var speed = this.speed
    val manNeighCell: Cell = manPos.toCell().plus(faced)
    if (manNeighCell !in game.hill)
        climb = false
    var manNextCell: Cell
    if (climb) {
        manNextCell = manPos.plus(speed)
    }
    else {
        speed = speed.copy(dx = speed.dx, dy = -speed.dy)
        manNextCell = manPos.plus(speed)
    }

    return this.copy(pos = Point(manNextCell.row*CELL_HEIGHT,
        manNextCell.col * CELL_WIDTH),
        speed = speed)
}







