import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import java.util.Random;
public class Example09_10 extends JFrame implements ActionListener {
    Timer swTimer;
    Random rnd =  new Random();
    public Example09_10() {
        super("Draw with Timer ");
        swTimer = new Timer( 1000,this);
        swTimer.start(); 
        setSize(480, 320);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        super.paint(g);
        drawCircle( g);
        drawBox( g);
    }

    public void drawCircle(Graphics g) {
        int x = 20 + rnd.nextInt( 420);
        int y = 70 + rnd.nextInt( 200);
        int Red = rnd.nextInt( 256);
        int Green = rnd.nextInt( 256);
        int Blue = rnd.nextInt( 256);
        g.setColor(new Color(Red, Green, Blue) );
        g.fillOval( x, y, 20, 20);
    }
    public void drawBox(Graphics g) {
        int x = 20 + (int) (Math.random() * 450);
        int y = 70 + (int) (Math.random() * 250);
        int Red = (int) (Math.random() * 256);
        int Green = (int) (Math.random() * 256);
        int Blue = (int) (Math.random() * 256);
        g.setColor(new Color(Red, Green, Blue) );
        g.fillRect( x, y, 20, 20);
    }
    public void actionPerformed(ActionEvent event) {
        repaint();
    }
    public static void main(String [] args) {
        new Example09_10();
    }
}
