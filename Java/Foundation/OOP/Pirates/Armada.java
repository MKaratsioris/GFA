package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {

    public List<Ship> armada = new ArrayList<>();

    boolean thisWon;

    public void fillArmada() {
        for (int i = 0; i < (int) (1 + Math.random() * 10); i++) {// THE PROBLEM IS HERE.
            armada.add(i, new Ship());
            armada.get(i).fillShip();
        }
    }

    public boolean war(Armada otherArmada) {
//        - it should work like merge sort
//        - first ship from the first armada battles the first one from the other
//        - the loser ship gets skipped so the next ship comes in play from the loser ship's armada
//        - it starts a battle with the first (not yet defeated) ship from the other armada
//        - whichever armada gets to the end of its ships loses the war
//        - return true if this is the winner

        System.out.println("The battle begins!");

        if (armada.size() > 0) {
            if (otherArmada.armada.size() == 0) {
                System.out.println("Our armada won!");
                System.out.println("The battle finished!");
                thisWon = true;
            } else {
                for (int i = 0; i < armada.size(); i++) {
                    for (int j = 0; j < otherArmada.armada.size(); j++) {
                        while (armada.size() > 0 && otherArmada.armada.size() > 0) {
                            if (armada.get(i).battle(otherArmada.armada.get(j))) {
//                                System.out.println("---other----> " + j + " : " + otherArmada.armada.size());
                                otherArmada.armada.remove(j);
//                                System.out.println("---other----> " + j + " : " + otherArmada.armada.size());
                            } else {
//                                System.out.println("---this----> " + i + " : " + armada.size());
                                armada.remove(i);
//                                System.out.println("---this----> " + i + " : " + armada.size());
                            }
                        }
                    }
                }
                if (armada.size() > 0) {
                    System.out.println("The battle finished!");
                    System.out.println("Our armada won!");
                    thisWon = true;
                } else {
                    System.out.println("The battle finished!");
                    System.out.println("We lost!");
                }
            }
        }
        return thisWon;
    }
}
