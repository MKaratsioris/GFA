package TwentyPlusOne;

public class Card {

    private Suit suit;
    private Rank rank;

    public Card (Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }

    public Rank getRank() {
        return rank;
    }


}


