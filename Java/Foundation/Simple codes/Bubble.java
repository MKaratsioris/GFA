import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as parameter
        //  and returns an array where the elements are sorted in ascending numerical order
        //  When you are done, add a second boolean parameter to the function
        //  If it is `true` sort the array descending, otherwise ascending

        //  Example:
        //  System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        //  System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]

        int[] integers = new int[] {1, 105, 34, 12, 24, 9, 5};
        // bubble(integers);
        // bubble(integers, false);
        bubble(integers, true);

    }
    public static void bubble(int[] arrayInt) {
        Arrays.sort(arrayInt);
        System.out.println(Arrays.toString(arrayInt));
    }

    public static void bubble(int[] arrayInt, boolean bool) {
        if (!bool) {
            Arrays.sort(arrayInt);
        }
        else {
            int[] swapNumbers = new int[arrayInt.length];
            System.arraycopy(arrayInt, 0, swapNumbers, 0, arrayInt.length);
            for (int i = 0; i < arrayInt.length; i++) {
                for (int j = 0; j < arrayInt.length - i; j++) {
                    arrayInt[i] = swapNumbers[j];
                }
            }
        }
        System.out.println(bool);
        System.out.println(Arrays.toString(arrayInt));
    }
}
