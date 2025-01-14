import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example12_04 extends JFrame implements MouseListener,
 MouseMotionListener {
    int x = 50, y = 120, size = 40;
    String text = "My JFrame";

    public Example12_04 () {
        super("Example 12-04 Test mouse on JFrame and JPanel");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add( new MyPanel() );
        addMouseListener(this);
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
    public void mousePressed(MouseEvent event) {
        text = "Press";
        repaint();
    }
    public void mouseReleased(MouseEvent event) {
        text = "Release";
        repaint();
    }
    public void mouseClicked(MouseEvent event) {
        text = "Click";
        repaint();
    }
    public void mouseEntered( MouseEvent event ) {
        text = "Enter";
        repaint();
    }
    public void mouseExited(MouseEvent event) { 
        text = "Exit";
        repaint();
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
        new Example12_04();
    }
}

class MyPanel extends JPanel implements MouseListener, MouseMotionListener {
    int x = 100, y = 120, size = 40;
    String text = "My Panel";
    
    public MyPanel () {
        setPreferredSize(new Dimension(320, 240));
        setBorder( BorderFactory.createBevelBorder(0));
        addMouseListener(this);
        addMouseMotionListener(this);
        setFont(new Font("Arial", Font.BOLD, 20) ); 
        setForeground( Color.RED );
    }    
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString( text, x, y);
    }

    public void mousePressed(MouseEvent event) {
        text = "Press";	repaint();
    }
    
    public void mouseReleased(MouseEvent event) {
        text = "Release";		repaint();
    }

    public void mouseClicked(MouseEvent event) {
        text = "Click";	repaint();
    }
    public void mouseEntered( MouseEvent event ) {
        text = "Enter";	repaint();
    }
    public void mouseExited(MouseEvent event) { 
        text = "Exit";	repaint();
    }

    public void mouseDragged(MouseEvent event) {
        text = "Drag";	repaint();
    }
    
    public void mouseMoved(MouseEvent event) {
        text = "Move";	repaint();
    }
}
