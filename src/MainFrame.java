import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainFrame implements Runnable, KeyListener {
    private GraphicsPanel panel;

    public MainFrame() {
        JFrame frame = new JFrame("2048");
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(440, 465);
        frame.setLocation(300, 50);
        // create and add panel
        panel = new GraphicsPanel();
        frame.add(panel);
        panel.Play();

        // display the frame
        frame.setVisible(true);

        // start thread, required for animation
        Thread thread = new Thread(this);
        thread.start();
    }




    // Runnable interface method
    public void run() {
        while (true) {
            panel.repaint();  // we don't ever call paintComponent directly
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

