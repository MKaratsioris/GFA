import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers`
        // - Print the elements of the reversed `numbers`

        int[] integers = new int[] {3, 4, 5, 6, 7, 8};
        System.out.println("Before: " + Arrays.toString(integers));

        int[] swapNumbers = new int[integers.length];
        System.arraycopy(integers, 0, swapNumbers, 0, integers.length);
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length - i; j++) {
                integers[i] = swapNumbers[j];
            }
        }

        System.out.println("After: " + Arrays.toString(integers));
    }
}
