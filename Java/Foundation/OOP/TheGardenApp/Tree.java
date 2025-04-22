package TheGardenApp;

public class Tree {
    String color;
    int waterLevel;

    public Tree() {
        color = "multicolored";
    }

    public Tree(String color) {
        this.color = color;
    }

    public void water(int amountOfWater) {
        waterLevel += amountOfWater*0.4;
    }

    public String toString() {
        if (waterLevel < 10) {
            return "The " + color + " tree needs water.";
        } else {
            return "The " + color + " tree doesn't need water.";
        }
    }
}