public class Person {

    private String myName = "Siva Kumar Reddy";
    public void sayHello(){  //this method no input and no output
        System.out.println("Hello world of java methods");
    }
    public void myMethod(String test){ //this is not static type
        System.out.println(test);
    }

    public char getAnyChar(){  //as this method gives output need to use key "return"
        return myName.charAt(7);
    }
    public char getChar(String text){
        return text.charAt(2);
    }
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.myMethod("this is not static print");
        p1.myMethod("so not static key word");
        System.out.println(p1.getAnyChar()); // instead of this we can use below method also
        char myChar = p1.getAnyChar(); // this is by creating variable
        System.out.println(myChar);
        System.out.println(p1.getChar("Java world"));
        System.out.println(p1.add(19,67));
    }

}
