import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number and the user has to figure it out
        // The user can input guesses
        // After each guess the program would tell one of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8


        Scanner scanner = new Scanner(System.in);
        int number = 5;

        System.out.println("Guess my number!");
        int a = 0;
        do {
            a = Integer.parseInt(scanner.nextLine());
            if (a != number) {
                System.out.println("Guess again!");
            } else {
                System.out.println("Congratulations!!");
                System.out.println(a + " was my number!");
            }
        }  while (a != number);

    }
}
