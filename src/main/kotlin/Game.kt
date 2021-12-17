import java.awt.Color

class Game {
    val field = Array<Array<Color>>(gameDimension.width) {
        Array(gameDimension.height) {
            Color.BLACK
        }
    }

}
enum class TetrisPiece(val elements: Array<Array<Color?>>) {
    I(arrayOf(Array(4) { Color.CYAN })),
    J(arrayOf(arrayOfNulls<Color>(3).apply { this[0] = Color.BLUE}, Array(3) { Color.BLUE })),
    L(arrayOf(arrayOfNulls<Color>(3).apply { this[2] = Color.BLUE}, Array(3) { Color.BLUE })),
    O(Array(2) { Array(2) { Color.YELLOW } }),
    S(arrayOf(Array(3))),
    T,
    Z
}