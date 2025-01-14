// File : ConstructorFinalizerTest.java
// Display order in which superclass and subclass
// constructors and finalizers are called.
public class ConstructorFinalizerTest {
    public static void main( String args[] )
    {
       Point3 point;
       Circle3 circle1, circle2;
       
       point = new Point3( 11, 22 );
       circle1 = new Circle3( 72, 29, 4.5 );
       circle2 = new Circle3( 5, 7, 10.67 );

       point = null;    // mark for garbage collection
       circle1 = null;  // mark for garbage collection
       circle2 = null;  // mark for garbage collection 
       System.gc();  // call the garbage collector
       System.out.println();

    } // end main
 } // end class ConstructorFinalizerTest
 
