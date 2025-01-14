import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
public class Example08_08 implements ActionListener {
    JFrame window = new JFrame("Summation Number Application");
    JLabel numberLabel, resultLabel;
    JTextField numberField, resultField;
    
    public Example08_08() {
        Container c = window.getContentPane();
        c.setLayout( new FlowLayout() );
        numberLabel = new JLabel("Enter an integer and press Enter");
        c.add( numberLabel );
        numberField = new JTextField( 10 );
        c.add( numberField );
        // create event
        numberField.addActionListener( this);
        // create resultLabel and attach it to content pane
        resultLabel = new JLabel( "Summation value is" );
        c.add( resultLabel );
        resultField = new JTextField( 15 );
        resultField.setEditable( false );
        c.add( resultField );
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        window.setSize( 350,150);
        window.setVisible(true);
    }
    @Override
    public void actionPerformed( ActionEvent event )
    {  
        long number, sumValue;
        number = Long.parseLong( numberField.getText() );
        sumValue = summation( number );
        resultField.setText( Long.toString( sumValue ) );
        numberField.setText("");
    } // end method actionPerformed
  
    public long summation( long n ) {
        long total = 0;
        for(long x = 0 ; x <= n ; x++)
            total += x;
        return(total);
    } // end method summation
    public static void main(String[] args) {
        new Example08_08();
    }
 }
