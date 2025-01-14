// File : Circle2Test.java
// Testing class Circle2.
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Circle2Test {
    public static void main( String[] args ) 
    {
        Circle2 circle = new Circle2( 37, 43, 2.5 ); 

        // get Circle3's initial x-y coordinates and radius
        String output = "X coordinate is " + circle.getX() +
            "\nY coordinate is " + circle.getY() +
            "\nRadius is " + circle.getRadius();
        circle.setX( 35 );         // set new x-coordinate
        circle.setY( 20 );         // set new y-coordinate
        circle.setRadius( 4.25 );  // set new radius

        output += "\n\nThe new location and radius of circle are\n" +
        circle.toString();
        DecimalFormat twoDigits = new DecimalFormat( "0.00" );
        output += "\nDiameter is "+twoDigits.format(circle.getDiameter());
        output += "\nCircumference is " + twoDigits.format( 
			circle.getCircumference() );
        output += "\nArea is " + twoDigits.format( circle.getArea() );
        JOptionPane.showMessageDialog( null, output ); // display output
        System.exit( 0 );
    } // end main

} // end class Circle2Test
