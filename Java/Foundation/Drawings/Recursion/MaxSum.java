import java.util.*;

public class MaxSum {
    public static void main(String[] args) {
        // Create a function called `maxSum` which
        // expects an array of five integers as an input parameter and
        // returns the maximum values that can be
        // calculated by summing exactly four of the five integers.
        //
        // Examples
        //
        // [1 2 3 4 5] -> 14
        //
        // We can calculate the following sums using four of the five integers:
        //
        // 1 + 2 + 3 + 4 = 10
        // 1 + 2 + 3 + 5 = 11
        // 1 + 2 + 4 + 5 = 12
        // 1 + 3 + 4 + 5 = 13
        // 2 + 3 + 4 + 5 = 14

        int[] n = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(maxSum(n,7));
    }

    public static int maxSum(int[] n, int m) {
//        Loop approach
//        --------------
//        Arrays.sort(n);
//        int sum = 0;
//        for (int i = n.length - 1; i > n.length - 1 - m ; i--) {
//            sum += n[i];
//        }
//        return sum;

//        Recursion approach
//        --------------
        if (m == 0) {
            return 0;
        } else if (m > n.length) {
            return n[n.length - 1] + maxSum(Arrays.copyOf(n, n.length - 1), n.length-1);
        } else {
            return n[n.length - 1] + maxSum(Arrays.copyOf(n, n.length - 1), m-1);
        }
    }
}