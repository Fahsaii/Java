// File : CylinderTest.java
// Testing class Cylinder.
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CylinderTest {
    public static void main( String[] args ) 
    {
        Cylinder cylinder = new Cylinder( 12, 23, 2.5, 5.7 );
        String output = "X coordinate is " + cylinder.getX() +
            "\nY coordinate is " + cylinder.getY() + 
		    "\nRadius is " + cylinder.getRadius() +
 		    "\nHeight is " + cylinder.getHeight();
        cylinder.setX( 35 );          // set new x-coordinate
        cylinder.setY( 20 );          // set new y-coordinate
        cylinder.setRadius( 4.25 );   // set new radius
        cylinder.setHeight( 10.75 );  // set new height
        output += "\n\nThe new location, cylinder are\n" + 
			cylinder.toString();
        DecimalFormat twoDigits = new DecimalFormat( "0.00" );
        output += "\n\nDiameter is " + twoDigits.format( 
			cylinder.getDiameter() );
        output += "\nCircumference is " + twoDigits.format( 
			cylinder.getCircumference() );
        output += "\nArea is " + twoDigits.format( 
			cylinder.getArea() );
        output += "\nVolume is " + twoDigits.format(
			cylinder.getVolume() );
        JOptionPane.showMessageDialog( null, output ); 
        System.exit( 0 );
    } // end main

} // end class CylinderTest