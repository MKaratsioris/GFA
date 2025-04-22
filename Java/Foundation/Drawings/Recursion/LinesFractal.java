import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinesFractal {
    public static void drawImage(Graphics graphics) {
        // Reproduce this a fractal from squares

        int numLines = 2;
        int side = WIDTH/(numLines+1);
        int x0 = side;
        int y0 = 0;

//        squareFractal(graphics, x0, y0, numLines, side);
        drawLines(graphics, x0, y0, numLines, side);
//        drawLines(graphics, x0+side/3, y0+side/3, numLines, side/3);
    }

    public static void squareFractal (Graphics g, int x, int y, int numLines, int side) {
        if (side == 1) {
            drawLines(g, x, y, numLines, side);
        } else {
            drawLines(g, x+side/3, y, numLines, side/3);
        }
    }

    public static void drawLines(Graphics g, int x, int y, int numLines, int side) {

        g.setColor(Color.BLACK);
        for (int i = 0; i < numLines; i++) {   // set of lines
            for (int j = 0; j < numLines; j++) {
                g.drawLine(x+j*side, y, x+j*side, y+HEIGHT); // vertical lines
                g.drawLine(x, y+j*side, x+WIDTH, y+j*side); // parallel lines
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lines Fractal");
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