package printable;

public class Domino implements Printable {

    int left;
    int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + this.left + ", B side: " + this.right);
    }


}
