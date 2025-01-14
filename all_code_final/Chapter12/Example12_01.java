import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example12_01 extends JFrame implements MouseListener {
    int x = 320, y = 240;
    int numClicked = 0;
    String text = "Hello World"; 
    public Example12_01 () {
        super("Example 12-01 Test Mouse");
        addMouseListener(this);        
        setSize(640, 480);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("x = " + x + ", y = "+y, 10,50);
        g.drawString(numClicked + " clicked", 10,80);
        g.fillOval(x, y, 20,20);    
        g.drawString( text, 320, 100);
    }
    public void mousePressed(MouseEvent event) {
        int x = event.getX();
        int y = event.getY();    
        Graphics g = getGraphics();
        g.drawString("[" + x + ", " + y + " ]",x,y);
    }    
    public void mouseReleased(MouseEvent event) {
        repaint();
    }
    public void mouseClicked(MouseEvent event) {
        this.x = event.getX();
        this.y = event.getY();
        numClicked++;
    }   
    public void mouseEntered( MouseEvent event ) { 
        text = "Enter Window";
        repaint();
    }
    public void mouseExited(MouseEvent event) {  
        text = "Exit Window";
        repaint();
    }
    public static void main(String [] args) {
        new Example12_01();
    }
}