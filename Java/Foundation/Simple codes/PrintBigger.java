import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type, 2 integers!");
        int x = Integer.parseInt(scanner.next());
        int y = Integer.parseInt(scanner.next());
        if ( x > y ) {
            System.out.println(x + " is greater than " + y);
        } else if ( x < y ) {
            System.out.println(x + " is less than " + y);
        } else {
            System.out.println(x + " is equal to " + y);
        }
    }
}
