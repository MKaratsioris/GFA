import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {
        // - Create an array variable named `numberList`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Double all the values in the array

        int[] numberList = new int[] {3, 4, 5, 6, 7};

        for (int i = 0; i < numberList.length; i++) {
            numberList[i] *= 2;
        }

        System.out.println(Arrays.toString(numberList));
    }
}
