import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void drawImage(Graphics graphics) {
        // Draw a box that has different colored lines on each edge

        // UP
        graphics.setColor(Color.RED);
        graphics.drawLine((WIDTH / 4), (HEIGHT / 4), (3 * WIDTH / 4), (HEIGHT / 4));

        // RIGHT
        graphics.setColor(Color.GREEN);
        graphics.drawLine((3 * WIDTH / 4), (HEIGHT / 4), (3 * WIDTH / 4), (3 * HEIGHT / 4));

        // DOWN
        graphics.setColor(Color.BLUE);
        graphics.drawLine((WIDTH / 4), (3 * HEIGHT / 4), (3 * WIDTH / 4), (3 * HEIGHT / 4));

        // LEFT
        graphics.setColor(Color.YELLOW);
        graphics.drawLine((WIDTH / 4), (HEIGHT / 4), (WIDTH / 4), (3 * HEIGHT / 4));


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
            this.setBackground(Color.BLACK);
            drawImage(graphics);
        }
    }
}