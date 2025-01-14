import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example12_05 extends JFrame implements KeyListener {
    int x = 20, y = 120;
    String text = "Text";
    
    public Example12_05() {
        super("Test KeyListener");
        addKeyListener(this);
        setFocusable(true);
        setFont(new Font("Arial", Font.BOLD, 20) );        
        setForeground( Color.BLUE );
        setVisible(true);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString( text , x, y);
    }
    public void keyPressed(KeyEvent event) {
        text = "char = " + event.getKeyChar();
        text += ", "+ event.getKeyText(event.getKeyCode());
        text += ", code = " + event.getKeyCode();
    }
    public void keyReleased(KeyEvent event) {	
        repaint();  
    }
    public void keyTyped(KeyEvent event) {
        Graphics g = getGraphics();
        g.drawOval( x, y, 50, 50);
    }
    public static void main(String [] args) {
        new Example12_05();
    }
}


