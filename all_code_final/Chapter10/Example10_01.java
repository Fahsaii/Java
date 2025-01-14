public class Example10_01 {

    public static void main( String args[] ) {
        Date birth = new Date( 7, 24, 1949 );
        Date hire = new Date( 3, 12, 1988 );
        Employee emp1 = new Employee( "Bob", "Jones", birth, hire);
        Employee emp2 = new Employee( "John", "Smith", 
                 new Date( 2, 12, 1950 ) , new Date( 8, 1, 1985 ) );

        System.out.println("Testing Class Employee");
        System.out.println( emp1.toEmployeeString()  ); 
        System.out.println( emp2.toEmployeeString()  ); 
    }   
}

