import java.awt.*;
import javax.swing.*;

public class Example12_09 extends JFrame {
    private ImageIcon image1, image2, image3;   
    public Example12_09() {
        super("Example 12-9 Using ImageIcon on JFrame");
        image1 = new ImageIcon( this.getClass().getResource("images/logo.png" ));
        image2 = new ImageIcon( this.getClass().getResource("images/cat.png" ));
        image3 = new ImageIcon( this.getClass().getResource("images/boat.png" ));
        setSize(640, 350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    public void paint(Graphics g) {
        super.paint(g);
        image1.paintIcon( this, g, 20, 40 );
        image2.paintIcon( this, g, 160, 40 );
        image3.paintIcon( this, g, 320, 40 );

        g.setFont(new Font("Tahoma",Font.BOLD, 14));
        g.setColor(Color.BLUE);
        g.drawString("Width = " + image1.getIconWidth() + " pixel", 20, 200);
        g.drawString("Height = " + image1.getIconHeight()+ " pixel", 20, 220);
        g.drawString("Width = " + image2.getIconWidth() + " pixel", 170, 200);
        g.drawString("Height = " + image2.getIconHeight()+ " pixel", 170, 220);
        g.drawString("Width = " + image3.getIconWidth() + " pixel", 330, 300);
        g.drawString("Height = " + image3.getIconHeight()+ " pixel", 330, 320);
    }

    public static void main(String[] args) {
        new Example12_09();
    }
}
