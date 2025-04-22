package DiceSet;

import java.util.ArrayList;
import java.util.List;

public class DiceSet {
    ArrayList<Integer> dice = new ArrayList<>();

    public List<Integer> rollSet() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
        return dice;
    }

    public List<Integer> getCurrentSet() {
        return dice;
    }

    public int getCurrentItem(int i) {
        return dice.get(i);
    }

    public void rerollSet() {
        for (int i = 0; i < dice.size(); i++) {
            dice.set(i, (int) (Math.random() * 6) + 1);
        }
    }

    public void rerollItem(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
    }

    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with the rollSet() method
        // You can check the current rolled numbers with getCurrentSet() and getCurrentItem() method
        // You can reroll all with the rerollSet(), or reroll one with the rerollItem() method
        // Your task is to roll the dice until all of the dice are 6

        DiceSet diceSet = new DiceSet();
        System.out.println("1. " + diceSet.getCurrentSet());
        System.out.println("2. " + diceSet.rollSet());
        System.out.println("3. " + diceSet.getCurrentSet());
        System.out.println("4. " + diceSet.getCurrentItem(5));
        diceSet.rerollSet();
        System.out.println("5. " + diceSet.getCurrentSet());
        diceSet.rerollItem(4);
        System.out.println("6. " + diceSet.getCurrentSet());

        for (int i = 0; i < 6; i++) {
            while (diceSet.getCurrentItem(i)!=6) {
                diceSet.rerollItem(i);
            }
        }
        System.out.println("7. " + diceSet.getCurrentSet());

    }
}
