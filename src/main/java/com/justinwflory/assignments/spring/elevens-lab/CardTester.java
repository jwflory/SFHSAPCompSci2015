/**
 * This is a class that tests the Card class.
 * The 9 items being looked for in this file were:
 * 1) test a bad rank parameter
 * 2) test a bad suit parameter
 * 3) build at least 3 cards, 2 of which are different, and 2 of which are the same
 * 4) test toString
 * 5) test rank
 * 6) test suit
 * 7) test pointValue
 * 8) test matches with a combination that should return true
 * 9) test matches with a combination that should return false
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   
   Card badCard;
   
   // Item 1 - commented out after checking that expected exception was thrown
   //badCard = new Card("fortyTwo", "spades", 1);
   
   // Item 2 - commented out after checking that expected exception was thrown
   //badCard = new Card("king", "queens", 1);
   
   // Item 3
   Card card1 = new Card("ace", "spades", 13);
   Card card2 = new Card("ace", "spades", 13);    // should match with card1
   Card card3 = new Card("jack", "diamonds", 4);  // should not match with card1
   
   // Items 4, 5, 6, and 7
   System.out.println("Card 1 toString method reports:");
   System.out.println("    " + card1);  // the call to toString is implied by referencing card1 in a String context
   System.out.println("The individual accessor method calls below should return the same values:");
   System.out.println("rank: " + card1.rank());
   System.out.println("suit: " + card1.suit());
   System.out.println("pointValue: " + card1.pointValue());
   System.out.println();
   
   // Items 8 and 9
   System.out.println("Card 1 and Card 2 should match.");
   System.out.println(card1);
   System.out.println(card2);
   System.out.println("Matches? " + card1.matches(card2));
   System.out.println();
   System.out.println("Card 1 and Card 3 should not match.");
   System.out.println(card1);
   System.out.println(card3);
   System.out.println("Matches? " + card1.matches(card3));
   System.out.println();
 }
}
