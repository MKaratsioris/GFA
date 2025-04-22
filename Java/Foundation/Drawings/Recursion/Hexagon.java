import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
    public static void drawImage(Graphics graphics) {
        // Reproduce this a fractal from squares

        int side = WIDTH/2;
        int h = (int) (Math.sqrt(3) * side);
        int x = WIDTH/2-side/2;
        int y = 0;

        drawHexagone(graphics, x, y, side, h);
        starFractal(graphics, x, y, side, h,2);
    }

    public static void starFractal (Graphics g, int x, int y, int side, int h, int depth) {

        drawHexagone(g, x, y, side/3, h/3);
        drawHexagone(g, x+2*side/3, y, side/3, h/3);
        drawHexagone(g, x+side, y+h/3, side/3, h/3);
        drawHexagone(g, x+2*side/3, y+2*h/3, side/3, h/3);
        drawHexagone(g, x, y+2*h/3, side/3, h/3);
        drawHexagone(g, x-side/3, y+h/3, side/3, h/3);
        if (depth < 1) {
            drawHexagone(g, x, y, side/3, h/3);
            drawHexagone(g, x+2*side/3, y, side/3, h/3);
            drawHexagone(g, x+side, y+h/3, side/3, h/3);
            drawHexagone(g, x+2*side/3, y+2*h/3, side/3, h/3);
            drawHexagone(g, x, y+2*h/3, side/3, h/3);
            drawHexagone(g, x-side/3, y+h/3, side/3, h/3);
        } else {
            starFractal(g, x, y, side/3, h/3, depth-1);
            starFractal(g, x+2*side/3, y, side/3, h/3, depth-1);
            starFractal(g, x+side, y+h/3, side/3, h/3, depth-1);
            starFractal(g, x+2*side/3, y+2*h/3, side/3, h/3, depth-1);
            starFractal(g, x, y+2*h/3, side/3, h/3, depth-1);
            starFractal(g, x-side/3, y+h/3, side/3, h/3, depth-1);
        }
    }

    public static void drawHexagone (Graphics g, int x, int y, int side, int h) {
        g.setColor(Color.YELLOW);
        g.drawLine(x, y, x+side, y);
        g.setColor(Color.YELLOW);
        g.drawLine(x+side, y, x+3*side/2, y+h/2);
        g.setColor(Color.YELLOW);
        g.drawLine(x+3*side/2, y+h/2, x+side, y+h);
        g.setColor(Color.YELLOW);
        g.drawLine(x+side, y+h, x, y+h);
        g.setColor(Color.YELLOW);
        g.drawLine(x, y+h, x-side/2, y+h/2);
        g.setColor(Color.YELLOW);
        g.drawLine(x-side/2, y+h/2, x, y);
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 520;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hexagon Star Fractal");
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