import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own
        // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter

        Scanner scanner = new Scanner(System.in);
        System.out.println("Until which number should I add?");
        int number = Integer.parseInt(scanner.nextLine());
        sum(number);
//        int sum = sum(number);
//        System.out.println(sum);
    }

    public static void sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println(total);
//        return total;
    }
}