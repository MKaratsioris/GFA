import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Doubled {

    public static void main(String[] args) throws IOException {
        // Create a method called decryptDoubled() that takes a filename as string as a parameter,
        // and it can decrypt the duplicated-chars.txt file
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should return this message: File not found
        // The result should be saved in the output.txt file

        String file = "src/duplicated-chars.txt";
        decryptDouble(file);

    }

    private static void decryptDouble(String file) throws IOException {
        // Read lines from file and store them in a List
        Path filePath = Paths.get(file);
        List<String> encryptedLines = Files.readAllLines(filePath, UTF_8);

        // Analyzing the input file:
        // (i) line by line,
        // (j) word by word
        // and storing the resulting string-lines into a new List.


        String decryptedLines = "";
        for (String line : encryptedLines) { // encryptedLines.size()
            String[] encryptedLine = line.split(" ");
            for (String s : encryptedLine) {
                decryptedLines += decryptWord(s) + " ";
            }
            decryptedLines += "\n";
        }

        System.out.println(decryptedLines);

//         Take the decrypted list and write it into an output file
        String output = "src/output.txt";
        try {
            Files.write(Paths.get(output), List.of(decryptedLines));
        } catch (Exception e) {
            System.err.println("File not found");
            System.exit(1);
        }
    }

    public static String decryptWord(String str){
        String[] encryptedWord = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            encryptedWord[i] = "" + str.charAt(i) + "";
        }
        for (int i = 0; i < encryptedWord.length - 1; i++) {
            if (encryptedWord[i].equals(encryptedWord[i+1])) {
                encryptedWord[i+1] = "";
            }
        }

        String decryptedWord = "";
        for (String s : encryptedWord) {
            if (!Objects.equals(s, " ")) {
                decryptedWord += s;
            }
        }
        return decryptedWord;
    }
}