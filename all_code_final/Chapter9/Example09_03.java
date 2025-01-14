import javax.swing.*;
import java.awt.*;
public class Example09_03 {
    JFrame window = new JFrame("Test Graphics");
    public Example09_03() {        
        window.setSize( 400, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        paint( window.getGraphics());
    }
    public void paint(Graphics g ) {
        g.drawString("Hello World", 50, 100);
        g.drawString("Test cal graphics", 250, 200);
    }
    public static void main(String args[] ) {
        new Example09_03();
    }
}
