package Sharpie;

import java.util.List;

public class SharpieSet {

    List<Sharpie> listOfSharpies;

    public void add(Sharpie sharpie) {
        listOfSharpies.add(sharpie);
    }

    public int countUsable() {
        int count = 0;
        for(Sharpie item : listOfSharpies) {
            if (item.inkAmount != 0) {
                count++;
            }
        }
        return count;
    }

    public void removeTrash() {
        for(Sharpie item : listOfSharpies) {
            if (item.inkAmount == 0) {
                listOfSharpies.remove(item);
            }
        }
    }
}
