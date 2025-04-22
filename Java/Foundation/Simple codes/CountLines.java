import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class CountLines {
    public static void main(String[] args) {
        // Write a function called countLines() that takes a filename as string as a parameter
        // and returns the number of lines the file contains.
        // It should return zero if it can't open the file
        // and should not raise any error.

//        int numLines = countLines("src/pokemon.csv");
//        int numLines = countLines("src/lorumIpsum.txt");
        int numLines = countLines("src/emptyText.txt");
        System.out.println(numLines);

    }

    public static int countLines(String fileName) {
        int count = 0;
        Path filePath = Paths.get(fileName);
        try {
            List<String> fileLines = Files.readAllLines(filePath, UTF_8);
            for (String line : fileLines) {
                count++;
            }
            return count;
        } catch (IOException exception) {
            return 0;
        }
    }

}
