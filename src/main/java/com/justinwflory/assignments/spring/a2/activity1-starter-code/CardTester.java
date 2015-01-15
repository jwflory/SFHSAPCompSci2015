/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
   Card card1 = new Card("9", "Clubs", 10);
   Card card2 = new Card("2", "Diamonds", 15);
   Card card3 = new Card("Ace", "Spades", 99);
   System.out.println(Card.rank());
   System.out.println(Card.suit());
   System.out.println(Card.pointValue());
 }
}
