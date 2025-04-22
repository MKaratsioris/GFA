public class TwoNumbers {
    public static void main(String[] args) {
        // Create a program that prints a few operations on two numbers: 22 and 13
        int x = 22;
        int y = 13;

        // Print the result of 13 added to 22
        int a = x + y;
        System.out.println("x + y = " + a);

        // Print the result of 13 substracted from 22
        int s = x - y;
        System.out.println("x - y = " + s);

        // Print the result of 22 multiplied by 13
        int p = x * y;
        System.out.println("x * y = " + p);

        // Print the result of 22 divided by 13 (as a decimal fraction)
        double d = (double)x/y;
        System.out.println("x / y = " + d);

        // Print the integer part of 22 divided by 13
        int q = x / y;
        System.out.println("quotient (x / y) = " + q);

        // Print the remainder of 22 divided by 13
        int r = x % y;
        System.out.println("remainder (x / y) = " + r);

    }
}