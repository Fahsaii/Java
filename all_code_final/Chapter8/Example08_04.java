import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
public class Example08_04 {
    public Example08_04() {
        JFrame window = new JFrame("GUI 2 with BorderLayout");
        JTextArea textArea1, textArea2, textArea3;
        JButton btn;
        JScrollPane scroll;
        Container c = window.getContentPane();
        c.setLayout(new BorderLayout( 10,10));
        c.add( new JLabel("Example use BorderLayout"),BorderLayout.NORTH);
        textArea1 = new JTextArea(6, 14);
        textArea1.setText("This West");
        c.add( textArea1, BorderLayout.WEST);
        textArea2 = new JTextArea(6, 14);
        textArea2.setText("This Center");
        scroll = new JScrollPane(textArea2);
        c.add( scroll, BorderLayout.CENTER);
        textArea3 = new JTextArea(6, 14);
        textArea3.setEditable(false);
        textArea3.setText("This East");
        c.add(textArea3, BorderLayout.EAST);

        btn = new JButton(" South ");
        c.add( btn, BorderLayout.SOUTH);
        window.setSize(400, 300);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Example08_04();
    }
}