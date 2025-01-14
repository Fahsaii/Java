public class Student {
    private String stdId;
    private String stdName;
    private String stdSurName;
    public Student() {
    }
    public Student(String id) {
        setStdId( id );
    }
    public Student(String id, String name, String surname) {
        setStdId( id );
        setStdName( name);
        setStdSurName( surname);
    }
    public void setStdId(String id) {
        this.stdId = id;
    }
    public void setStdName(String name) {
        this.stdName = name;
    }
    public void setStdSurName(String surname) {
        this.stdSurName = surname;
    }
    public String getStdId( ) {
        return this.stdId;
    }
    public String getStdName( ) {
        return this.stdName;
    }
    public String getStdSurName( ) {
        return this.stdSurName;
    }
    public String toString( ) {
        String s = "";
        s = getStdId() + " " + getStdName() + " " + getStdSurName();
        return s;
    }

}
