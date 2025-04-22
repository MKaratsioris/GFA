package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {

    public List<Pirate> crew = new ArrayList<>();
    final public int shipCrewLimit = 113;
    int score;
    boolean shipWon;
    Pirate captain = new Pirate();

    public void fillShip() {
        crew.add(captain);
        for (int i = 1; i < (int) (Math.random()*shipCrewLimit); i++) {
            this.crew.add(i, new Pirate());
        }
    }

    public boolean battle(Ship otherShip) {
        if (captain.isDead) {
            System.out.println("The captain is dead!");
        } else {
            System.out.println("The captain is alive and has consumed " + captain.drinkCount + " bottles of rum!");
        }
        System.out.println("The ship has a crew of " + (crew.size() - 1) + " alive pirates!");

        score = crew.size() - crew.get(0).drinkCount;
        int othershipScore = otherShip.crew.size() - otherShip.crew.get(0).drinkCount;

        if (this.score >= othershipScore) {
            System.out.println("We won!");
            for (int i = 0; i < crew.size(); i++) {
                crew.get(i).drinkCount = (int) (Math.random()*crew.size());
            }
            System.out.println("After the battle was won, there were " + crew.size() + " drunk pirates on board.");
            this.shipWon = true;
        } else {
            System.out.println("We lost!");
            for (int i = (int) (Math.random()*crew.size()); i < crew.size(); i++) {
                crew.get(i).die();
            }
            if (captain.isDead) {
                System.out.println("The captain is dead!");
            } else {
                System.out.println("The captain is still alive.");
            }
            int countDead = 0;
            for (int i = 0; i < crew.size(); i++) {
                if (crew.get(i).isDead) {
                    countDead++;
                }
            }
            System.out.println("After the battle was lost, there were " + (crew.size() + 1 - countDead) + " alive pirates on board.");
            shipWon = false;
        }
        return this.shipWon;
    }
}
