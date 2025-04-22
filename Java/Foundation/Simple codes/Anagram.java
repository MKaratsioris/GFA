import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
//    Create a function named isAnagram() following your current language's style guide.
//    It should take two strings and return a boolean value depending on whether it's an anagram or not.

        String str1 = "now";
        String str2 = "own";

        if (isAnagram(str1, str2)) {
            System.out.println("They are anagrams!");
        } else {
            System.out.println("They are not anagrams.");
        }

    }

    public static boolean isAnagram(String str1, String str2) 
    {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] char1Array = str1.toCharArray();
            Arrays.sort(char1Array);
            char[] char2Array = str2.toCharArray();
            Arrays.sort(char2Array);

            return Arrays.equals(char1Array, char2Array);
        }
    }
}
