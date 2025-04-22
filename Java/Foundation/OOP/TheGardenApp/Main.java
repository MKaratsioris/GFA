package TheGardenApp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Garden garden = new Garden();

        garden.flowers.add(new Flower("yellow"));
        garden.flowers.add(new Flower("blue"));
        garden.trees.add(new Tree("purple"));
        garden.trees.add(new Tree("orange"));

        for (int i = 0; i < garden.flowers.size(); i++) {
            garden.flowers.get(i).water(40/garden.flowers.size());
            System.out.println(garden.flowers.get(i).toString());
        }
        for (int i = 0; i < garden.trees.size(); i++) {
            garden.trees.get(i).water(40/garden.trees.size());
            System.out.println(garden.trees.get(i).toString());
        }
    }
}
