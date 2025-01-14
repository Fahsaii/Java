// File : Point2.java
// Point class declaration represents an x-y coordinate pair.

public class Point2 {
    private int x;  // x part of coordinate pair
    private int y;  // y part of coordinate pair

    public Point2() {
       // implicit call to Object constructor occurs here
    } 

    public Point2( int x, int y ) {
       // implicit call to Object constructor occurs here
       setX( x );   // no need for validation
       setY( y );  // no need for validation
    } 
  
    public void setX( int x) {
       this.x = x;  // no need for validation
    } 

    public int getX() {
        return this.x;
    } 

    public void setY( int y ) {
        this.y = y;  // no need for validation
    } 

    public int getY()  {
        return this.y;
    } 

    public String toString() {
        return "[" + getX() + ", " + getY() + "]";
    } 
    
} // end class Point2


