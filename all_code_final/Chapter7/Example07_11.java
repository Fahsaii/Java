import java.util.Random;
import javax.swing.JOptionPane;
public class Example07_11 {
    public static void main(String[] args) {
        int array[] = new int[20];
        String str;
        boolean done = true;
        int key, result;
        setData(array);
        bubbleSort(array);
        do {
            str = JOptionPane.showInputDialog( 
                    "Enter value to search(-1 - Exit) :");
            key = Integer.parseInt(str);                
            result = binarySearch(array, key);
            if (key != -1) {
                if (result != -1) {
                    JOptionPane.showMessageDialog( null,
                      "Value " + key +" found in element no "+result,
                            "Binary Search",            
                            JOptionPane.INFORMATION_MESSAGE );
                } else {
                    JOptionPane.showMessageDialog( null,
                            "Value not found.",
                            "Binary Search",
                            JOptionPane.INFORMATION_MESSAGE );
                }
            } else done = false;
        } while (done);
    }
    public static void setData(int a[])  {
        Random rnd = new Random();
        for(int c = 0 ; c < a.length ; c++)
            a[c] = rnd.nextInt( 51);
    }
        
    public static int binarySearch(int a[], int key)  {
        int low = 0, high = a.length - 1, middle;         
        while ( low <= high) {
            middle = (low + high) / 2; 
            if (a[middle] == key)   return middle;
            else if (key < a[middle]) high = middle - 1;
            else low = middle + 1;
        }
        return(-1);
    }

    public static void bubbleSort(int a[] )  {
        for(int pass = 1 ; pass < a.length ; pass++)
            for (int n = 0 ; n < a.length - pass ; n++)
                if (a[n] > a[n+1])  {
                    int temp = a[n];
                    a[n] = a[n+1];
                    a[n+1] = temp;
                }
    } 
    
}
