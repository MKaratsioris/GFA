import java.util.*;

public class Calculator {
    public static void main(String... args) {

        // Create a simple calculator application which reads parameters from the prompt and prints the result back.
        // The calculator should support the following operators: +, -, *, /, %
        // The format of the input expressions must be: {operator} {operand} {operand}
        // Input examples:
        //    "+ 3 3" (the result will be 6)
        //    "* 4 4" (the result will be 16)
        //    "/ 4 3" (the result will be 1)
        //
        // In the division (/) case, the result should be a whole number, e.g. 20 / 8 = 2, 10 / 3 = 3, etc.

        // To make it work use the `Scanner` class to get input from the user. Create a method named `calculate()` and
        // pass the input as a parameter into it. The method should return a result of the calculation as an `Integer`.
        //
        // The process should work like this:
        // - Start the program
        // - Print: "Please type in the expression:" using System.out.println
        //   (Wait for the user input)
        // - After receiving the input print the result number to the prompt
        // - Exit the program


        // Input & Output
        //
        // Please type in the expression:
        // + 10 3
        // 13

        String[] input;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type in the expression: ");
        input = scanner.nextLine().split(",");

        System.out.println(calculate(input));
    }

    public static int calculate(String[] input) {

        // creating a string from the input to check if all the typed characters are correct
        String s = "";
        for (String value : input) {
            s = s.concat(value);
        }

        // Cleaning the input from special characters
        String character;
        String specialCharactersNumbers = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz,.;'[]\\=`~!@#$^&()_{}|\":<>?";
        for (int i = 0; i < specialCharactersNumbers.length(); i++) {
            character = "" + specialCharactersNumbers.charAt(i) + "";
            s = s.replace(character,"");
        }

        String[] inputElements = s.split(" ");

        // extracting the elements of input
        String operation = " ";
        int numA = 0;
        int numB= 0;

        if (Character.isDigit(inputElements[0].charAt(0)) && Character.isDigit(inputElements[1].charAt(0))) {
            numA = Integer.parseInt("" + inputElements[0] + "");
            numB = Integer.parseInt("" + inputElements[1] + "");
            operation = "" + inputElements[2] + "";
        } else if (!Character.isDigit(inputElements[0].charAt(0))) {
            numA = Integer.parseInt("" + inputElements[1] + "");
            numB = Integer.parseInt("" + inputElements[2] + "");
            operation = "" + inputElements[0] + "";
        } else if (!Character.isDigit(inputElements[1].charAt(0))) {
            numA = Integer.parseInt("" + inputElements[0] + "");
            numB = Integer.parseInt("" + inputElements[2] + "");
            operation = "" + inputElements[1] + "";
        } else {
            System.out.print("The input format should be: ");
            System.out.println(" operation number number");
            System.out.println("Try again!");
        }

        // calculating the result
        int result = 0;
        switch (operation) {
            case "+" -> result = numA + numB;
            case "-" -> result = numA - numB;
            case "*" -> result = numA * numB;
            case "/" -> result = numA / numB;
            case "%" -> result = numA % numB;
            default -> {
                System.out.print("The input format should be: ");
                System.out.println(" operation number number");
                System.out.println("Try again!");
            }
        }

        return result;
    }
}