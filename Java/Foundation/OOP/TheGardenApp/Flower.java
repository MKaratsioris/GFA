package TheGardenApp;

public class Flower {

    String color;
    int waterLevel;

    public Flower() {
        color = "multicolored";
    }

    public Flower(String color) {
        this.color = color;
    }

    public void water(int amountOfWater) {
        waterLevel += amountOfWater*0.75;
    }

    public String toString(){
        if (waterLevel < 5) {
            return "The " + color + " flower needs water.";
        } else {
            return "The " + color + " flower doesn't need water.";
        }
    }

}
