import java.util.Random;
import javax.swing.JOptionPane;
public class Example07_10 {
    
    public static void main(String[] args) {
        int array[] = new int[20];
        String str;
        boolean done = true;
        setData(array);
        do {
            str = JOptionPane.showInputDialog(
				"Enter value to search (-1 - Exit):");
            int key = Integer.parseInt(str);
            int result = linearSearch(array, key);
            if (key != -1) {
                if (result != -1) 
			JOptionPane.showMessageDialog( null,
                        "Value " + key + " found in element no " + result,
                        "Linear Search", JOptionPane.INFORMATION_MESSAGE );
                else
                    JOptionPane.showMessageDialog( null, 
                        "Value not found.", "Linear Search",                    
                        JOptionPane.INFORMATION_MESSAGE );
            }
            else done = false;
        }while (done);
    }
    public static void setData(int a[])   {
        Random rnd = new Random();
        for(int c = 0 ; c < a.length ; c++) 
            a[c] = rnd.nextInt(51);
    }

    public static int linearSearch(int a[], int key)  {
        for(int c = 0 ; c < a.length ; c++)
            if (a[c] == key)  return(c);
        return(-1);
    }

}
