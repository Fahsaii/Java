import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Example12_08 extends JFrame implements ActionListener, 
KeyListener  {
    private int width, height;
    private JButton startBtn, stopBtn;
    private Animation animation;
    public Example12_08() {
        super("Animation with KeyListener and ActionListener");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        addKeyListener(this);
        setFocusable(true);
        startBtn = new JButton("Play");
        startBtn.addActionListener(this);
        c.add(startBtn);        
        stopBtn = new JButton("Stop");
        stopBtn.addActionListener(this);   
        c.add(stopBtn);
        width = 700;    height = 600;
        animation =  new Animation(640, 480); 
        c.add( animation);
        setSize( width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);  
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn)  animation.play();
        else if (e.getSource() == stopBtn) animation.stop();
    }
    public void keyPressed(KeyEvent event) {
        if ( event.getKeyChar() == 'p') animation.play();
        else if ( event.getKeyChar() == 's')  animation.stop();
        repaint();
    } 
    public void keyReleased(KeyEvent event) { }
    public void keyTyped(KeyEvent event) { }
    public static void main(String[] args) {
        new Example12_08();
    }
}

