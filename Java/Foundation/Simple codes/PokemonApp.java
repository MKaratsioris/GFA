import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.nio.file.Files;

import static java.nio.charset.StandardCharsets.UTF_8;

public class PokemonApp {
    public static void main(String[] args) {

        List<String> pokemon = readFile("src/pokemon.csv");

        //If I extend the RunimeException instead of Exception, then the error handling will be optional.
        // Exceptions are finding the errors during compiling.

        try {
            validateFileContent(pokemon);
        } catch (InvalidTotalException e) {
            System.err.println("Validation stopped - Invalid \"Total\" data.");
            System.exit(1);
        } catch (InvalidTypeException e) {
            System.err.println("Validation stopped - Invalid \"Type\" data.");
            System.exit(2);
        } catch (Exception e) {                  // Always put the most general exception in the end of the try-catch block.
            System.err.println("Validation stopped - Invalid data.");
            System.exit(3);
        } finally {   // if we dont include System.exit above, this code-block will always execute.
            System.out.println("Validation ended.");
        }

        List<String> pokemonNames = filterPokemonNames(pokemon);
        writeFile(pokemonNames, "src/pokemonNames.csv");
        appendFile(Arrays.asList("Shiushin", "Nano", "Nikita"), "src/pokemonNames.csv");

//        System.out.println(pokemonNames);
    }

    private static void validateFileContent(List<String> fileContent)
            throws InvalidTotalException, InvalidTypeException {
        for (String line : fileContent) {
            String[] lineData = line.split(",");
            int total = Integer.parseInt(lineData[4]);
            String type1 = lineData[2];
            String type2 = lineData[3];

            if (total < 0) {
                throw new InvalidTotalException();
            } else if (type1.isEmpty() && type2.isEmpty()) {
                throw new InvalidTypeException();
            }
        }
    }
    public static void appendFile(List<String> fileContent, String file) {
        try {
            Files.write(Paths.get(file),fileContent, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Unable to append file.");
        }
    }

    public static void writeFile(List<String> fileContent, String file) {
        try {
            Files.write(Paths.get(file),fileContent);
        } catch (IOException e) {
            System.err.println("Unable to write file.");
        }
    }
    private static List<String> filterPokemonNames(List<String> pokemon) {
        List<String> pokemonNames = new ArrayList<>();

        for (int i = 0; i < pokemon.size(); i++) {
            String pokemonLine = pokemon.get(i);
            String[] pokemonData = pokemonLine.split(",");
            String pokemonName = pokemonData[1];
            pokemonNames.add(pokemonName);
        }
        return pokemonNames;
    }

    public static List<String> readFile(String file) {

        Path filePath = Paths.get(file);
        try {
            List<String> fileLines = Files.readAllLines(filePath, UTF_8);
            fileLines.remove(0);
            return fileLines;
        } catch (IOException exception) {
            System.err.println("Unable to read file.");
            return new ArrayList<>();
        }
    }
}
