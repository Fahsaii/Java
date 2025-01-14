import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Example12_07 extends JFrame implements KeyListener, 
MouseListener  {
    private int x, y, size, xCenter, yCenter;
    private int width, height;
    private char typeShape = 'R';
    public Example12_07() {
        super("Example 12-7 use KeyListener and MouseListener");
        width = 600;       height = 600;      size = 50;
        xCenter = width/2;      yCenter = height/2;
        x = (width/2) - (size/2);
        y = (height/2) - (size/2);
        addKeyListener( this );
        setFocusable(true);
        addMouseListener( this );
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }  
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GREEN);
        if (typeShape == 'R') {
            g.fillRect( x, y, size , size);   
            g.setColor( Color.DARK_GRAY );
            g.drawRect( x, y, size, size);
        }
        else {
            g.fillOval( x, y, size , size);   
            g.setColor( Color.DARK_GRAY );
            g.drawOval( x, y, size, size);
        }
        g.setColor(Color.BLACK);
        g.drawLine(1, yCenter, width, yCenter);
        g.drawLine(xCenter, 1, xCenter, height);
    }   
    public void mousePressed(MouseEvent event) {
       Graphics g = getGraphics();
       g.setColor(Color.BLACK);        
       g.drawString(""+getSize(xCenter,event.getX()), event.getX(), 
						event.getY());
    }
    public void mouseReleased(MouseEvent event) {
        repaint();
    }  
    public void mouseClicked(MouseEvent event) {
        this.size = getSize(xCenter, event.getX());
        this.x = (width/2) - (size/2);
        this.y = (height/2) - (size/2);
        System.out.println(x + " , "+ y);
    } 
    public void mouseEntered( MouseEvent event ) {  }
    public void mouseExited(MouseEvent event) {  }
    public void keyPressed(KeyEvent event) {
        if ( event.getKeyChar() == 'c')  typeShape = 'C';
        if ( event.getKeyChar() == 'r')  typeShape = 'R';
        repaint();
    } 
    public void keyReleased(KeyEvent event) {   }    
    public void keyTyped(KeyEvent event) {  }
    private int getSize(int xCenter, int x) {
        return ( Math.abs ( xCenter  - x) * 2 );
    }
    public static void main(String [] args ) {
        new Example12_07();
    }
}


