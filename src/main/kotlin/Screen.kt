import java.awt.Graphics
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.WindowConstants

object Screen: JPanel() {
    var game = Game()

    val frame = JFrame()

    init {
        frame.add(this)
        frame.pack()

        frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        frame.setLocationRelativeTo(null)

        frame.title = "Tetris"
        frame.isResizable = false

        frame.isVisible = true
    }

    override fun paintComponent(g: Graphics?) {
        super.paintComponent(g)
        //TODO: Paint Tetris
    }

    override fun getPreferredSize() = screenDimension


}