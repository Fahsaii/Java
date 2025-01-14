import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Example08_10 implements ActionListener{
    JFrame window = new JFrame("Summation with JList and JComboBox");
    JList list;
    JComboBox combo;
    JButton btn1, btn2;
   
    public Example08_10() {
        Container c = window.getContentPane();
        String strList[] = {"1","2","3","4","5","6","7","8","9","10"};
        c.setLayout( new FlowLayout() );
        c.add( new JLabel( "Select number : "));
        list = new JList(strList);
        list.setSelectedIndex(0);
        c.add( list);
        btn1 = new JButton("Sum");
        btn1.addActionListener(this);
        c.add( btn1);
        c.add( new JLabel( "Select number : ") );
        combo = new JComboBox<>(strList);
        combo.setSelectedItem(0);
        c.add(combo);
        btn2 = new JButton("Sum");
        btn2.addActionListener(this);
        c.add(btn2);
        window.setSize( 300,300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed( ActionEvent event ) {  
        int number, sumValue;
        if (event.getSource() == btn1) {
            number = Integer.parseInt(list.getSelectedValue().toString());
            JOptionPane.showMessageDialog(window, "Summation : " + 
						summation(number));
        }
        else if (event.getSource() == btn2) {
            number = Integer.parseInt(combo.getSelectedItem().toString());
            JOptionPane.showMessageDialog(window, "Summation : " + 
						summation(number));
        }
    } // end method actionPerformed


    public long summation( long n ) {
        long total = 0;
        for(long x = 0 ; x <= n ; x++)
            total += x;
        return(total);
    } // end method summation

    public static void main(String[] args) {
        new Example08_10();
    }
}
