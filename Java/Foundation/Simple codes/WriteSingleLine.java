import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // by writing your name into it as a single line.
        // The file should be named "my-file.txt".
        // In case the program is unable to write the file,
        // it should print the following error message: "Unable to write file: my-file.txt".

        writeFile("Michalis Karatsioris", "src/my-file.txt");
    }
    public static void writeFile(String str, String file) {
        try {
            Files.write(Paths.get(file), str.getBytes());
        } catch (IOException e) {
            System.err.println("Unable to write file: my-file.txt");
        }
    }
}