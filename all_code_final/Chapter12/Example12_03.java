import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example12_03 extends JFrame implements MouseMotionListener {
    int x = 320;
    int y = 240;
    int size = 40;
    String text = "Hello World";

    public Example12_03 () {
        super("Example 12-03 Test mouse motion");
        addMouseMotionListener(this);
        setFont(new Font("Arial", Font.BOLD, 20) ); 
        setForeground( Color.BLUE );
        setSize(640, 480);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString( text, x, y);
    }
    public void mouseDragged(MouseEvent event) {
        text = "Drag";
        repaint();
    }  
    public void mouseMoved(MouseEvent event) {
        text = "Move";
        repaint();
    }
    public static void main(String [] args) {
        new Example12_03();
    }
}
