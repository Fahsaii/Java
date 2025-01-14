import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
public class Example08_06 {
    JFrame window = new JFrame("GUI 4 : JList , JComboBox");
    JList list;
    JComboBox comboBox;
    public Example08_06( ) {
        Container c = window.getContentPane();
        c.setLayout( new FlowLayout() );
        createGui(c);
        window.setSize( 350,150);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void createGui(Container c) {
        String strList[] = {"List 1","List 2","List 3","List 4"};
        list = new JList<>(strList);
        list.setFont(new Font("Tahoma", Font.BOLD, 16));
        list.setSelectedIndex(1);
        comboBox = new JComboBox<>();
        comboBox.addItem("ComboBox 1");
        comboBox.addItem("ComboBox 2");
        comboBox.addItem("ComboBox 3");
        comboBox.addItem("ComboBox 4");
        comboBox.setSelectedIndex(2);
        c.add(list);
        c.add(comboBox);
    }
    public static void main(String[] args) {
        Example08_06 obj = new Example08_06();
    }
}
