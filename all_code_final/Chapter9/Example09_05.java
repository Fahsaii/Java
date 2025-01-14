import javax.swing.*;
import java.awt.*;
public class Example09_05 extends JFrame {

    public Example09_05() {
        super("Test Line, Rectangle and Oval");  
        setSize( 700,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g ) {
        super.paint(g);
        showLine(g);
        showRectangle(g);
        showOval(g);
    }
    public void showLine(Graphics g) {
        g.setColor( Color.RED );
        g.drawLine( 20, 35, 480, 35 );
        g.drawLine( 20, 60, 480, 60 );
        g.drawString("drawString", 20, 50);
    } 
    public void showRectangle(Graphics g) {
        g.setColor( Color.BLUE );
        g.drawRect( 25, 70, 90, 55 );
        g.drawString("drawRect", 35, 85);
        
        g.fillRect( 120, 70, 90, 55 );
        g.setColor( Color.WHITE );
        g.drawString("fillRect", 125, 85);
                super.setBackground(Color.GREEN);
        g.clearRect( 215, 70, 90, 55 );
        g.drawString("clearRect", 230, 85);
  
        g.setColor( Color.CYAN );
        g.fillRoundRect( 310, 70, 90, 55, 50, 50 );
        g.setColor( Color.BLACK );
        g.drawString("fillRoundRect", 315, 85);
        
        g.setColor( Color.CYAN );
        g.drawRoundRect( 405, 70, 90, 55, 20, 20 );
        g.setColor( Color.BLACK );
        g.drawString("drawRoundRect", 410, 85);

        g.setColor( Color.YELLOW );   
        g.draw3DRect( 500, 70, 90, 55, true );
        g.setColor( Color.BLACK );
        g.drawString("draw3DRect", 505, 85);
        g.setColor( Color.YELLOW ); 
        g.fill3DRect( 595, 70, 90, 55, false );
        g.drawString("fill3DRect", 600, 85);
    }
    public void showOval(Graphics g) {
        g.setColor( Color.MAGENTA );
        g.drawOval( 25, 135, 90, 55 );
        g.setColor( Color.BLACK );
        g.drawString("drawOval", 30, 150);
        
        g.setColor( Color.MAGENTA );
        g.fillOval( 120, 135, 90, 55 );
        g.setColor( Color.WHITE );
        g.drawString("fillOval", 125, 150);
        
        g.setColor( Color.MAGENTA );
        g.fillOval( 215, 135, 55, 90 );
        g.setColor( Color.WHITE );
        g.drawString("fillOval", 220, 150);

        g.setColor( Color.MAGENTA );
        g.drawOval( 275, 135, 55, 55 );
        g.setColor( Color.BLACK );
        g.drawString("drawOval", 280, 150);
    }
    public static void main(String args[] ) {
        new Example09_05();
    }   
}
