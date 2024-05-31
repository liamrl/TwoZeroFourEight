import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GraphicsPanel extends JPanel {


    public GraphicsPanel() {
    }

    @Override
    public void paintComponent(Graphics g) {
        Board b = new Board();
        super.paintComponent(g);  // just do this
        if (b.getPosition(0,0) > 0)
        g.setColor(Color.YELLOW);
        g.fillRect(5, 5, 100, 100);
        g.setColor(Color.YELLOW);
        g.fillRect(5,110 , 100, 100);
        g.setColor(Color.YELLOW);
        g.fillRect(5, 215 , 100, 100);
        g.setColor(Color.YELLOW);
        g.fillRect(5,320, 100, 100);
        g.setColor(Color.YELLOW);
        g.fillRect(110, 5, 100, 100);
        g.setColor(Color.YELLOW);
        g.fillRect(110,110 , 100, 100);


    }
}