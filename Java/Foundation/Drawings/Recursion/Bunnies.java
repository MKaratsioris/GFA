public class Bunnies {
    public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears. Write
    // a recursive method (no loops or multiplication) which takes the number of
    // bunnies as its sole parameter and returns the total number of ears
    // the bunnies have. The method should be able to handle invalid input
    // (e.g. negative numbers)

    int n = 10;
    System.out.println(totalBunnies(n));
}

    public static int totalBunnies(int numBunnies) {
        if (numBunnies < 1) {
            return 0;
        } else {
            return 2 + totalBunnies(--numBunnies);
        }
    }
}
