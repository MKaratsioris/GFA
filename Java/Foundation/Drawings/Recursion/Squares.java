import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
    public static void drawImage(Graphics graphics) {
        // Reproduce this a fractal from squares

        int numSquares = 3;
        int a = WIDTH/numSquares + 1;
        int x0 = a;
        int y0 = 0;

        squareFractal(graphics, x0, y0, a);
    }

    public static void squareFractal (Graphics g, int x, int y, int side) {
        if (side < 1) {

        } else {
            g.setColor(Color.GREEN);
            for (int i = 0; i < 2; i++) {
                x -= i*side;
                y += i*side;
                for (int j = 0; j < 2; j++) {
                    g.drawRect(x+j*side, y+j*side, side, side);
                }
            }
            squareFractal(g, x+4*side/3, y-side, side/3);
            squareFractal(g, x+7*side/3, y, side/3);
            squareFractal(g, x+side/3, y, side/3);
            squareFractal(g, x+4*side/3, y+side, side/3);
        }
    }

    // Don't touch the code below
    static int WIDTH = 1000;
    static int HEIGHT = 1000;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Squares Cross Fractal");
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