import javax.swing.*;
import java.awt.*;
public class Example09_06 extends JFrame  {
    public Example09_06()  {
        super("Test Arc");  
        setSize( 400,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g ) {
        super.paint(g); // call superclass's paint method
        showArc(g);
    }
    public void showArc(Graphics g) {
        // start at 0 and sweep 360 degrees
        g.setColor( Color.MAGENTA );
        g.drawRect( 15, 35, 80, 80 );
        g.setColor( Color.BLACK );
        g.drawArc( 15, 35, 80, 80, 0, 360 );
        // start at 0 and sweep 110 degrees
        g.setColor( Color.MAGENTA );
        g.drawRect( 100, 35, 80, 80 );
        g.setColor( Color.BLACK );
        g.drawArc( 100, 35, 80, 80, 0, 110 );
        // start at 0 and sweep -270 degrees
        g.setColor( Color.MAGENTA );
        g.drawRect( 185, 35, 80, 80 );
        g.setColor( Color.BLACK );
        g.drawArc( 185, 35, 80, 80, 0, -270 );
        // start at 0 and sweep 360 degrees
        g.setColor( Color.YELLOW );
        g.fillArc( 15, 120, 80, 40, 0, 360 );
        // start at 270 and sweep -90 degrees
        g.setColor( Color.CYAN);
        g.fillArc( 100, 120, 80, 40, 270, -90 );
        // start at 0 and sweep -270 degrees
        g.setColor( Color.ORANGE );
        g.fillArc( 185, 120, 80, 40, 0, -270 );
    }
    public static void main(String args[] ) {
        new Example09_06();
    }   
}
