

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawImage(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]

        int numTriangles = 21;
        int side = WIDTH/numTriangles;
        int h = (int) (Math.sqrt(3) * side / 2);

        for (int i = 0; i < 21; i++) {
            int [] x = {WIDTH / 2-side/2-i*side/2, WIDTH/2 - side-i*side/2, WIDTH/2-i*side/2};
            int [] y = {10*h+i*h, 11*h+i*h, 11*h+i*h};
            for (int j = 0; j < 21-i; j++) {
                for (int k = 0; k < 3; k++) {
                    x[k] += side/2;
                    y[k] += h;
                }
                drawPolygone(graphics, x, y, 3);
            }
        }
    }

    public static void drawPolygone (Graphics g, int[] x, int[] y, int numSides) {
        g.setColor(Color.GREEN);
        g.drawPolygon(x, y, numSides);
    }

    // Don't touch the code below
    static int WIDTH = 420;
    static int HEIGHT = 620;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Triangles");
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