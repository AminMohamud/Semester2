import Enums.Colour;

public class main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand = new Hand();

        hand.takeCardFromDeck(deck);
        hand.takeCardFromDeck(deck);
        hand.takeCardFromDeck(deck);

        System.out.println("testHand now has the following cards:");
        System.out.println(hand);
        System.out.println("testDeck now looks like this:");
        System.out.println(hand);


        /** int counter = 0;
     for (Card card : deck.getDeck()) {

           System.out.println(counter++);
           System.out.println(card.getColour() + " " + card.getValue() + " ");
       } **/



    }
}
