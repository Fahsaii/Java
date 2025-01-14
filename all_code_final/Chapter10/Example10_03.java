public class Example10_03 {
    public static void main( String args[] ) {
        String output;

        output = "Persons before instantiation: " + Person.getCount();
        // create two Persons; count should be 2
        Person p1 = new Person( "Susan", "Baker" );
        Person p2 = new Person( "Bob", "Jones" );
        
        // prove that count is 2 after creating two Persons
        output += "\n\npersons after instantiation: " +
            "\n p1.getCount(): " + Person.getCount() +
            "\n p2.getCount(): " + Person.getCount() +
            "\n Person.getCount(): " + Person.getCount();   
        // get names of Persons
        output += "\n\nPerson 1: "+p1.getName() +" "+p1.getSurname() +
                  "\nPerson 2: "+p2.getName()+" "+p2.getSurname();
        // decrement reference count for each Employee object; in this 
        // example, there is only one reference to each Employee, so these
        // statements mark each Employee object for garbage collection
        p1 = null; 
        p2 = null;  
        System.gc(); // suggest call to garbage collector

        // show Employee count after calling garbage collector; count 
        // displayed may be 0, 1 or 2 based on whether garbage collector
        // executes immediately and number of Employee objects collected
        output += "\n\nPersons after System.gc(): "+ Person.getCount();
        
        
        System.out.println("Static Members" );      
        System.out.println( output );
    }
}
