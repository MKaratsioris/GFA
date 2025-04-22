import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input pronto, 5 integers!");
        int firstNumber = Integer.parseInt(scanner.next());
        int secondNumber = Integer.parseInt(scanner.next());
        int thirdNumber = Integer.parseInt(scanner.next());
        int fourthNumber = Integer.parseInt(scanner.next());
        int fifthNumber = Integer.parseInt(scanner.next());
        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        double average = (double)sum / 5;
        System.out.println("The total sum is " + sum);
        System.out.println("The average is " + average);
    }
}
