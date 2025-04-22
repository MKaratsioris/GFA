public class NumberAdder {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and returns
        // the sum of numbers (integers) from 1 to n. The function should
        // return 0 for inputs less than 1.

        int n = 10;
        System.out.println(numberAdder(n));
    }

    public static int numberAdder(int n) {
        if (n < 1) {
            return 0;
        } else {
            return n + numberAdder(--n);
        }
    }
}
