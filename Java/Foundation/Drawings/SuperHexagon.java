

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]

        // for the specific pattern: WIDTH >= 11*a and HEIGHT >=7*a*sqrt(3).
        int side = 20;
        int h = (int) (Math.sqrt(3) * side);

        for (int i = 0; i < 4; i++) {
            int [] x = {WIDTH/2-side/2+3*i*side/2, WIDTH/2+side/2+3*i*side/2, WIDTH/2+side+3*i*side/2,
                    WIDTH/2+side/2+3*i*side/2, WIDTH/2-side/2+3*i*side/2, WIDTH/2-side/2-side/2+3*i*side/2};
            int [] y = {0+i*h/2, 0+i*h/2, (int) (h/2+i*h/2), h+i*h/2, h+i*h/2, (int) (h/2+i*h/2)};
            for (int j = 0; j < 7-i; j++) {
                for (int k = 0; k < 6; k++) {
                    y[k] += h;
                }
                drawPolygone(graphics, x, y, 6);
            }
        }
        for (int i = 0; i < 4; i++) {
            int [] x = {WIDTH/2-side/2-3*i*side/2, WIDTH/2+side/2-3*i*side/2, WIDTH/2+side-3*i*side/2,
                    WIDTH/2+side/2-3*i*side/2, WIDTH/2-side/2-3*i*side/2, WIDTH/2-side/2-side/2-3*i*side/2};
            int [] y = {0+i*h/2, 0+i*h/2, (int) (h/2+i*h/2), h+i*h/2, h+i*h/2, (int) (h/2+i*h/2)};
            for (int j = 0; j < 7-i; j++) {
                for (int k = 0; k < 6; k++) {
                    y[k] += h;
                }
                drawPolygone(graphics, x, y, 6);
            }
        }
    }

    public static void drawPolygone (Graphics g, int[] x, int[] y, int numSides) {
        g.setColor(Color.GREEN);
        g.drawPolygon(x, y, numSides);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Super Hexagon");
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