package cowsnbulls;

public class Guess {

    int intNumber;
    String stringNumber;

    public Guess(int digits){
        int digit = 0;
        for (int i = 0; i < digits; i++) {
            digit = (int) (Math.random()*10);
            intNumber += Math.pow(10,i)*digit;
        }
        stringNumber = String.valueOf(intNumber);
        for (int i = digits-1; i > 0; i--) {
            if((int)(intNumber / Math.pow(10,i)) == 0){
                stringNumber = "0" + stringNumber;

            }
        }
    }

    public static void main(String[] args) {

        Guess guess = new Guess(4);
        System.out.println(guess.stringNumber);
    }

}
