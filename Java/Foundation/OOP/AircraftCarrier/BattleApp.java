package AircraftCarrier;

public class BattleApp {
    public static void main(String[] args) {

        Carrier freedom = new Carrier("Freedom", 10000, 10000);
        Carrier slavery = new Carrier("Slavery", 10000, 10000);

        for (int i = 0; i < Math.random()*5; i++) {
            freedom.add(AircraftType.F16);
        }
        for (int i = 0; i < Math.random()*5; i++) {
            freedom.add(AircraftType.F35);
        }
        freedom.fill();

        for (int i = 0; i < Math.random()*5; i++) {
            slavery.add(AircraftType.F16);
        }
        for (int i = 0; i < Math.random()*5; i++) {
            slavery.add(AircraftType.F35);
        }
        slavery.fill();

        freedom.fight(slavery);

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("-------------------------------- BATTLE RESULTS --------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(freedom.getStatus());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(slavery.getStatus());
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------");


    }
}
