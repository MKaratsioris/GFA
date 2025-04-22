public class MaximumFinder {
    public static void main(String[] args) {
        // Write a function which returns the largest element of an array using recursion.

        int[] n = {86432, 407, 45, 6, -50, -6410, 404};
        System.out.println(maximumFinder(n, n.length));
    }

    public static int maximumFinder(int[] n, int arrayLength) {
        if (arrayLength == 0) {
            return -1;
        } else if (arrayLength == 1) {
            return n[0];
        } else {
            return Math.max(n[arrayLength-1], maximumFinder(n, arrayLength - 1));
//            return Math.min(n[arrayLength-1], maximumFinder(n, arrayLength - 1));
        }
    }
}