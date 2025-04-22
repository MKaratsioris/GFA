package com.gfa.exam;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

//        int lineCount = 6;
        // Write a program that draws a square like this:
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as lineCount is

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the number of lines.");
        int numLines = Integer.parseInt(scanner.nextLine());
        drawSquare(numLines);

    }

    public static void drawSquare(int lineCount) {
        // write your code here for Gradescope testing

        // First line
        for (int i = 0; i < lineCount; i++) {
            System.out.print("%");
        }
        System.out.println();

        // Side lines
        for (int i = 1; i <= lineCount-2; i++) {
            for (int j = 1; j <= lineCount; j++) {
                if (j == 1) {
                    // left side
                    System.out.print("%");
                } else if (j == lineCount) {
                    // right side
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
