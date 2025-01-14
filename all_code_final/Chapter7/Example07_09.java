public class Example07_09 {
    
    public static void main(String[] args) {
        int array[] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};
        String output;

        output = "Data items in original order\n";
        for(int n = 1 ; n < array.length; n++)
                output += "   " + array[n];
        bubbleSort(array);
        output += "\n\nData items in ascending order\n";        
        for(int n = 1 ; n < array.length; n++) 
            output += "   " + array[n];
        System.out.println(output);
    }

    public static void bubbleSort(int a[]) {
        for(int pass = 1 ; pass < a.length ; pass++) {
            for (int n = 0 ; n < a.length - pass ; n++) {
                if (a[n] > a[n+1])  {
                    int temp = a[n];
                    a[n] = a[n+1];
                    a[n+1] = temp;
                }
            }
        }
    }
}
