import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TestCode {
    public static void drawImage(Graphics graphics) {
        // Reproduce this a fractal from squares

        int side = 150;
        int h = (int) (Math.sqrt(3) * side);
        int x = WIDTH/2-side/2;
        int y = 0;

        drawHexagone(graphics, x, y, side, h);
        hexagonFractal(graphics, x, y, side, h, 3);
    }

    public static void hexagonFractal (Graphics g, int x, int y, int side, int h, int depth) {

        drawHexagone(g, x, y, side/2, h/2);
        drawHexagone(g, x+3*side/4, y+h/4, side/2, h/2);
        drawHexagone(g, x, y+h/2, side/2, h/2);
        if (depth < 1) {
            drawHexagone(g, x, y, side/2, h/2);
            drawHexagone(g, x+3*side/4, y+h/4, side/2, h/2);
            drawHexagone(g, x, y+h/2, side/2, h/2);
        } else {
            hexagonFractal(g, x, y, side/2, h/2, depth-1);
            hexagonFractal(g, x+3*side/4, y+h/4, side/2, h/2, depth-1);
            hexagonFractal(g, x, y+h/2, side/2, h/2, depth-1);
        }
    }

    public static void drawHexagone (Graphics g, int x, int y, int side, int h) {
        g.setColor(Color.BLACK);
        g.drawLine(x, y, x+side, y);
        g.setColor(Color.BLACK);
        g.drawLine(x+side, y, x+3*side/2, y+h/2);
        g.setColor(Color.BLACK);
        g.drawLine(x+3*side/2, y+h/2, x+side, y+h);
        g.setColor(Color.BLACK);
        g.drawLine(x+side, y+h, x, y+h);
        g.setColor(Color.BLACK);
        g.drawLine(x, y+h, x-side/2, y+h/2);
        g.setColor(Color.BLACK);
        g.drawLine(x-side/2, y+h/2, x, y);
    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 260;

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
            drawImage(graphics);
        }
    }
}