import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineCircles {
    public static void drawImage(Graphics graphics) {
        // Reproduce this a fractal from squares

        int d = WIDTH/4;
        int x = 3*WIDTH/8;
        int y = HEIGHT/4;

        drawCircle(graphics, x, y, d);
        circleLineFractal(graphics, x, y, d,10);
    }

    public static void circleLineFractal (Graphics g, int x, int y, int d, int depth) {

        drawCircle(g, x-d/4, y+d/4, d/2);
        drawCircle(g, x+3*d/4, y+d/4, d/2);
        if (depth < 1) {
            drawCircle(g, x-d/4, y+d/4, d/2);
            drawCircle(g, x+3*d/4, y+d/4, d/2);
        } else {
            circleLineFractal(g, x-d/4, y+d/4, d/2, depth-1);
            circleLineFractal(g, x+3*d/4, y+d/4, d/2, depth-1);
        }
    }

    public static void drawCircle (Graphics g, int x, int y, int d) {
        g.setColor(Color.YELLOW);
        g.drawOval(x, y, d, d);

    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Line Circles");
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