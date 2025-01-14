import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;
public class Example08_12 {
    public static void main(String[] args) {
        new MinMaxNumber(); 
    } 
}

class MinMaxNumber implements ActionListener {
    JFrame window = new JFrame("Min Max Program");
    JLabel label1,label2,label3;
    JTextField number1, number2, result;
    JButton btn;
    Container c = window.getContentPane();
    JPanel panel1, panel2;
    Font font = new Font("Tahoma", Font.BOLD, 16);
    // Constructor
    public MinMaxNumber() {
        c.setLayout( new FlowLayout(FlowLayout.CENTER, 10, 10));
        create_panel1();
        btn = new JButton(" Find Min ");
        btn.setFont( font);
        btn.addActionListener( this);
        c.add( btn );
        create_panel2();
        window.setSize( 500, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    
    public void create_panel1() {
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(460,80));
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
        panel1.setBorder(new LineBorder(Color.RED, 1));
        label1 = new JLabel("Enter number 1 : ");
        label1.setFont(font);
        panel1.add( label1 );
        number1 = new JTextField( 10 );
        number1.setFont( font);
        panel1.add( number1 );
        label2 = new JLabel("Enter number 2 : ");
        label2.setFont(font); 
        panel1.add( label2);
        number2 = new JTextField( 10 );
        number2.setFont( font);
        panel1.add( number2 );
        c.add(panel1);
    }
    public void create_panel2() {
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(460,100));
        panel2.setLayout(new FlowLayout( FlowLayout.CENTER, 10, 10));
        panel2.setBorder(new LineBorder(Color.blue, 1));
        label3 = new JLabel("Minimum Result : ");
        label3.setFont( font);
        panel2.add( label3 );
        result = new JTextField( 10 );
        result.setFont( font);
        result.setEditable(false);
        panel2.add( result);
        c.add(panel2);
    }
    public void actionPerformed( ActionEvent event ) {  
        int num1, num2, min;
        num1 = Integer.parseInt( number1.getText() );
        num2 = Integer.parseInt( number2.getText() );
        min = findMin( num1, num2);
        result.setText(Integer.toString(min));
        // clear value in numberField
        number1.setText("");
        number2.setText("");
    }   
    
    public int findMin(int n1, int n2) {
        return( Math.min(n1, n2));
    }
} 