package cowsnbulls;

public class Main {

    public static void main(String[] args) {

        CowsAndBulls game = new CowsAndBulls(4);
        System.out.println(game.getStringNumber());
        System.out.println(game.guessResult(1234));

    }

}
