public class PalindromeBuilder {
    public static void main(String[] args) {
        //Create a function named createPalindrome() following your current language's style guide.
        // It should take a string, create a palindrome from it and then return it.

        String str = "123";
        System.out.println(createPalindrome(str));

    }

    public static String createPalindrome(String str) {

        // here I add the initial string and the its reverse to create the palindrome.
        return str + reverseString(str);
    }

    public static String reverseString(String str) {
        // here I will store the reverse string.
        StringBuilder reverseString = new StringBuilder();

        // here I am creating an array to store each character of the string separately.
        char[] charArray = new char[str.length()];

        // here I am breaking the string into its characters and then store it in reverse order in the character array
        // declared above.
        int index = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            charArray[index] = str.charAt(i);
            index++;
        }

        // here I am creating the reverse string by adding each character separately.
        for (int i = 0; i < str.length(); i++) {
            reverseString.append(charArray[i]);
//            reverseString = reverseString + charArray[i];
        }

        return reverseString.toString();
    }
}
