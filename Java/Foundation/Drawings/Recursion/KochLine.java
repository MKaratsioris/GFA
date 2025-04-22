import javax.swing.*;
import java.awt.*;

public class KochLine extends JFrame {

    public static void drawImage(Graphics graphics) {
//        drawLine(graphics, WIDTH);
        fractalKochLine(graphics, 3*WIDTH/4, 7);
    }

    public static void fractalKochLine(Graphics g, double side, int depth) {
        if (depth < 1) {
            drawLine(g, side);
        } else {
            fractalKochLine(g, side/3, depth - 1);
            rotate(-60);
            fractalKochLine(g, side/3, depth - 1);
            rotate(120);
            fractalKochLine(g, side/3, depth - 1);
            rotate(-60);
            fractalKochLine(g, side/3, depth - 1);

        }
    }

    public static void drawLine(Graphics g, double side){
        double x = X + side*Math.cos(Math.toRadians(theta));
        double y = Y + side*Math.sin(Math.toRadians(theta));
        g.setColor(Color.YELLOW);
        g.drawLine((int) X, (int) Y, (int) x, (int) y);
        X = x;
        Y = y;
    }

    public static void rotate(double rotationAngle) {
        theta += rotationAngle;
    }

    // Don't touch the code below
    public static double X = -300;
    public static double Y = 250;
    public static double theta = 0;
    static int WIDTH = 500;
    static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Koch Line");
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