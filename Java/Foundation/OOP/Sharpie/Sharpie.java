package Sharpie;

public class Sharpie {
    String color;
    int width;
    int inkAmount = 100;

    public void use() {
        inkAmount -= 10;
    }
}
