public class CompareLength {
    public static void main(String[] args) {
        // - Create an array variable named `firstArrayOfNumbers`
        //   with the following content: `[1, 2, 3]`
        // - Create an array variable named `secondArrayOfNumbers`
        //   with the following content: `[4, 5]`
        // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
        //   elements than `firstArrayOfNumbers`
        // - Otherwise print: "firstArrayOfNumbers is the longer one"

        int[] firstArrayOfNumbers = new int[] {1, 2, 3};
        int[] secondArrayOfNumbers = new int[] {4, 5};
        if (secondArrayOfNumbers.length > firstArrayOfNumbers.length) {
            System.out.println("secondArrayOfNumbers is longer");
        } else if (secondArrayOfNumbers.length < firstArrayOfNumbers.length) {
            System.out.println("firstArrayOfNumbers is the longer one");
        } else {
            System.out.println("The two arrays have the same number of elements.");
        }
    }
}
