import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tutorial extends JPanel implements ActionListener, KeyListener {

    private int x = 0,y = 0,velX = 0,velY = 0;

    Tutorial(){
        Timer timer = new Timer(5, this);
        timer.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(97, 10, 255));
        g.fillRect(x,y,20,20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        x += velX;
        y += velY;
        repaint();
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();

        if (c == KeyEvent.VK_LEFT){
            velX = -1;
            velY = 0;
        }
        if (c == KeyEvent.VK_UP){
            velX = 0;
            velY = -1;
        }
        if (c == KeyEvent.VK_RIGHT){
            velX = 1;
            velY = 0;
        }
        if (c == KeyEvent.VK_DOWN){
            velX = 0;
            velY = 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        velY = 0;
        velX = 0;
    }


}
