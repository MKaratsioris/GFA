import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper and main method on your own

        // - Create a function called `calculateFactorial()`
        //   that returns the factorial of its input

        Scanner scanner = new Scanner(System.in);
        System.out.println("Whose number should I calculate the factorial?");
        double number = Integer.parseInt(scanner.nextLine());
        double fact = factorial(number);
        System.out.println(fact);

    }

    public static double factorial(double n) {
        double m = 1;
        for (double i = 1; i <= n; i++) {
            m *= i;
        }
        return m;
    }
}
