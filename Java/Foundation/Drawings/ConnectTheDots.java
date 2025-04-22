import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // an array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}

        int[][] coordinates2D = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        connectDots(graphics, coordinates2D);

    }

    public static void connectDots(Graphics g, int[][] xyPairs) {

        int[] size = new int[xyPairs.length];
        int[] x = new int[xyPairs.length];
        int[] y = new int[xyPairs.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = xyPairs[i][0];
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = xyPairs[i][1];
        }
        for (int i = 0; i < size.length - 1; i++) {
            size[i] = (int) Math.sqrt(Math.pow((x[i+1]-x[i]),2) + Math.pow((y[i+1]-y[i]),2));
        }

        size[size.length - 1] = (int) Math.sqrt(Math.pow((x[x.length - 1]-x[x.length - 2]),2) + Math.pow((y[y.length - 1]-y[y.length - 2]),2));

        for (int i = 0; i < xyPairs.length - 1; i++) {
            g.setColor(Color.YELLOW);
            g.drawLine(x[i], y[i], x[i+1], y[i+1]);
        }
        g.setColor(Color.YELLOW);
        g.drawLine(x[x.length-1], y[y.length-1], x[0], y[0]);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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