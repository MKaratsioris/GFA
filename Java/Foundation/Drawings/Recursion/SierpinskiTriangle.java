import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskiTriangle {
    public static void drawImage(Graphics graphics) {
        // Reproduce this a fractal from squares

        int side = 300;
        int h = (int) (Math.sqrt(3) * side/2);
        int x = WIDTH/2;
        int y = 0;

        drawTrianlge(graphics, x, y, side, h);
        hexagonFractal(graphics, x, y, side, h, 4);
    }

    public static void hexagonFractal (Graphics g, int x, int y, int side, int h, int depth) {

        drawTrianlge(g, x, y, side/2, h/2);
        drawTrianlge(g, x-side/4, y+h/2, side/2, h/2);
        drawTrianlge(g, x+side/4, y+h/2, side/2, h/2);
        if (depth < 1) {
            drawTrianlge(g, x, y, side/2, h/2);
            drawTrianlge(g, x-side/4, y+h/2, side/2, h/2);
            drawTrianlge(g, x+side/4, y+h/2, side/2, h/2);
        } else {
            hexagonFractal(g, x, y, side/2, h/2, depth-1);
            hexagonFractal(g, x-side/4, y+h/2, side/2, h/2, depth-1);
            hexagonFractal(g, x+side/4, y+h/2, side/2, h/2, depth-1);
        }
    }

    public static void drawTrianlge (Graphics g, int x, int y, int side, int h) {
        g.setColor(Color.YELLOW);
        g.drawLine(x, y, x+side/2, y+h);
        g.setColor(Color.YELLOW);
        g.drawLine(x+side/2, y+h, x-side/2, y+h);
        g.setColor(Color.YELLOW);
        g.drawLine(x-side/2, y+h, x, y);
    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Sierpinski Triangle");
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