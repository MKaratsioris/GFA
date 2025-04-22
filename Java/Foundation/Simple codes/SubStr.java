import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        // Create a function that takes two strings as a parameter
        // Returns the starting index where
        // the second one is starting in the first one
        // Returns `-1` if the second string is not in the first one

        // Example:

        // should print: `17`
//        System.out.println(subStr("this is what I'm searching in", "searching"));

        // should print: `-1`
//        System.out.println(subStr("this is what I'm searching in", "not"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type two strings!");
        System.out.print("String #1: ");
        String str1 = scanner.nextLine();
        System.out.print("String #2: ");
        String str2 = scanner.nextLine();
        System.out.println(subStr(str1, str2));


    }


    public static int subStr(String input, String q) {
        int indexSubstring = input.indexOf(q);
        return indexSubstring;
    }
}