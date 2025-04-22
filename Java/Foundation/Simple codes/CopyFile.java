//import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        // Write a function that copies the contents of a file into another file
        // It should take two filenames (string) as parameters:
        //  - path and name of the source file
        //  - path and name of the target file
        // It should return a boolean that shows if the copy was successful

        String sourceFile = "src/my-file.txt";
        String destFile = "src/manipulationFile.txt";
        copyFile(sourceFile, destFile);
    }
    public static boolean copyFile(String s, String d) throws IOException {

        // Read lines from file s and store them in a List
        Path filePath = Paths.get(s);
        List<String> sourceLines = Files.readAllLines(filePath, UTF_8);

        // Take the List and write it into file d
        try {
            Files.write(Paths.get(d),sourceLines);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}