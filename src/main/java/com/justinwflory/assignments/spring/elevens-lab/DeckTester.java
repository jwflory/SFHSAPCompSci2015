/**
 * This is a class that tests the Deck class.
 * SFHS AP Computer Science A 2015
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * All cards created should conform to traditional playing cards, as implemented and enforced
  * by the Card.java solution code from Activity1 (which you should have modified your code to match the
  * behavior, or just adapted the solution code as published).
  * 
  * @param args is not used.
  */
 public static void main(String[] args) {
   Deck badDeck;
   Deck testDeck;
   
   Deck deck1;
   Deck deck2;
   Deck deck3;
   
   String[] ranks = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
    "jack", "queen", "king", "ace"};
   String[] suits = {"spades", "hearts", "clubs", "diamonds"};
   int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
   
   System.out.println("Deck 1 toString method reports:");
   System.out.println("    " + deck1);  // the call to toString is implied by referencing deck1 in a String context
   System.out.println("The individual accessor method calls below should return the same values:");
   System.out.println("isEmpty: " + deck1.isEmpty());
   System.out.println("numUndealtCards: " + deck1.numUndealtCards());
   System.out.println();
   
   //testDeck = new Deck(ranks, suits, values);
   //System.out.println("    " + testDeck);
 }
}
