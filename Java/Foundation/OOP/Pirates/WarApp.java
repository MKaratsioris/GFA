package Pirates;

public class WarApp {

    public static void main(String[] args) {

        int totalPirates = 0;

        Armada pirateCharlesVane = new Armada();
        Armada pirateBlackbeard = new Armada();

        pirateBlackbeard.fillArmada();
        for (int i = 0; i < pirateBlackbeard.armada.size(); i++) {
            totalPirates += pirateBlackbeard.armada.get(i).crew.size();
        }
        System.out.println("Blackbeard's Armada has " + pirateBlackbeard.armada.size() + " ships,");
        System.out.println("with total " + totalPirates + " pirates.");
        System.out.println("-------------------------------");
        totalPirates = 0;
        pirateCharlesVane.fillArmada();
        for (int i = 0; i < pirateCharlesVane.armada.size(); i++) {
            totalPirates += pirateCharlesVane.armada.get(i).crew.size();
        }
        System.out.println("Vane's Armada has " + pirateCharlesVane.armada.size() + " ships,");
        System.out.println("with total " + totalPirates + " pirates.");
        System.out.println("-------------------------------");

        pirateBlackbeard.war(pirateCharlesVane);
    }
}
