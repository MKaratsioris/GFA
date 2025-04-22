
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters extends JPanel {
    public static void drawImage(Graphics graphics) {

        int lines = WIDTH/20;
        int n = 8; // number of sub-frames per row/column

        linesQuadrants(graphics, n, lines);
    }

    public static void linesQuadrants(Graphics g, int numQuadrants, int numLines) {

        for (int i = 0; i < numQuadrants; i++) {
            for (int j = 0; j < numQuadrants; j++) {
                linePlay(g,i*WIDTH/numQuadrants,j*HEIGHT/numQuadrants, numQuadrants, numLines);
            }
        }
    }

    public static  void linePlay(Graphics g, int xDisplacement, int yDisplacement, int numQuadrants, int numLines) {
        for (int i = 0; i < numLines; i++) {
            g.setColor(Color.MAGENTA);
            g.drawLine((40+20*i)/numQuadrants+xDisplacement, 5+yDisplacement,
                    WIDTH/numQuadrants+xDisplacement, (20+20*i)/numQuadrants+yDisplacement);
            g.setColor(Color.GREEN);
            g.drawLine(5+xDisplacement, (40+20*i)/numQuadrants+yDisplacement,
                    (20+20*i)/numQuadrants+xDisplacement, HEIGHT/numQuadrants+yDisplacement);
        }
    }

    // Don't touch the code below

    static int WIDTH = 300;
    static int HEIGHT = 300;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Line Play Quarters");
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