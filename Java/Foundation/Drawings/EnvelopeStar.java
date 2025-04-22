import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar extends JPanel {
    public static void drawImage(Graphics graphics) {

        int lines = WIDTH/2;

        envelopeStar(graphics, lines);
    }

    public static void envelopeStar(Graphics g, int numLines) {
        for (int i = 0; i < numLines; i += 10) {
            g.setColor(Color.GREEN);
            g.drawLine(WIDTH/2, i, WIDTH/2+i, HEIGHT/2);
            g.setColor(Color.GREEN);
            g.drawLine(WIDTH/2, i,WIDTH/2-i, HEIGHT/2);
            g.setColor(Color.GREEN);
            g.drawLine(WIDTH/2, HEIGHT-i,WIDTH/2+i, HEIGHT/2);
            g.setColor(Color.GREEN);
            g.drawLine(WIDTH/2, HEIGHT-i,WIDTH/2-i, HEIGHT/2);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Envelope Star");
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