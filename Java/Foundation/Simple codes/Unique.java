import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes an array of numbers as a parameter
        //  and returns an array of integers where every integer is unique (occurs only once)

        //  Example
//        System.out.println(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

        int[] testArray = {1, 11, 34, 11, 52, 61, 1, 34, 11, 55, 52};
        findUniqueItems(testArray);
//        String result = findUniqueItems(testArray);
//        System.out.println(result);
    }

    public static void findUniqueItems(int[] arrayName) {
        int indices = 0;
        Arrays.sort(arrayName);
        for (int i = 0; i < arrayName.length - 1; i++) {
            if (arrayName[i] != arrayName[i+1]) {
                indices++;
            }
        }
        if (arrayName[arrayName.length - 2] != arrayName[arrayName.length-1]) {
            indices++;
        }


        int[] uniqueArray = new int[indices];
        int index = 0;
        for (int i = 0; i < arrayName.length - 1; i++) {
            if (arrayName[i] != arrayName[i+1]) {
                uniqueArray[index] = arrayName[i];
                index++;
            }
        }
        if (arrayName[arrayName.length - 2] != arrayName[arrayName.length-1]) {
            uniqueArray[uniqueArray.length - 1] = arrayName[arrayName.length - 1];
        }
        System.out.println(Arrays.toString(uniqueArray));
    }
}
