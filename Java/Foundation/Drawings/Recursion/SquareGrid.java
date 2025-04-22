import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
    public static void drawImage(Graphics graphics) {
        // Reproduce this a fractal from squares

        int side = WIDTH/2;
        int x = WIDTH/2-side/2;
        int y = HEIGHT/2-side/2;
        int d = 24; // initial thickness

        drawSquare(graphics, x, y, side, d);
        gridFractal(graphics, x, y, side, d,3);
    }

    public static void gridFractal (Graphics g, int x, int y, int side, int d, int depth) {

        drawSquare(g, x-side/4, y-side/4, side/2, d/2);
        drawSquare(g, x+3*side/4, y-side/4, side/2, d/2);
        drawSquare(g, x-side/4, y+3*side/4, side/2, d/2);
        drawSquare(g, x+3*side/4, y+3*side/4, side/2, d/2);
        if (depth < 1) {
            drawSquare(g, x-side/4, y-side/4, side/2, d/2);
            drawSquare(g, x+3*side/4, y-side/4, side/2, d/2);
            drawSquare(g, x-side/4, y+3*side/4, side/2, d/2);
            drawSquare(g, x+3*side/4, y+3*side/4, side/2, d/2);
        } else {
            gridFractal(g, x-side/4, y-side/4, side/2, d/2, depth-1);
            gridFractal(g, x+3*side/4, y-side/4, side/2, d/2, depth-1);
            gridFractal(g, x-side/4, y+3*side/4, side/2, d/2, depth-1);
            gridFractal(g, x+3*side/4, y+3*side/4, side/2, d/2, depth-1);
        }
    }

    public static void drawSquare (Graphics g, int x, int y, int side, int d) {
        g.setColor(Color.YELLOW); // up
        g.fillRect(x, y, side, d);
        g.setColor(Color.YELLOW); // right
        g.fillRect(x+side-d, y, d, side);
        g.setColor(Color.YELLOW); // left
        g.fillRect(x, y, d, side);
        g.setColor(Color.YELLOW); // down
        g.fillRect(x, y+side-d, side, d);
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 520;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Square Grid Fractal");
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