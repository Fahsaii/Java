// File : Circle3.java
// Circle4 class declaration.
public class Circle3 extends Point3 {
    private double radius;  // Circle3's radius
    public Circle3() {
        // implicit call to Point constructor occurs here
        System.out.println( "Circle3 no-argument constructor: " + this );
    } 

    public Circle3( int x, int y, double radius ) {
        super( x, y );  // call Point constructor
        setRadius( radius );
        System.out.println( "Circle3 constructor: " + this );
    } 

    protected void finalize() {
        System.out.println( "Circle3 finalizer: " + this );
        super.finalize();  // call superclass finalize method
    }

    public void setRadius( double radius ) {
        this.radius = ( radius < 0.0 ? 0.0 : radius );
    } 
    
    public double getRadius() {
        return radius;
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
        return "Center = " + super.toString() + "; Radius = " + getRadius();
    } 
} // end class Circle3 
