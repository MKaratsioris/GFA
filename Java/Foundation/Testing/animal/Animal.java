package animal;

public class Animal {

    int hunger = 50;
    int thirst = 50;

    public int eat() {
        hunger--;
        return hunger;
    }

    public int drink() {
        thirst--;
        return thirst;
    }

    public int[] play() {
        hunger++;
        thirst++;
        return new int[] {hunger, thirst};
    }
}
