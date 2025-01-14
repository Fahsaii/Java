import javax.swing.*;
import java.awt.*;
public class Example09_04 extends JFrame {
    public Example09_04() {   
        super("Call paint Method in Oerride Method");  
        setSize( 400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g ) {
        super.paint(g);
        g.drawString("Hello World", 50, 100);
        g.drawString("Test cal graphics", 250, 200);
    }
    public static void main(String args[] ) {
        new Example09_04();
    }
}
