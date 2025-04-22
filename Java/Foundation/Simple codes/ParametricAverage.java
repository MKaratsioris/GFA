import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number
        // It would ask this many times to enter an integer
        // If all the integers are entered it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0;

        System.out.println("Enter an integer!");
        int n = Integer.parseInt(scanner.nextLine());
        for ( int i = 0; i < n; i++) {
            System.out.println("Enter one more integer!");
            int j = Integer.parseInt(scanner.nextLine());
            sum = sum + j;
            average = sum / (i+1);
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}
