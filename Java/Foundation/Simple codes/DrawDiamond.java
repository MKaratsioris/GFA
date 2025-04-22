import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the number of lines.");
        int numLines = Integer.parseInt(scanner.nextLine());
        drawDiamond(numLines);
    }
    public static void upPyramid(int lineCount) {
        for(int i = 0; i < lineCount; i++) {

            // printing reduced number of spaces per row
            for(int j = i; j < lineCount; j++) {
                System.out.print(" ");
            }

            // printing raising number of asterisks per row
            for(int k = 1; k < 2 * (i + 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void downPyramid(int lineCount) {
        for(int i = lineCount; i > 0; i--) {

            // printing raising number of spaces per row
            for(int j = lineCount+2; j > i; j--) {
                System.out.print(" ");
            }

            // printing reduced number of asterisks per row
            for(int k = 2 * (i - 1); k + 1 > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawDiamond(int lineCount) {
        int upLines = (lineCount +1)/2;
        int downLines = (lineCount -1)/2;
        upPyramid(upLines);
        downPyramid(downLines);
    }
}
