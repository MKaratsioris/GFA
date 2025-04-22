package TwentyPlusOne;

import java.util.Scanner;

public class Game {
//    The Game class is responsible to the game itself
//    It should have a method that generates a random number between 15 and 21, which will be the opponents score ---- DONE
//    It should ask the player to continue or to stop drawing cards ----
//    The game is lost, if the sum of the pulled cards are above 21 or below the random number ----

    public static void main(String[] args) {

        Deck playerDeck = new Deck();

        System.out.println("Welcome to 20+1 Game!!");
        System.out.println("----------------------");
        Deck deck = new Deck();
        deck.fullDeck();
//        System.out.println(deck);

        deck.shuffleDeck();
//        System.out.println(deck);

        int opponentHand = opponentsScore();
        Scanner playerDecision = new Scanner(System.in);
        playerDeck.addCard(deck.pullFirst(deck));
        playerDeck.addCard(deck.pullFirst(deck));

        System.out.println("Your hand is: ");
        System.out.print(playerDeck.toString());
        System.out.println("Total value of " + playerDeck.handValue());
        if (playerDeck.handValue() == 21) {
            System.out.println("BLACKJACK! You won!");
        } else {
            System.out.println("-----------------------------------");
            System.out.println("Would you like to continue or stop?");
            System.out.println("(1) Continue, (2) stop");
            int decision = playerDecision.nextInt();

            if (decision == 1) {
                while (decision == 1) {
                    playerDeck.addCard(deck.pullFirst(deck));
                    System.out.println("Your hand now is: ");
                    System.out.print(playerDeck.toString());
                    System.out.println("Total value of " + playerDeck.handValue());

                    if (playerDeck.handValue() >= 21) {
                        break;
                    }

                    System.out.println("Would you like to continue or stop?");
                    System.out.println("(1) Continue, (2) stop");
                    decision = playerDecision.nextInt();
                }
            }

            if (playerDeck.handValue() == 21) {
                System.out.println("BLACKJACK! You won!");
            } else if ((playerDeck.handValue() > 21) || (opponentHand > playerDeck.handValue())) {
                System.out.println("Your opponent's hand is " + opponentHand);
                System.out.println("Bad luck! You lost!");
            } else {
                System.out.println("Your opponent's hand is " + opponentHand);
                System.out.println("You won!");
            }
        }

    }

    public static int opponentsScore() {
        return (int) (15 + Math.random()*7);
    }

}
