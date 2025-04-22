import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
    public static void drawImage(Graphics graphics) {
        // Reproduce this a fractal from squares

        int d = WIDTH;
        int x = 0;
        int y = 0;

        drawCircle(graphics, x, y, d);
        circleFractal(graphics, x, y, d,3);
    }

    public static void circleFractal (Graphics g, int x, int y, int d, int depth) {

        drawCircle(g, x+d/4, y, d/2);
        drawCircle(g, x+d/32+2, y+3*d/8, d/2);
        drawCircle(g, x+15*d/32, y+3*d/8, d/2);
        if (depth < 1) {
            drawCircle(g, x+d/4, y, d/2);
            drawCircle(g, x+d/32+2, y+3*d/8, d/2);
            drawCircle(g, x+15*d/32, y+3*d/8, d/2);
        } else {
            circleFractal(g, x+d/4, y, d/2, depth-1);
            circleFractal(g, x+d/32+2, y+3*d/8, d/2, depth-1);
            circleFractal(g, x+15*d/32, y+3*d/8, d/2, depth-1);
        }
    }

    public static void drawCircle (Graphics g, int x, int y, int d) {
        g.setColor(Color.YELLOW);
        g.drawOval(x, y, d, d);

    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Circles Fractal");
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