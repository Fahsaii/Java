import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example09_08 extends JFrame implements ActionListener {
    private Button grow, shrink, left, right, up, down;
    private Balloon myBalloon;
    public Example09_08()  {
        super("Use Class Draw Graphics");  
        Container c = getContentPane();
        c.setLayout( new FlowLayout());
        grow = new Button("Grow");
        grow.addActionListener(this);
        c.add(grow);
        shrink = new Button("Shrink");
        shrink.addActionListener(this);
        c.add(shrink);
        left = new Button("Left");
        left.addActionListener(this);
        c.add(left);
        right = new Button("Right");
        right.addActionListener(this);  
        c.add(right);
        up = new Button("Up");
        up.addActionListener(this);
        c.add(up);
        down = new Button("Down");
        down.addActionListener(this);  
        c.add(down);

        myBalloon = new Balloon();
        setForeground(Color.BLUE);
        setSize( 640,480);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == grow) 
            myBalloon.grow();         
        else if (event.getSource() == shrink) 
            myBalloon.shrink();
        else if (event.getSource() == left) 
            myBalloon.left();
        else if (event.getSource() == right) 
            myBalloon.right();
        else if (event.getSource() == up) 
            myBalloon.up();
        else if (event.getSource() == down) 
            myBalloon.down();

        repaint();
     }
 
     public void paint(Graphics g) {
         super.paint(g);
         myBalloon.display(g);
     }
 
    public static void main(String args[] ) {
        new Example09_08();
    }
}
