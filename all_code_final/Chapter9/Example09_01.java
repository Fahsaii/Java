public class Example09_01 {
    
    public static void main(String [] args) {
        Student std1 = new Student();
        Student std2 = new Student("222");
        Student std3 = new Student("111","Somchai","Cheingpongpan" );

        System.out.println( std1.toString());
        System.out.println( std2);
        System.out.println( std3.toString());
    }
}
