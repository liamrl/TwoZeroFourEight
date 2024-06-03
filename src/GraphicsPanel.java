import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GraphicsPanel extends JPanel {


    public GraphicsPanel() {
    }

    Board b = new Board();


    private Color changeColor(int x, int y){
        switch (b.getPosition(0, 0)) {
            case 2 ->{
                return Color.LIGHT_GRAY;
            }
            case 4 ->{
                return Color.GRAY;
            }
            case 8 -> {
                return Color.YELLOW;
            }
            case 16 -> {
                return Color.ORANGE;
            }
            case 32 -> {
                return Color.PINK;
            }
            case 64 -> {
                return Color.MAGENTA;
            }
            case 128 ->{
                return Color.RED;
            }
            case 256 ->{
                return Color.GREEN;
            }
            case 512 ->{
                return Color.CYAN;
            }
            case 1024 ->{
                return Color.BLUE;
            }
            case 2048 ->{
                return Color.BLACK;
            }

        }
        return Color.WHITE;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // just do this
        g.setColor(changeColor(0,0));
        g.fillRect(5, 5, 100, 100);

        g.setColor(changeColor(0,1));
        g.fillRect(5,110 , 100, 100);

        g.setColor(changeColor(0,2));
        g.fillRect(5, 215 , 100, 100);

        g.setColor(changeColor(0,3));
        g.fillRect(5,320, 100, 100);

        g.setColor(changeColor(1,0));
        g.fillRect(110, 5, 100, 100);

        g.setColor(changeColor(1,1));
        g.fillRect(110,110 , 100, 100);

        g.setColor(changeColor(1,2));
        g.fillRect(110, 215, 100, 100);

        g.setColor(changeColor(1,3));
        g.fillRect(110,320 , 100, 100);

        g.setColor(changeColor(2,0));
        g.fillRect(215, 5, 100, 100);

        g.setColor(changeColor(2,1));
        g.fillRect(215,110 , 100, 100);

        g.setColor(changeColor(2,2));
        g.fillRect(215, 215, 100, 100);

        g.setColor(changeColor(2,3));
        g.fillRect(215,320 , 100, 100);

        g.setColor(changeColor(3,0));
        g.fillRect(320, 5, 100, 100);

        g.setColor(changeColor(3,1));
        g.fillRect(320,110 , 100, 100);

        g.setColor(changeColor(3,2));
        g.fillRect(320, 215, 100, 100);

        g.setColor(changeColor(3,3));
        g.fillRect(320,320 , 100, 100);

    }

    public void Play(){

            b.nextNumAndPlace();
            b.moveUp();

            b.nextNumAndPlace();
            b.moveDown();
            b.nextNumAndPlace();

    }
}