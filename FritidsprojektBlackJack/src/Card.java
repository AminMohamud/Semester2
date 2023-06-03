import Enums.CardValue;
import Enums.Colour;

public class Card {

    private Colour colour;

    private CardValue value;

    public Card(Colour colour, CardValue value) {
        this.colour = colour;
        this.value = value;
    }

    public Card(Card card) {
        this.colour = card.getColour();
        this.value = card.value;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public CardValue getValue() {
        return value;
    }

    public void setValue(CardValue value) {
        this.value = value;
    }

    public String toString(){
        return ("["+value+" of "+ colour + "] ");

    }
}
