import java.util.Arrays;
//import java.util.Scanner;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as parameters
        //  It returns the indices of the integers of the array which contain the given number
        //  or returns an empty array (if the number is not part of the integers in the array)

        //  Examples:
        //  System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] {1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        //  System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] {1, 11, 34, 52, 61})));
        //  should print: '[]'

        // Note: We are using Arrays.toString() function to print the array returned
        // You could just as well iterate over the array and print its items one by one

        int number = 5;
        int[] testArray = {1, 11, 34, 52, 61, 105, 437};
        String result = findMatchingIndexes(number,testArray);
        System.out.println(result);


    }
    public static String findMatchingIndexes(int num, int[] arrayName) {
        int indices = 0;
        // Check all numbers one by one to find out how big will be the final array.
        for (int i = 0; i < arrayName.length; i++) {
            // checking for digit
            if (arrayName[i] == num || isDigitPresent(arrayName[i], num)) {
                indices++;
            }
        }


        if(indices == 0) {
            return "[]";
        }

        // Save the elements from the original array to the final array.
        int[] matchingIndices = new int[indices];
        int index = 0;
        for (int item : arrayName) {
            if (item == num || isDigitPresent(item, num)) {
                matchingIndices[index] = item;
                index++;
            }
        }

        // Shifting the values inside the final array, to their indices in the original array.
        for (int i = 0; i < matchingIndices.length; i++) {
            for (int j = 0; j < arrayName.length; j++) {
                if(matchingIndices[i] == arrayName[j]) {
                    matchingIndices[i] = j;
                }
            }
        }
        return Arrays.toString(matchingIndices);
    }

    public static boolean isDigitPresent(int x, int d) {
        // Break loop if d is present as digit
        while (x > 0) {
            if (x % 10 == d) {
                break;
            }
            x = x / 10;
        }
        return (x > 0);
    }
}
