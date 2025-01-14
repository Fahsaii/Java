import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example09_07 extends JFrame implements ActionListener {
    private Button okBtn;
    private JLabel strLabel, xLabel, yLabel;
    private JTextField strField, xField, yField;
    private Font myFont = new Font("Arial",Font.BOLD, 14);
    String mesg;
    int x, y;

    public Example09_07()  {
        super("Draw graphic by ActionListener");  
        Container c = getContentPane();
        c.setLayout( new FlowLayout());
        strLabel = new JLabel("Enter String : ");
        strLabel.setFont(myFont);
        c.add(strLabel);
        strField = new JTextField(15);
        strField.setFont(myFont);
        c.add(strField);
        xLabel = new JLabel("Coordinate X : ");
        xLabel.setFont(myFont);
        c.add(xLabel);
        xField = new JTextField(5);
        xField.setFont(myFont);
        c.add(xField);
        yLabel = new JLabel("Coordinate Y : ");
        yLabel.setFont(myFont);
        c.add(yLabel);
        yField = new JTextField(5);
        yField.setFont(myFont);
        c.add(yField);
        okBtn = new Button(" OK ");
        okBtn.addActionListener(this);
        c.add(okBtn);
        setSize( 800,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g ) {
        super.paint(g); // call superclass's paint method
        g.setColor(Color.BLUE);
        g.drawRect(15,32, 770,30);
        g.setColor(Color.BLACK);
        g.drawString(mesg, x, y+90);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        mesg = strField.getText();
        x = Integer.parseInt(xField.getText() );
        y = Integer.parseInt(yField.getText() );
        repaint();
    }

    public static void main(String args[] ) {
        new Example09_07();
    }

}
