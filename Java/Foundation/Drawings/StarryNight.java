import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawImage(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)

        int numOfStars = 1001;
        int size = 1;
        int[] xList = new int[numOfStars];
        int[] yList = new int[numOfStars];

        for (int i = 0; i < numOfStars; i++) {
            xList[i] = 1 + (int)(Math.random() * WIDTH);
            yList[i] = 1 + (int)(Math.random() * HEIGHT);
        }

        for (int i = 0; i < xList.length; i++) {
            drawNightSky(graphics, xList[i], yList[i], size);
        }
    }

    public static void drawNightSky (Graphics g, int x, int y, int size) {

        g.setColor(Color.YELLOW);
        g.fillRect(x, y, size, size);
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