import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainFrame implements Runnable, KeyListener {
    private GraphicsPanel panel;
    private Board board;
    private boolean gameEnded;

    public MainFrame() {
        JFrame frame = new JFrame("2048");
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(440, 465);
        frame.setLocation(300, 50);

        board = new Board();
        panel = new GraphicsPanel(board);
        frame.add(panel);
        frame.addKeyListener(this);

        frame.setVisible(true);

        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() {
        while (true) {
            panel.repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (gameEnded){
            return;
        }
        
        boolean moved = false;
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                board.moveUp();
                moved = true;
                break;
            case KeyEvent.VK_DOWN:
                board.moveDown();
                moved = true;
                break;
            case KeyEvent.VK_LEFT:
                board.moveLeft();
                moved = true;
                break;
            case KeyEvent.VK_RIGHT:
                board.moveRight();
                moved = true;
                break;
        }

        if (moved) {
            board.nextNumAndPlace();
            panel.repaint();

            if (board.checkWin()) {
                frame.setTitle("You win!!!");
                gameEnded = true;
            } else if (board.checkLose()) {
                frame.setTitle("Game Over. You lose :(");
                gameEnded = true;

            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}