package Pirates;

public class BattleApp {

    public static void main(String[] args) {
        Ship theBlackPearl = new Ship();
        Ship theJollyRoger = new Ship();
        Ship theGoldenHind = new Ship();
        Ship theQueenAnneSRevenge = new Ship();
        Ship theRoebuck = new Ship();
        Ship theWhydah = new Ship();
        Ship theRanger = new Ship();
        Ship theRevenge = new Ship();
        Ship theSatisfaction = new Ship();

        theBlackPearl.fillShip();
        theJollyRoger.fillShip();
        theBlackPearl.battle(theJollyRoger);

    }

}
