/**
 *
 * @author 300210747 Tyler Marshall
 */
public class PlayingCards {
    public static void main(String[] args){
       // Card x1 = new Card(1,0);
        //Card x2 = new Card(12,3);
        //System.out.println(x1);
        //System.out.println(x2);
        
        Deck d1 = new Deck(52);
       // System.out.println(d1);
        //d1.shuffle(); 
        //System.out.println(d1);
        //d1.sort();
        //System.out.println(d1);
        
       // d1.shuffle();
        //System.out.println();
        //Card[] hand = new Card[7];
        //for(int i=0; i<7; i++)
         //   hand[i]=d1.deal();
        //for(int i=0; i<7; i++)
        //    System.out.println(hand[i]);
        
        d1.shuffle();
        Hand myPokerHand = new Hand();
        for(int i=0; i<5; i++){
          myPokerHand.add(d1.deal());
        }
        System.out.println("The Hand:\n" +myPokerHand + "\n");
        System.out.println("Drop 2 cards: " + myPokerHand.drop(3) + ", " + myPokerHand.drop(0));
        System.out.println("\nThe Hand:\n" + myPokerHand);
    }
}
