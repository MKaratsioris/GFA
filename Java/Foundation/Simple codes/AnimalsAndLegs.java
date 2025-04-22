import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chickens are there in the farm?");
        int chickens = Integer.parseInt(scanner.nextLine());
        System.out.println("And how many pigs?");
        int pigs = Integer.parseInt(scanner.nextLine());
        int legs = chickens * 2 + pigs * 4;
        System.out.println("All the animals have in total " + legs + " legs.");

    }
}
