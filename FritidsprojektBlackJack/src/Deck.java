import Enums.CardValue;
import Enums.Colour;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<>();

    public Deck () {
        this.deck = new ArrayList<>();

        for (int i = 0; i < 13; i++) {
            CardValue value = CardValue.values()[i];
            //Creates a card consisting of every available numerical value

            for (int j = 0; j < 4; j++) {
                Card card = new Card(Colour.values()[j], value);
                //Creates a card with every available value, with every colour value

                this.deck.add(card);
            }

        }
        Collections.shuffle(deck);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public int countMutualValue(CardValue value) {
        //Count cards that have the same numerical value.
        int counter = 0;

        for(Card card : deck) {
            if(card.getValue() == value) {
                counter++;
            }
        }
        return counter;
    }

    public int countMutualColour(Colour colour) {
        //Count cards that have the same colour value.
        int counter = 0;

        for(Card card : deck) {
            if(card.getColour() == colour) {
                counter++;
            }
        }
        return counter;
    }

    public Card takeCard() {
        //Takes a copy of the first card
        Card cardToTake = new Card(deck.get(0));
        deck.remove(0);
        return cardToTake;
    }

    public Card discardHandToDeck() {

        return null;
    }
}
