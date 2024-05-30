import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class myFrame extends JFrame implements KeyListener{


    myFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        this.setVisible(true);
    }


    Board b = new Board();


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
        switch(e.getKeyCode()){
            case 87, 38:
                b.moveUp();
                break;

            case 65, 37:
                b.moveLeft();
                break;

            case 83, 40:
                b.moveDown();
                break;

            case 68, 39 :
                b.moveRight();
                break;

        }
    }


}
