public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // Write a recursive method which returns the greatest common divisor (GCD)
        // of two numbers. The method should be able to handle negative numbers!

        int n = 45;
        int m = 100;
        System.out.println(greatestCommonDivisor(n, m));
    }

    public static int greatestCommonDivisor(int n, int m) {
        if (n == 0 || m == 0) {
            return n;
        } else {
            return greatestCommonDivisor(m, n % m);
        }
    }
}