package sharpie;

public class Sharpie {

    String color;
    int width;
    int inkAmount = 100;

    public int use() {
        inkAmount -= 10;
        return inkAmount;
    }
}
