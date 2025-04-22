import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class ReversedOrder {

    public static void main(String[] args) throws IOException {
        // Create a method that decrypts reversed-lines.txt

        String file = "src/reversed-order.txt";
        decryptReverseOrder(file);

    }

    private static void decryptReverseOrder(String file) throws IOException {

        // Read lines from file and store them in a List
        Path filePath = Paths.get(file);
        List<String> encryptedLines = Files.readAllLines(filePath, UTF_8);

        // Analyzing the input file:
        // (i) line by line,
        // (j) word by word
        // and storing the resulting string-lines into a new List.


        String decryptedLines = "";
        for (int i = 0; i < encryptedLines.size(); i++) { // encryptedLines.size()
            decryptedLines += encryptedLines.get(encryptedLines.size()-1-i) + "\n";
        }

        System.out.println(decryptedLines);
    }
}