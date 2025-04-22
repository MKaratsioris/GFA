import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReversedLines {

    public static void main(String[] args) throws IOException {
        // Create a method that decrypts reversed-lines.txt

        String file = "src/reversed-lines.txt";
        decryptReverse(file);

    }

    private static void decryptReverse(String file) throws IOException {

        // Read lines from file and store them in a List
        Path filePath = Paths.get(file);
        List<String> encryptedLines = Files.readAllLines(filePath, UTF_8);

        // Analyzing the input file:
        // (i) line by line,
        // (j) word by word
        // and storing the resulting string-lines into a new List.


        String swap = "";
        String decryptedLines = "";
        for (String line : encryptedLines) { // encryptedLines.size()
            String[] encryptedLine = line.split(" ");
            for (int i = 0; i < encryptedLine.length/2; i++) {
                swap = encryptedLine[i];
                encryptedLine[i] = encryptedLine[(encryptedLine.length-1-i)];
                encryptedLine[(encryptedLine.length-1-i)] = swap;
            }
            for (String s : encryptedLine) {
                decryptedLines += reverseWord(s) + " ";
            }
            decryptedLines += "\n";
        }

        System.out.println(decryptedLines);
    }

    public static String reverseWord(String str) {
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