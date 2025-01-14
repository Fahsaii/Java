// File : Point.java
// Point class declaration represents an x-y coordinate pair.
public class Point {
   private int x; // x part of coordinate pair
   private int y; // y part of coordinate pair
 
   // no-argument constructor
   public Point() {
      // implicit call to Object constructor occurs here
   } 
 
   // constructor
   public Point( int x, int y ) {
      // implicit call to Object constructor occurs here
      this.x = x;  // no need for validation
      this.y = y;  // no need for validation
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

   public String toString() {
      return "[" + getX() + ", " + getY() + "]";
   } 
} // end class Point

