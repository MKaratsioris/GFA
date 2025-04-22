package Dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        List<Domino> snakeDomino = new ArrayList<>();
        snakeDomino.add(dominoes.get(0));

        for (int i = 0; i < dominoes.size(); i++) {
            for (int j = 0; j < dominoes.size(); j++) {
                if (snakeDomino.get(i).getRightSide() == dominoes.get(j).getLeftSide()) {
                    snakeDomino.add(dominoes.get(j));
                }
            }
        }

        System.out.println(snakeDomino);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2)); // 1
        dominoes.add(new Domino(4, 6)); // 3
        dominoes.add(new Domino(1, 5)); // 6
        dominoes.add(new Domino(6, 7)); // 4
        dominoes.add(new Domino(2, 4)); // 2
        dominoes.add(new Domino(7, 1)); // 5
        return dominoes;
    }
}
