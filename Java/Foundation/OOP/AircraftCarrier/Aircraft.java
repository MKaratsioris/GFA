package AircraftCarrier;

public class Aircraft {

    int ammo;
    int baseDamage;
    int totalDamage;
    String type;
    boolean queuePriority;
    public Aircraft(AircraftType type) {
        if (type.equals(AircraftType.F16)) {
            this.type = "F16";
            this.baseDamage = 30;
        } else if (type.equals(AircraftType.F35)) {
            this.type = "F35";
            this.baseDamage = 50;
        }
    }

    public int fight() {
        totalDamage = ammo*baseDamage;
        ammo = 0;
        return totalDamage;
    }

    public int refillAmmo(int storedAmmunition) {
        int remainingAmmunition = 0;
        if (type == String.valueOf(AircraftType.F16) && ammo <8) {
            if (storedAmmunition >= (8 - ammo)) {
                remainingAmmunition = storedAmmunition - (8-ammo);
                ammo = 8;
            } else {
                ammo += storedAmmunition;
            }
        } else {
            if (storedAmmunition >= (12 - ammo)) {
                remainingAmmunition = storedAmmunition - (12-ammo);
                ammo = 12;
            } else {
                ammo += storedAmmunition;
            }
        }
        return remainingAmmunition;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        totalDamage = ammo * baseDamage;
        return "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ",Total Damage: " + totalDamage;
    }

    public boolean isPriority() {
        if (type.equals(AircraftType.F35)) {
            queuePriority = true;
        }
        return queuePriority;
    }
}
