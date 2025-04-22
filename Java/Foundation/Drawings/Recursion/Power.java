public class Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, write a recursive method (no loops)
        // which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3 squared).

        int n = 3;
        int m = 2;
        System.out.println(powerN(n,m));
    }

    public static int powerN(int base, int exp) {
        if (base < 1 || exp <= 0) {
            return 1;
        } else {
            return base * powerN(base,--exp);
        }
    }
}
