import controllers.MainController;
import views.Board;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Best wanderer ever");
        Board board = new Board();
        MainController controller = new MainController(board);
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.addKeyListener(controller);
    }
}
