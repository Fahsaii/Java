import java.io.*;
public class Example13_01 {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("readme.txt");
            FileWriter out = new FileWriter("output.dat");
            char buf[] = new char[64];
            int countRead = in.read(buf);
            // countRead = -1 no data, otherwise  
            while ( countRead != -1) {
                System.out.print(buf);
                out.write(buf, 0, countRead);
                countRead = in.read(buf);
            }
            in.close();     //  close stream input
            out.close();    //  close stream output
            System.out.println( "\nRead and write data to file complete.");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
