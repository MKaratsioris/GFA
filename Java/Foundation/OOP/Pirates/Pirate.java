package Pirates;

public class Pirate {

    int intoxicationLevel;
    int drinkCount;
    int parrotCount;
    boolean isDead;
    boolean isUnconscious;

    public void drinkSomeRum() {
        if (isDead) {
//            System.out.println("he's dead");
        } else {
            intoxicationLevel++;
            this.drinkCount++;
        }
    }

    public void howsItGoingMate() {
        if (isDead) {
//            System.out.println("he's dead");
        } else {
            if (drinkCount < 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                isUnconscious = true;
                this.drinkCount = 0;
            }
        }
    }

    public void wakeUp() {
        if (isDead) {
//            System.out.println("he's dead");
        } else {
            isUnconscious = false;
        }
    }

    public void sleep() {
        if (isDead) {
//            System.out.println("he's dead");
        } else {
            isUnconscious = true;
        }
    }

    public void die() {
//        System.out.println("he's dead");
        isDead = true;
    }

    public void brawl(Pirate pirateName) {
        if (isDead) {
//            System.out.println("he's dead");
        } else {
            int brawlResult = (int) (1 + Math.random()*3);
            if (brawlResult == 1) {
                isDead = true;
            } else if (brawlResult == 2) {
                System.out.println("Dead men `ell no tales, ye son of a biscuit eater!");
            } else {
                isUnconscious = true;
            }
        }
    }

    public void parrot() {
        if (parrotCount == 0) {
            System.out.println("Yo-ho-ho! Run a shot across the bow!");
            parrotCount++;
        } else if (parrotCount == 1) {
            System.out.println("Abandon Ship!");
            parrotCount++;
        } else if (parrotCount == 2) {
            System.out.println("‘ll crush ye barnacles!");
            parrotCount++;
        } else if (parrotCount == 3) {
            System.out.println("Shiver me timbers!");
            parrotCount++;
        } else if (parrotCount == 4) {
            System.out.println("Savvy?");
            parrotCount++;
        } else if (parrotCount == 5) {
            System.out.println("Batten down the hatches");
            parrotCount++;
        } else if (parrotCount == 6) {
            System.out.println("Fire in the hole");
            parrotCount++;
        } else {
            System.out.println("Walk the plank! Walk the plank!");
            parrotCount = 0;
        }
    }

}
