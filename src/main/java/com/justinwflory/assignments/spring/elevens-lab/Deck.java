import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 * SFHS AP Computer Science A 2015
 */
public class Deck {

 /**
  * cards contains all the cards in the deck.
  */
 private List<Card> cards;

 /**
  * size is the number of not-yet-dealt cards.
  * Cards are dealt from the top (highest index) down.
  * The next card to be dealt is at size - 1.
  * NOTE: this should be changed, according to class discussion about designing
  * this class.  Once changed, make appropriate changes in other parts of the code.
  */
 private int size;


 /**
  * Creates a new <code>Deck</code> instance.<BR>
  * Creates an appropriate object compatible with the List type.
  * It matches each element of ranks with the corresponding element of suits
  * and the corresponding element of values,
  * and produces an appropriate card.  Each card created is then added to the List object.
  * 
  * Be sure to check for obvious errors and throw exceptions as necessary.
  * Make sure any thrown exceptions come with appropriately detailed messages.
  * Don't duplicate any work that the Card class will take care of on it's own.
  * 
  * @param ranks is an array containing all of the card ranks.
  * @param suits is an array containing all of the card suits.
  * @param values is an array containing all of the card point values.
  */
 public Deck(String[] ranks, String[] suits, int[] values) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
 }

 /**
  * Creates a default <code>Deck</code> instance.<BR>
  * A default deck consists of 52 cards: 13 cards using the traditional ranks, in each of the
  * 4 traditional suits, where a "two" is worth 1 point and an "ace" is worth 13 points.
  */
 public Deck() {
   /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
 }
 

 /**
  * Determines if this deck is empty (no undealt cards).
  * @return true if this deck is empty, false otherwise.
  */
 public boolean isEmpty() {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
 }

 /**
  * Accesses the number of undealt cards in this deck.
  * NOTE: needs renaming to correspond with your renamed instance field from above.
  * @return the number of undealt cards in this deck.
  */
 public int size() {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
 }

 /**
  * Randomly permute the given collection of cards
  * and reset the size to represent the entire deck.
  */
 public void shuffle() {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
 }

 /**
  * Deals a card from this deck.
  * @return the card just dealt, or null if all the cards have been
  *         previously dealt.
  */
 public Card deal() {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
 }

 /**
  * Generates and returns a string representation of this deck.
  * NOTE: needs to be modified according to your renamed instance field from above.
  * Also, if you did not follow the "toString" format exactly in Card's toString method, you might
  * want to rethink that when you see how it works in conjunction with Deck's toString method
  * 
  * @return a string representation of this deck.
  */
 @Override
 public String toString() {
  String rtn = "size = " + size + "\nUndealt cards: \n";

  for (int k = size - 1; k >= 0; k--) {
   rtn = rtn + cards.get(k);
   if (k != 0) {
    rtn = rtn + ", ";
   }
   if ((size - k) % 2 == 0) {
    // Insert carriage returns so entire deck is visible on console.
    rtn = rtn + "\n";
   }
  }

  rtn = rtn + "\nDealt cards: \n";
  for (int k = cards.size() - 1; k >= size; k--) {
   rtn = rtn + cards.get(k);
   if (k != size) {
    rtn = rtn + ", ";
   }
   if ((k - cards.size()) % 2 == 0) {
    // Insert carriage returns so entire deck is visible on console.
    rtn = rtn + "\n";
   }
  }

  rtn = rtn + "\n";
  return rtn;
 }
}

//
// SFHS AP Computer Science 2015
//