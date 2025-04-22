import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws a single line
        // Parameters: the x and y coordinates of the line's starting point and the graphics
        // The function shall draw a line from that point to the center of the canvas
        // Fill the canvas with lines from the edges (every 20 px) to the center

        int size = 20;
        int k = 0;
        int y = 0;
        for (int i = 0; i <= WIDTH/size; i++) {
            for (int j = 0; j <= HEIGHT/size; j++) {
                if(j == 0) {
                    drawLine(graphics, i*size, j);
                } else if (j == HEIGHT/size) {
                    drawLine(graphics, i*size, HEIGHT);
                } else if (i == 0) {
                    drawLine(graphics, i, j*size);
                } else if (i == WIDTH/size) {
                    drawLine(graphics, WIDTH, j*size);
                }
            }
        }
    }

    public static void drawLine (Graphics g, int x, int y) {
        g.setColor(Color.YELLOW);
        g.drawLine(x, y, WIDTH/2, HEIGHT/2);
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