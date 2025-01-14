public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    public Employee( String first, String last, Date dateOfBirth, 
                        Date dateOfHire ) {
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
    }

    public String toEmployeeString()  {
        return lastName + ", " + firstName +  
                "  Hired: " + hireDate.toDateString() +  
                "  Birthday: " + birthDate.toDateString();
    }
}
