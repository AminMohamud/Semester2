import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<>();

    }

    public void takeCardFromDeck(Deck deck) {
        hand.add(deck.takeCard());
    }

    public String toString() {
        String output = " ";
        for (Card card: hand) {
            output += card + " - ";
        }
        return output;
    }


}
