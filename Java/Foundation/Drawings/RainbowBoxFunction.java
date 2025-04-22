import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).


        ArrayList<Object> colorsRaw = new ArrayList<>();
        colorsRaw.add(Color.RED);
        colorsRaw.add(Color.ORANGE);
        colorsRaw.add(Color.YELLOW);
        colorsRaw.add(Color.GREEN);
        colorsRaw.add(Color.CYAN);
        colorsRaw.add(Color.BLUE);
        colorsRaw.add(Color.MAGENTA);

        ArrayList<String> colorCode = new ArrayList<>();
        for (Object item : colorsRaw) {
            colorCode.add(item.toString().substring(14));
        }

        System.out.println("Magenta rgb = " + colorCode.get(6));

        for (int i = 0; i < colorCode.size(); i++) { // colorCode.size()
            drawSquare(graphics, WIDTH/colorCode.size(), colorCode.get(i));
        }
    }

    public static void drawSquare(Graphics g, int size, String colorRGB) {

//        Color myNewBlue = new Color (R, G, B);  //creates your new color
//        g.setColor(myNewBlue);  //accesses your new color  (NO dot operator)
//
//        Color colorCode = new Color(colorRGB);
//        I have to change the string into an int[] for the rgb numbers.
//        int[] RGB = new int[3];
//
//
        for (int i = 0; i < 7; i++) {
//            g.setColor();
//            g.fillRect(i*(size+1)+1, i*(size+1), size, size);

            g.setColor(Color.RED);
            g.fillRect(0*(size), i*(size)+i, size, size);
            g.setColor(Color.ORANGE);
            g.fillRect(1*(size), i*(size)+i, size, size);
            g.setColor(Color.YELLOW);
            g.fillRect(2*(size), i*(size)+i, size, size);
            g.setColor(Color.GREEN);
            g.fillRect(3*(size), i*(size)+i, size, size);
            g.setColor(Color.CYAN);
            g.fillRect(4*(size), i*(size)+i, size, size);
            g.setColor(Color.BLUE);
            g.fillRect(5*(size), i*(size)+i, size, size);
            g.setColor(Color.MAGENTA);
            g.fillRect(6*(size), i*(size)+i, size, size);
        }
    }

    // Don't touch the code below
    static int WIDTH = 350;
    static int HEIGHT = 350;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            this.setBackground(Color.BLACK);
            drawImage(graphics);
        }
    }
}