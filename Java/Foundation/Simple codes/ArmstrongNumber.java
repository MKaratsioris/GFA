import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which number would you like to check if it is an Armstrong number?");
        int number = Integer.parseInt(scanner.nextLine());

        if (isArmstrongNumber(number)){
            System.out.println(number + " is an Armstrong number");
        }
        else {
            System.out.println(number + " is not an Armstrong number");
        }
    }

    public static boolean isArmstrongNumber(int n) {
        boolean bool = false;
        int result = 0;

        String number = String.valueOf(n);

        String[] numberArray = number.split("");

        for (String digit : numberArray) {
            result += Math.pow(Integer.parseInt(digit), numberArray.length);
        }

        if (result == n) {
            bool = true;
        }

        return bool;
    }
}
