import javax.swing.JFrame;
public class Example08_01 {
   public static void main(String [] args) {
      JFrame window;
      window = new JFrame("Create Object JFrame in Method main");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setSize(400, 300);
      window.setVisible(true);
   }
}
