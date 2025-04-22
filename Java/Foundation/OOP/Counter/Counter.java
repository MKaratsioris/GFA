package Counter;

public class Counter {

    private final int COUNTER;
    public int counter;

    public Counter() { COUNTER = 0;}

    public Counter(int counter) {
        COUNTER = counter;
        this.counter = counter;
    }

    public int add(int number) {
        return (this.counter += number);
    }

    public int add() {
        return counter++;
    }

    public int get() {
        return this.counter;
    }

    public int reset() {
        return (this.counter = COUNTER);
    }

}
