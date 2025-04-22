package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    List<Aircraft> carrier = new ArrayList<>();

    String name;
    int totalAmmunition;
    int storedAmmunition;
    int healthPoints;
    int remainingPoints;

    int totalDamage;

    public Carrier() {
        this("Incognito Aircraft Carrier", 10000, 10000);
    }

    public Carrier(String name, int totalAmmunition, int healthPoints) {
        this.name = name;
        this.totalAmmunition = totalAmmunition;
        this.healthPoints = healthPoints;
        this.storedAmmunition = totalAmmunition;
    }

    public void add(AircraftType type) {
        carrier.add( new Aircraft(type));
    }

    public void fill() {
        if (this.storedAmmunition == 0) {
            System.out.println("There are no more ammunition to refill the aircrafts!");
        } else {
            int totalAmmunitionNeeded = 0;
            for (int i = 0; i < carrier.size(); i++) {
                if (carrier.get(i).type == String.valueOf(AircraftType.F16)) {
                    totalAmmunitionNeeded += 8 - carrier.get(i).ammo;
                } else if (carrier.get(i).type == String.valueOf(AircraftType.F35)) {
                    totalAmmunitionNeeded += 12 - carrier.get(i).ammo;
                }
            }
            if (totalAmmunitionNeeded <= this.storedAmmunition) {
                for (int i = 0; i < carrier.size(); i++) {
                    storedAmmunition = carrier.get(i).refillAmmo(storedAmmunition);
                }
            } else {
                for (int i = 0; i < carrier.size(); i++) {
                    if(carrier.get(i).isPriority()) {
                        storedAmmunition = carrier.get(i).refillAmmo(storedAmmunition);
                    }
                }
            }
        }
    }

    public void damage() {
        for (int i = 0; i < carrier.size(); i++) {
            totalDamage += carrier.get(i).baseDamage * carrier.get(i).ammo;
        }
    }

    public void fight(Carrier otherCarrier) {
        for (int i = 0; i < carrier.size(); i++) {
            totalDamage += carrier.get(i).baseDamage * carrier.get(i).ammo;
        }
        for (int i = 0; i < otherCarrier.carrier.size(); i++) {
            otherCarrier.totalDamage += otherCarrier.carrier.get(i).baseDamage * otherCarrier.carrier.get(i).ammo;
        }
        for (int i = 0; i < carrier.size(); i++) {
            otherCarrier.remainingPoints = otherCarrier.healthPoints - totalDamage;
            remainingPoints = healthPoints - otherCarrier.totalDamage;
        }
    }

    public String getStatus() {
        String status = "                                   \"" + name + "\"\n" + "\n" +
                "     HP: " + remainingPoints + "/" + healthPoints + ", Aircraft count: " + carrier.size() + ", Ammo Storage: " +
                storedAmmunition + "/" + totalAmmunition + ", Total damage: " + totalDamage + "\n" + "\n" +
                "     Aircrafts:\n";
        int i;
        for (i = 0; i < carrier.size(); i++) {
            status += "     " + carrier.get(i).getStatus() + "\n";
        }
        return status;
    }
}
