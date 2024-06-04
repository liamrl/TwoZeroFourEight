import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class GraphicsPanel extends JPanel {

    private Board b;

    public GraphicsPanel(Board board) {
        this.b = board;
    }

    private Color changeColor(int value) {
        switch (value) {
            case 2:
                return Color.LIGHT_GRAY;
            case 4:
                return Color.GRAY;
            case 8:
                return Color.YELLOW;
            case 16:
                return Color.ORANGE;
            case 32:
                return Color.PINK;
            case 64:
                return Color.MAGENTA;
            case 128:
                return Color.RED;
            case 256:
                return Color.GREEN;
            case 512:
                return Color.CYAN;
            case 1024:
                return Color.BLUE;
            case 2048:
                return Color.BLACK;
            default:
                return Color.WHITE;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int value = b.getPosition(i, j);
                g.setColor(changeColor(value));
                g.fillRect(j * 100 + 5, i * 100 + 5, 100, 100);

                if (value != 0) {
                    g.setColor(Color.BLACK);
                    g.drawString(String.valueOf(value), j * 100 + 45, i * 100 + 55);
                }
            }
        }
    }
}