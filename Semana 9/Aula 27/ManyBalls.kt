import pt.isel.canvas.*


const val RADIUS = 20

fun main() {   // () -> Unit
    onStart {
        val arena = Canvas(width = ARENA_WIDTH, height = ARENA_HEIGHT, background = CYAN)
        // Draw many balls
        arena.drawManyBalls()

        // Mutability point
        val balls = createBalls()
        for (ball in balls) {
            arena.drawBall(ball)
        }
    }
    onFinish {
        println("Bye")
    }
}

// Build a list of three balls
fun createBalls(): List<Ball> {
    val ball1 = Ball(Position((60..ARENA_WIDTH).random(), (1..ARENA_HEIGHT).random()),20, RED, OffsetVector(-1, 0))
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

fun Canvas.drawManyBalls() {
    val ball1 = Ball(Position((60..ARENA_WIDTH).random(), (1..ARENA_HEIGHT).random()),20, RED, OffsetVector(-1, 0))
    val ball2 = Ball(Position((20..ARENA_WIDTH).random(), (1..ARENA_HEIGHT).random()),20, BLUE, OffsetVector(-1, 0))
    val ball3 = Ball(Position((10..ARENA_WIDTH).random(), (1..ARENA_HEIGHT).random()),20, GREEN, OffsetVector(-1, 0))

    var balls = listOf(ball1, ball2, ball3)
    balls.forEach {
//        this.draw(it)  // Wrong, it calls erase
        this.drawBall(it)
    }
}




























