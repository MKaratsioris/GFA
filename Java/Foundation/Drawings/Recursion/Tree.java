import javax.swing.*;

import java.awt.*;

public class Tree extends JFrame {
    public static void drawImage(Graphics graphics) {

        double xi = WIDTH/2;
        double yi = 3*HEIGHT/4;
        int phi = 90;
        int delta = 33;
        int trunkSize = 50;

        int xf1 = (int) (xi + Math.cos(Math.toRadians(phi)) * trunkSize);
        int yf1 = (int) (yi - Math.sin(Math.toRadians(phi)) * trunkSize);
        fractalTree(graphics, xf1, yf1, phi, delta, trunkSize, 8);
    }

    public static void fractalTree (Graphics g, double xi, double yi, double angle, double deltaAngle, int branchSize, int depth) {

        double xDisplacement = Math.cos(Math.toRadians(angle)) * (branchSize-6);
        int xf = (int) (xi + xDisplacement);
        double yDisplacement = Math.sin(Math.toRadians(angle)) * (branchSize-6);
        int yf = (int) (yi - yDisplacement);
        g.setColor(Color.YELLOW);
        g.drawLine((int) xi, (int) yi, xf, yf);
        if (depth < 1) {
            xf = (int) (xi + xDisplacement);
            yf = (int) (yi - yDisplacement);
            g.setColor(Color.YELLOW);
            g.drawLine((int) xi, (int) yi, xf, yf);
        } else {
            fractalTree(g, xf, yf, angle, deltaAngle, branchSize-2, depth-1);
            fractalTree(g, xf, yf, angle+deltaAngle, deltaAngle-2, branchSize-6, depth-1);
            fractalTree(g, xf, yf, angle-deltaAngle, deltaAngle-2, branchSize-6, depth-1);
        }
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Tree Fractal");
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