package TwentyPlusOne;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private ArrayList<Card> deckOfCards = new ArrayList<>();;

    public void fullDeck() {
        for(Suit suit : Suit.values()) {
            for(Rank rank : Rank.values()) {
                deckOfCards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffleDeck() {
        ArrayList<Card> temporaryDeck = new ArrayList<>();
        int originalDeckSize = deckOfCards.size();
        for (int i = 0; i < originalDeckSize; i++) {
            int randomCardIndex = (int) (Math.random()*deckOfCards.size());
            temporaryDeck.add(deckOfCards.get(randomCardIndex));
            deckOfCards.remove(randomCardIndex);
        }
        deckOfCards = temporaryDeck;
    }

    public Card getCard() {
        return deckOfCards.get(0);
    }

    public void addCard(Card card) {
        deckOfCards.add(card);
    }

    public void removeCard() {
        deckOfCards.remove(0);
    }

    public Card pullFirst(Deck deck) {
        Card pulledCard = deck.getCard();
        deck.removeCard();
        return pulledCard;
    }

    public Card pullLast() {
        Card pulledCard = deckOfCards.get(deckOfCards.size()-1);
        deckOfCards.remove(deckOfCards.size()-1);
        return pulledCard;
    }

    public Card pullRandom() {
        int randomIndex = (int) (Math.random()*deckOfCards.size());
        Card pulledCard = deckOfCards.get(randomIndex);
        deckOfCards.remove(randomIndex);
        return pulledCard;
    }

    public int handValue() {
        int total = 0;
        int aces = 0;
        for (Card card : deckOfCards) {
            switch (card.getRank()) {
                case TWO:
                    total += 2;
                    break;
                case THREE:
                    total += 3;
                    break;
                case FOUR:
                    total += 4;
                    break;
                case FIVE:
                    total += 5;
                    break;
                case SIX:
                    total += 6;
                    break;
                case SEVEN:
                    total += 7;
                    break;
                case EIGHT:
                    total += 8;
                    break;
                case NINE:
                    total += 9;
                    break;
                case TEN:
                    total += 10;
                    break;
                case JACK:
                    total += 10;
                    break;
                case QUEEN:
                    total += 10;
                    break;
                case KING:
                    total += 10;
                    break;
                case ACE:
                    aces += 1;
                    break;
            }
        }
        for (int i = 0; i < aces; i++) {
            if (total > 10) {
                total += 1;
            } else {
                total += 11;
            }
        }
        return total;
    }

    public String toString() {
        String deckList = "";
        int index = 0;
        for(Card card : deckOfCards) {
            deckList += (index+1) + ". " + card.toString() + "\n";
            index++;
        }
        return deckList;
    }

}
