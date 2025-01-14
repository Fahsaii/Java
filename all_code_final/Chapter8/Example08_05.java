import javax.swing.JFrame;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Example08_05 {
    JFrame window = new JFrame("GUI with  GridLayout ");
    Container c;
    public Example08_05() {
        c = window.getContentPane();
        c.setLayout(new GridLayout( 4, 2, 5, 5));
        createGui();
        window.setSize(400, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void createGui() {
        JLabel label1, label2;
        JTextField textField1, textField2;
        JButton btn1, btn2;
        JCheckBox checkBox1,checkBox2;
        label1 = new JLabel("Enter integer number 1 : ");
        label2 = new JLabel("Enter integer number 2 : ");
        textField1 = new JTextField(20);
        textField1.setToolTipText("1-100");
        textField2 = new JTextField(20);
        textField2.setToolTipText("1-100");
        checkBox1 = new JCheckBox("Book");
        checkBox2 = new JCheckBox("Sport");
        btn1 = new JButton(" OK ");
        btn2 = new JButton(" Cancle ");
        c.add( label1);
        c.add( textField1);
        c.add( label2);
        c.add( textField2);
        c.add(checkBox1);
        c.add(checkBox2);
        c.add( btn1);
        c.add( btn2);
    }

    public static void main(String[] args) {
        new Example08_05();
    }
}