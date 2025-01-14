// File : Circle.java
// Circle class contains x-y coordinate pair and radius.
public class Circle {
   private int x;          // x-coordinate of Circle's center
   private int y;          // y-coordinate of Circle's center
   private double radius;  // Circle's radius
 
   // no-argument constructor
   public Circle()  {
      // implicit call to Object constructor occurs here
   } 
 
   // constructor
   public Circle( int x, int y, double radius ) {
      // implicit call to Object constructor occurs here
      this.x = x;  // no need for validation
      this.y = y;  // no need for validation
      setRadius( radius );
   } 

   public void setX( int x ) {
      this.x = x;  // no need for validation
   } 

   public int getX() {
      return x;
   } 

   public void setY( int y ) {
      this.y = y;  // no need for validation
   } 

   public int getY() {
      return y;
   } 

   public void setRadius( double radius ) {
      this.radius = ( radius < 0.0 ? 0.0 : radius );
   } 

   public double getRadius() {
      return radius;
   } 

   public double getDiameter() {
      return 2 * radius;
   } 

   public double getCircumference() {
      return Math.PI * getDiameter();
   } 

   public double getArea() {
      return Math.PI * radius * radius;
   }

   public String toString() {
      return "Center = [" + getX() + ", " + getY() + "]; Radius = " + getRadius();
   } 
} // end class Circle
 
