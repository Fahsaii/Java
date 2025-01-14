import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
public class Example08_09 implements ActionListener {
    JFrame window;
    JLabel number1Label, number2Label, resultLabel;
    JTextField number1Field, number2Field,resultField;
    JButton btn1, btn2, btn3, btn4;
    
    public Example08_09() {
        window = new JFrame("Calculate Number Application");
        Container c = window.getContentPane();
        c.setLayout( new FlowLayout() );
        // create numberLabel and attach it to content pane
        number1Label = new JLabel( "Enter number 1 " );
        c.add( number1Label );
        number1Field = new JTextField( 10 );
        c.add( number1Field );
        number2Label = new JLabel( "Enter number 2 " );
        c.add( number2Label );
        number2Field = new JTextField( 10 );
        c.add( number2Field );
        resultLabel = new JLabel( "Result value is" );
        c.add( resultLabel );
        resultField = new JTextField( 15 );
        resultField.setEditable( false );
        c.add( resultField );
        
        btn1 = new JButton(" + ");
        btn1.addActionListener( this);
        c.add( btn1 );
        btn2 = new JButton(" - ");
        btn2.addActionListener( this);
        c.add( btn2 );
        btn3 = new JButton(" * ");
        btn3.addActionListener( this);
        c.add( btn3 );
        btn4 = new JButton(" / ");
        btn4.addActionListener( this);
        c.add( btn4 );
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize( 300,150);
        window.setVisible(true);
    }
    
    public void actionPerformed( ActionEvent event ) {  
        int num1 = Integer.parseInt(number1Field.getText()) ;
        int num2 = Integer.parseInt(number2Field.getText()) ;
        if (event.getSource() == btn1) 
            resultField.setText(Integer.toString(num1+num2) ) ;
        else if (event.getSource() == btn2) 
            resultField.setText(Integer.toString(num1-num2) ) ;
        else if (event.getSource() == btn3) 
            resultField.setText(Integer.toString(num1*num2) ) ;
        else if (event.getSource() == btn4) 
            resultField.setText(Float.toString((float)num1/num2) ) ;
    } // end method actionPerformed
  
    public static void main(String[] args) {
        new Example08_09();
    }
 }