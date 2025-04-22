import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer!");
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while ( i < n ) {
            for ( int j = 0; j < (i+1); j++ ) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
