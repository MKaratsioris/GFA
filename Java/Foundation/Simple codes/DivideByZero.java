import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("With which number should 10 be divided?");
        int inputNumber = scanner.nextInt();
        divide(inputNumber);

    }

    public static void divide(int n) {
        try {
            int result = 10 / n;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("fail");
            System.exit(1);
        }
    }
}
