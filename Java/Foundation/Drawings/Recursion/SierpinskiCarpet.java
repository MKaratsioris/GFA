import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskiCarpet {
    public static void drawImage(Graphics graphics) {
        // Reproduce this a fractal from squares

        int side = WIDTH/3;
        int x = 0;
        int y = 0;


//        graphics.setColor(Color.BLACK);
//        drawSquare(graphics, x, y, side);
        squareFractal(graphics, x, y, side,3);
    }

    public static void squareFractal (Graphics g, int x, int y, int side, int depth) {

        drawSquare(g, x+side/3, y+side/3, side/3); // up left corner => #1
        drawSquare(g, x+4*side/3, y+side/3, side/3); // up middle => #2
        drawSquare(g, x+7*side/3, y+side/3, side/3); // up right corner => #3
        drawSquare(g, x+side/3, y+4*side/3, side/3); // #4
        drawSquare(g, x+side, y+side, side); // #5
        drawSquare(g, x+7*side/3, y+4*side/3, side/3); // #6
        drawSquare(g, x+side/3, y+7*side/3, side/3); // #7
        drawSquare(g, x+4*side/3, y+7*side/3, side/3); // #8
        drawSquare(g, x+7*side/3, y+7*side/3, side/3); // #9
        if (depth < 1) {
            drawSquare(g, x+side/3, y+side/3, side/3); // #1
            drawSquare(g, x+4*side/3, y+side/3, side/3); // #2
            drawSquare(g, x+7*side/3, y+side/3, side/3); // #3
            drawSquare(g, x+side/3, y+4*side/3, side/3); // #4
            drawSquare(g, x+side, y+side, side); // #5
            drawSquare(g, x+7*side/3, y+4*side/3, side/3); // #6
            drawSquare(g, x+side/3, y+7*side/3, side/3); // #7
            drawSquare(g, x+4*side/3, y+7*side/3, side/3); // #8
            drawSquare(g, x+7*side/3, y+7*side/3, side/3); // #9
        } else {
            squareFractal(g, x, y, side/3, depth-1); // #1
            squareFractal(g, x+side, y, side/3, depth-1); // #2
            squareFractal(g, x+2*side, y, side/3, depth-1); // #3
            squareFractal(g, x, y+side, side/3, depth-1); // #4
            squareFractal(g, x+2*side, y+side, side/3, depth-1); // #6
            squareFractal(g, x, y+2*side, side/3, depth-1); // #7
            squareFractal(g, x+side, y+2*side, side/3, depth-1); // #8
            squareFractal(g, x+2*side, y+2*side, side/3, depth-1); // #9
        }
    }

    public static void drawSquare (Graphics g, int x, int y, int side) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, side, side);
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Sierpinski Carpet");
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
//            this.setBackground(Color.WHITE);
            drawImage(graphics);
        }
    }
}