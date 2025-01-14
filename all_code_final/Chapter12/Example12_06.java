import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example12_06 extends JFrame  implements KeyListener{
    JTextField textField;
    String text = "";
    
    public Example12_06() {
        Container c = getContentPane();
        c.setLayout( new FlowLayout() );
        c.add( new JLabel("Enter number : ") );
        textField = new JTextField(10);
        textField.setFont(new Font("Arial", Font.BOLD, 20) ); 
        textField.addKeyListener(this);
        c.add(textField);
        setVisible(true);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString( text , 20, 160);
    }
    public void keyPressed(KeyEvent event) {  }
    public void keyReleased(KeyEvent event) {
        char  ch = event.getKeyChar();
        if (ch >= '0' && ch <= '9')
            text = textField.getText();
        else if (ch >= 'a' && ch <= 'z')
            textField.setText( text );
        else if (ch >= 'A' && ch <= 'Z')
            textField.setText( text );
        repaint();
    }
    public void keyTyped(KeyEvent event) {
        Graphics g = getGraphics();
        g.drawString( text, 20, 160);
    }
    public static void main(String [] args) {
        new Example12_06();
    }
}


