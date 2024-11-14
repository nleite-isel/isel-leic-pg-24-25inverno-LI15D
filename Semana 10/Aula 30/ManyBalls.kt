import pt.isel.canvas.*


val ALL_POSITIONS = listOf(Position(0,0), Position(32,0))



const val RADIUS = 20

fun main() {   // () -> Unit
    onStart {
        val arena = Canvas(height = ARENA_HEIGHT, background = CYAN, width = ARENA_WIDTH)
        // Draw many balls
//        arena.drawManyBalls()

        println(ALL_POSITIONS)

        val ballPos = Position(32, 0)

        val freePositions = ALL_POSITIONS - ballPos

        println(freePositions)


        // Mutability point
//        val balls = createBalls()
        var balls = createBalls() // Mutability

//        for (ball in balls) {
//            arena.drawBall(ball)
//        }
        // Or:
//        balls.forEach {
//            arena.drawBall(it)
//        }
        // Or:
        balls.forEach { b: Ball -> Unit
            arena.drawBall(b)
        }

//        var givenBall = balls[0]

        // TimeProgress event
        arena.onTimeProgress(PERIOD) {
//            ball = ball.move(arena)
//            arena.draw(ball)
            var newList: List<Ball> = emptyList()

            balls.forEach {       // it indicates the parameter of type Ball
                val auxBall: Ball = it.move(arena)
                newList += auxBall
            }
            // Replace old balls by the new list
            balls = newList

//            givenBall = givenBall.move(arena)
//            arena.draw(givenBall)
            arena.erase()
            for (ball in balls) {
                arena.drawBall(ball)
            }
        }

    }
    onFinish {
        println("Bye")
    }
}

// Build a list of three balls
fun createBalls(): List<Ball> {
    val ball1 = Ball(Position((60..ARENA_WIDTH).random(), (1..ARENA_HEIGHT).random()),20, RED, OffsetVector(-1, -1))

//    val ball1 = Ball(Position((60..ARENA_WIDTH).random(), (1..ARENA_HEIGHT).random()),20, RED, OffsetVector(-1, 0))
    val ball2 = Ball(Position((20..ARENA_WIDTH).random(), (1..ARENA_HEIGHT).random()),20, BLUE, OffsetVector(-1, 1))
    val ball3 = Ball(Position((10..ARENA_WIDTH).random(), (1..ARENA_HEIGHT).random()),20, GREEN, OffsetVector(-1, 1))
    var balls = listOf(ball1, ball2, ball3)
    return balls
}


//
// Extension Functions
//
// Draw ball in arena
//fun Canvas.draw(ball: Ball) {
//    // Erase arena
//    this.erase()
//    // Draw ball
//    this.drawCircle(ball.position.x, ball.position.y, ball.radius, ball.color)
//}

// Draw ball in arena
fun Canvas.drawBall(ball: Ball) {
    // Erase arena
//    this.erase()
    // Draw ball
    this.drawCircle(ball.position.x, ball.position.y, ball.radius, ball.color)
}

fun Canvas.drawManyBalls(): Unit {
    val ball1 = Ball(Position((60..ARENA_WIDTH).random(), (1..ARENA_HEIGHT).random()),20, RED, OffsetVector(-1, 0))
    val ball2 = Ball(Position((20..ARENA_WIDTH).random(), (1..ARENA_HEIGHT).random()),20, BLUE, OffsetVector(-1, 0))
    val ball3 = Ball(Position((10..ARENA_WIDTH).random(), (1..ARENA_HEIGHT).random()),20, GREEN, OffsetVector(-1, 0))

//    var balls = listOf(ball1, ball2, ball3)
    var balls: List<Ball> = listOf(ball1, ball2, ball3)

    balls.forEach {
//        this.draw(it)  // Wrong, it calls erase
        this.drawBall(it)
    }
}


























