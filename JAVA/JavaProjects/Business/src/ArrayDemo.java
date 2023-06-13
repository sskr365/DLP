public class ArrayDemo {
    public static void main(String[] args) {
        //passing strings as arrays symbol is [] for array
        System.out.println(args);// prints address of array of strings
        //to print result from cmd line should use below command, class files are present in out...
        // java -cp out\production\Business ArrayDemo apple mango
        //before executing above command need to build project
        System.out.println(args.length);
        System.out.println(args[0]);//array start from 0
        int[] non = {1, 5, 7, 55, 67, 34, 435, 325, 45};
        System.out.println(non.length);
        System.out.println(non[4]);
    }
}
