import business.Company;

public class Person {
    private final double PI = 3.14;
    private final String MY_WORD = "HEllo world";
    private String firstName = "Siva Kumar";
    private int age;
    private char middleInitial;
    private long id;
    static private Company company = new Company();
    private NewsAgency news;

    public void sayHello(){
        System.out.println("Heloo dudes");

    }


    public static void main(String[] args) {
        //System.out.println(firstName); //no static key word
        System.out.println(company); //static key word
        Person p1 = new Person();
        p1.sayHello();
    }
}
