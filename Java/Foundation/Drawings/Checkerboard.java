import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void drawImage(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern


        int size = 40;
        int k;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                k = i + j;
                drawRectangle(graphics, i*size, j*size, size, k);
            }
        }
    }

    public static void drawRectangle (Graphics g, int x, int y, int size, int square) {
        if(square % 2 == 0) {
            g.setColor(Color.WHITE);
            g.fillRect(x, y, size, size);
        } else {
            g.setColor(Color.BLACK);
            g.fillRect(x, y, size, size);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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