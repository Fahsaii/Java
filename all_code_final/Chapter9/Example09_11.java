import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.Random;
public class Example09_11 extends JFrame implements ActionListener {
    Timer swTimer;
    Random rnd =  new Random();
    Ball ball;
    public Example09_11() {
        super("Animation with Timer ");
        ball = new Ball();
        swTimer = new Timer( 30,this);
        swTimer.start(); 
        setSize(480, 320);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
	  int size = ball.getSize();
        g.fillOval( ball.getX(), ball.getY(), size, size);
    }
    public void actionPerformed(ActionEvent event) {
        ball.setX(ball.getX() + 1);
        repaint();
    }
    public static void main(String [] args) {
        new Example09_11();
    }
}
class Ball {
    int size = 20;
    int x = 10, y = 100; 

    public Ball ( ) {    }
    public void setSize(int size) {  this.size = size;  }
    public void setX(int x) {  this.x = x;  }
    public void setY(int y) {  this.y = y;  }
    public int getSize( ) {  return this.size ;  }
    public int getX( ) {  return this.x ;  }
    public int getY( ) {return this.y ;  }
}
