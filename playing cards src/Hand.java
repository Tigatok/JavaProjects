/**
 * @author Tyler Marshall 300210747
 */
public class Hand {
    private Card[] cardsInHand; //Initializes the cardsInHand array that we will use to keep track of our cards.
    private int count; // keeps track of the count of the cards.
        
    public Hand() { //The constructor for the Hand class.
            cardsInHand = new Card[5]; //Creates the hand at 5 cards.
            count = 0; //Initializes the count of the cardsInHand to 0
    }
    /**
     * 
     * @return Gets the count of the cards. 
     */
    public int getCount() { //Simple method to get the count of the cards
        return count;
    }
    //<editor-fold defaultstate="collapsed" desc="comment">
    /**
     *
     * @param c The card that is chosen. Takes in a Card which is from the deck class/Deal.
     */
    //</editor-fold>
    public void add(Card c) {    
        if (getCount() < cardsInHand.length) { //If there are lower than 5 cards in the hand
            count++; //Increase the count by one, because we are dealing another card.
            for (int i = 0; i < cardsInHand.length; i++) { //Runs a loop that will insert a card wherever there is a null spot.
                if (cardsInHand[i] == null) {
                    cardsInHand[i] = c; //At index I, insert the card from the constructor.
                        break; //breaks out of the loop.
                }
            }
        } 
    }
    public Card drop(int i) {
        Card card = cardsInHand[i]; //Creates a card object card, and sets it to the value of i.
        cardsInHand[i] = null; //Sets the card at index i to null. Which is the card that was dropped.
        count--; //subtract the count of the cards in the hand.
        return card; //returns the card object.
    }
    //<editor-fold defaultstate="collapsed" desc="Explains the return method.">
    /**
     *
     * @return Returns result to the caller.
     */
    //</editor-fold>
    public String toString() { //Calsl the toString method to represent the Cards in a string.
        String result = ""; //Creates string variable at "" which is the empty string.
            for (int i = 0; i < cardsInHand.length; i++) { //As long as I is lower than the count of the cards, it will print
                if (cardsInHand[i] != null) 
                    result += cardsInHand[i] + "\n";
            }
        return result; //returns the result variable.
    }
}