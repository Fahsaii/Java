public class Person {
    private String name;
    private String surname;
    private static int count = 0;  // number of objects in memory
    public Person( String name, String surname ) {
        this.name = name;
        this.surname = surname;
        ++count;  // increment static count of employees
        System.out.println( "Person constructor: " +
        this.name + " " + this.surname );
    }
    protected void finalize() {
        --count;  // decrement static count of employees
        System.out.println( "Person finalizer: " +
            this.name + " " + this.surname + "; count = " + count );
    }
    // get first name
    public String getName() { 
        return this.name; 
    }

    // get surname
    public String getSurname()  { 
        return this.surname; 
    }

    // static method to get static count value
    public static int getCount() { 
        return count; 
    } 
 }
