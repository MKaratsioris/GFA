import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay extends JPanel {
    public static void drawImage(Graphics graphics) {

        int lines = 15;
        geometricalLinesPattern(graphics, lines);
    }

    public static void geometricalLinesPattern(Graphics g, int numLines) {

        for (int i = 0; i < numLines; i++) {
            g.setColor(Color.MAGENTA);
            g.drawLine(40+20*i, 5, WIDTH, 20+20*i);
            g.setColor(Color.GREEN);
            g.drawLine(5, 40+20*i, 20+20*i, HEIGHT);
        }
    }

    // Don't touch the code below

    static int WIDTH = 300;
    static int HEIGHT = 300;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Line Play");
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
