import java.util.Arrays;

public class PalindromeSearcher {
    public static void main(String[] args) {
        // Create a function named searchPalindrome() following your current language's style guide.
        // It should take a string, search for palindromes that is at least 3 characters long and
        // return a list with the found palindromes.

        String str = "dog goat dad duck doodle never";
        solution(str);
    }
    public static void solution(String str) {
        int index = 0;
        for (int i = 0 ; i < str.length(); i++) {
            for (int j = i + 3; j <= str.length(); j++) {
                // i -> starting point of substring, j-> ending point of substring
                if (isPalindrome(str.substring(i, j))) {
                    index++;
                }
            }
        }

        String[] solution = new String[index];
        index = 0;
        for (int i = 0 ; i < str.length(); i++) {
            for (int j = i + 3; j <= str.length(); j++) {
                // i -> starting point of substring, j-> ending point of substring
                if (isPalindrome(str.substring(i, j))) {
                    solution[index] = str.substring(i,j);
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(solution));
    }
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
