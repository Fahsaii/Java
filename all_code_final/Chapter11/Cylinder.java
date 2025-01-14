// File : Cylinder.java
// Cylinder class inherits from Circle2.

public class Cylinder extends Circle2 {
    private double height;  // Cylinder's height

    public Cylinder() {
       // implicit call to Circle2 constructor occurs here
    } 
 
    public Cylinder( int x, int y, double radius, double height ) {
       super( x, y, radius ); // call Circle2 constructor
       setHeight( height );
    } 

    public void setHeight( double height ) {
       this.height = ( height < 0.0 ? 0.0 : height );
    } 
 
   public double getHeight() {
      return this.height;
   } 

   public double getArea() {
      return 2 * super.getArea() + getCircumference() * getHeight();
   } 

   public double getVolume() {
      return super.getArea() * getHeight();
   } 

   public String toString() {
      return super.toString() + "; Height = " + getHeight();
   }    
} // end class Cylinder