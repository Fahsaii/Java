import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Animation extends JPanel implements ActionListener {
    private int width, height;
    private int x, y, size, xSpeed, ySpeed;
    Timer swTimer;
    public Animation (int w, int h) {
        setDoubleBuffered(true);
        setPreferredSize(new Dimension( w, h));
        setBorder( BorderFactory.createBevelBorder(0));
        width = w;  height = h;
        xSpeed = 2;     ySpeed = 2;
        x = width/2;    y = height/2;  size = 50;
        swTimer = new Timer(30, this);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  
        g.setColor( Color.BLUE );
        g.fillOval( x, y, size, size);
    }
    public void play() {
        swTimer.start();
    }
    public void stop(){
        swTimer.stop();
    }
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
    }
    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x < 1)    xSpeed = -xSpeed;
        else if (x+size > width)   xSpeed = -xSpeed;
        if (y < 1)   ySpeed = -ySpeed;
        else if (y+size > height)   ySpeed = -ySpeed;
    }
}


