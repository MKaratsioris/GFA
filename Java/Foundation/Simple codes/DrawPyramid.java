public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that draws a pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        int lineCount = 4;
        drawPyramid(lineCount);
    }
    public static void drawPyramid(int lineCount) {
        // write your code here for Gradescope testing
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
}
