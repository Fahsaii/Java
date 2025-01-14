// File : Circle2.java
// Circle2 class inherits from Point2 and accesses Point2's
// private x and y via Point2's public methods.
public class Circle2 extends Point2 {
    private double radius;  // Circle2's radius

    public Circle2() {
       // implicit call to Point3 constructor occurs here
    } 

    public Circle2( int x, int y, double radius ) {
       super( x, y );  // call Point2 constructor explicitly
       setRadius( radius );
    } 

    public void setRadius( double radius ) {
        this.radius = ( radius < 0.0 ? 0.0 : radius );
    } 

    public double getRadius() {
        return this.radius;
    } 
    
    public double getDiameter() {
        return 2 * getRadius();
    } 
  
    public double getCircumference() {
        return Math.PI * getDiameter();
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    } 
  
    public String toString() {
        return "Center = " + super.toString() + "; Radius = "+getRadius();
    }  
} // end class Circle2
  
