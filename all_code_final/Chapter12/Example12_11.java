import java.awt.event.*;
import java.awt.*;
import javax.swing.Timer;
import javax.swing.*;
import java.time.LocalDateTime;
public class Example12_11 extends JFrame implements ActionListener {
    JTextField  display;
    Timer timer;
    public Example12_11() {
        super("Time");
        timer = new Timer(1000, this);
        timer.start(); 
        setForeground(Color.BLUE);
        setFont(new Font("Century Gothic",Font.BOLD, 40));
        setSize(200, 80);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
        super.paint(g);
        LocalDateTime now = LocalDateTime.now();
        g.setColor(Color.DARK_GRAY);
        g.drawString(now.toString().substring(11,19), 14, 65); 
        g.setColor(Color.BLUE);
        g.drawString(now.toString().substring(11,19), 16, 67); 
    } 
    public void actionPerformed(ActionEvent e) {
        repaint();
    }  
    public static void main(String [] args) {
        new Example12_11();
    }   
 }      
 
