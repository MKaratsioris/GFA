package Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Farm {

    static List<Animal> listOfAnimals;
    static int limit;

    public Farm(int limit) {
        this.limit = limit;
    }

    public void breed() {
        if (listOfAnimals.size() < limit) {
            listOfAnimals.add(new Animal());
        }
    }

    public void sell() {
        Animal lessHungryAnimal = new Animal();
        lessHungryAnimal = listOfAnimals.get(0);
        for (int i = 1; i < listOfAnimals.size(); i++) {
            if (lessHungryAnimal.hunger < listOfAnimals.get(i).hunger) {
                lessHungryAnimal = listOfAnimals.get(i);
            }
        }
    }

}
