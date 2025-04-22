import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the number of lines.");
        int numLines = Integer.parseInt(scanner.nextLine());
        drawDiagonal(numLines);

    }

    public static void drawDiagonal(int lineCount) {
        // write your code here for Gradescope testing

        // First line
        for (int i = 0; i < lineCount; i++) {
            System.out.print("%");
        }
        System.out.println();


        // Side lines with diagonal line
        for (int i = 3; i <= lineCount; i++) {
            for (int j = 1; j <= lineCount; j++) {
                if (j == 1) {
                    // Left side
                    System.out.print("%");
                } else if (j == lineCount) {
                    // Right side
                    System.out.print("%");
                } else if (j == i-1) {
                    // Diagonal
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Last line
        for (int i = 0; i < lineCount; i++) {
            System.out.print("%");
        }
    }
}
