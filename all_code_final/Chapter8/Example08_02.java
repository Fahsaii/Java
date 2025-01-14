import javax.swing.JFrame;
public class Example08_02 {
    JFrame window;
    public Example08_02() {
        window = new JFrame("Create Object JFrame in Class");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setVisible(true);
    }
    public static void main(String [] args) {
        Example08_02 ex8 = new Example08_02();
    }
}
