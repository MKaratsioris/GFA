public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        //        int a = 123;
        //        int b = 526;
        //
        //        System.out.println(a);
        //        System.out.println(b);

        int a = 1;
        int b = 2;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a^b;
        b = a^b;
        a = a^b;


        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}