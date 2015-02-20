//TODO Remove shuffle method from constructor (why? think to discussion)

import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 * SFHS AP Computer Science A 2015
 */
public class Deck {
<<<<<<< HEAD
  
  /**
   * <code>cards</code> contains all the cards in the deck.
   */
  private List<Card> cards;
  
  /**
   * <code>numUndealtCards</code> is the number of not-yet-dealt cards.
   * Cards are dealt from the top (highest index) down.
   * The next card to be dealt is at size - 1.
   */
  private int numUndealtCards;
  
  private static final String[] DEFAULT_RANKS = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace",
    "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace",
    "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace",
    "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
  private static final String[] DEFAULT_SUITS = {"spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades",
    "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts",
    "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs",
    "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds"};
  private static final int[] DEFAULT_VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13,
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13,
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13,
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13};
  
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
    cards = new ArrayList<Card>();  // (3)
    
    if (ranks == null) {
      throw new IllegalArgumentException("The 'ranks' array parameter was 'null'. " +
                                         "You must supply three valid arrays.");
    } else if (suits == null) {
      throw new IllegalArgumentException("The 'suits' array parameter was 'null'. " +
                                         "You must supply three valid arrays.");
    } else if (values == null) {
      throw new IllegalArgumentException("The 'values' array parameter was 'null'. " +
                                         "You must supply three valid arrays.");
    } else if (ranks.length != suits.length || ranks.length != values.length) {
      throw new IllegalArgumentException("The lengths of the three arrays are not all the same.  They must match.\n" +
                                         "The lengths are:\nranks.length = " + ranks.length +
                                         "\nsuits.length = " + suits.length + "\nvalues.length = " + values.length);
    }
    
    for (int i=0; i < ranks.length; i++) {
      cards.add(new Card(ranks[i], suits[i], values[i]));
    }
    
    numUndealtCards = cards.size();
=======

 /**
  * <code>cards</code> contains all the cards in the deck.
  */
 private List<Card> cards;

 /**
  * <code>numUndealtCards</code> is the number of not-yet-dealt cards.
  * Cards are dealt from the top (highest index) down.
  * The next card to be dealt is at size - 1.
  */
 private int numUndealtCards;


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
   cards = new ArrayList<Card>();
   
   for (int i=0; i<suits.length; i++) {
     for (int j=0; j<ranks.length; j++) {
       Card card = new Card(ranks[j], suits[i], values[j]);
       cards.add(card);
     }
   }
   
   numUndealtCards = cards.size();
   shuffle();
 }
 
 /**
  * Creates a default <code>Deck</code> instance.<BR>
  * A default deck consists of 52 cards: 13 cards using the traditional ranks, in each of the
  * 4 traditional suits, where a "two" is worth 1 point and an "ace" is worth 13 points.
  */
 public Deck() {
   cards = new ArrayList<Card>();
   String[] ranks = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
     "jack", "queen", "king", "ace"};
   String[] suits = {"spades", "hearts", "clubs", "diamonds", "spades", "hearts", "clubs", "diamonds", "spades", "hearts", "clubs", "diamonds", "spades"};
   int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
   
   for (int i=0; i<suits.length; i++) {
     for (int j=0; j<ranks.length; j++) {
       Card card = new Card(ranks[j], suits[i], values[j]);
       cards.add(card);
     }
   }
   
   numUndealtCards = cards.size();
   shuffle();
 }
 

 /**
  * Determines if this deck is empty (no undealt cards).
  * @return true if this deck is empty, false otherwise.
  */
 public boolean isEmpty() {
   return numUndealtCards == 0;
 }

 /**
  * Accesses the number of undealt cards in this deck.
  * @return the number of undealt cards in this deck.
  */
 public int numUndealtCards() {
  return numUndealtCards;
 }

 /**
  * Randomly permute the given collection of cards
  * and reset the size to represent the entire deck.
  */
 public void shuffle() {
 }

 /**
  * Deals a card from this deck.
  * @return the card just dealt, or null if all the cards have been
  *         previously dealt.
  */
 public Card deal() {
   for (numUndealtCards = numUndealtCards; numUndealtCards <= 0; numUndealtCards--) {
     return cards.get(numUndealtCards);
   }
   return null;
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
  String rtn = "size = " + numUndealtCards + "\nUndealt cards: \n";

  for (int k = numUndealtCards - 1; k >= 0; k--) {
   rtn = rtn + cards.get(k);
   if (k != 0) {
    rtn = rtn + ", ";
   }
   if ((numUndealtCards - k) % 2 == 0) {
    // Insert carriage returns so entire deck is visible on console.
    rtn = rtn + "\n";
   }
>>>>>>> 085dcd42729ddbde17e3a17b904a59925f3caeb8
  }
  
  /**
   * Creates a default <code>Deck</code> instance.<BR>
   * A default deck consists of 52 cards: 13 cards using the traditional ranks, in each of the
   * 4 traditional suits, where a "two" is worth 1 point and an "ace" is worth 13 points.
   */
  public Deck() { this(DEFAULT_RANKS, DEFAULT_SUITS, DEFAULT_VALUES); }
  
  
  /**
   * Determines if this deck is empty (no undealt cards).
   * @return true if this deck is empty, false otherwise.
   */
  public boolean isEmpty() {
    return (numUndealtCards == 0);
  }
  
  /**
   * Accesses the number of undealt cards in this deck.
   * @return the number of undealt cards in this deck.
   */
  public int numUndealtCards() {
    return numUndealtCards;
  }
  
  /**
   * Randomly permute the given collection of cards
   * and reset the size to represent the entire deck.
   */
  public void shuffle() {
  }
  
  /**
   * Deals a card from this deck.
   * @return the card just dealt, or null if all the cards have been
   *         previously dealt.
   */
  public Card deal() {
    if (numUndealtCards > 0) {
      numUndealtCards--;
      return cards.get(numUndealtCards);
    } else return null;
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
    String rtn = "size = " + numUndealtCards + "\nUndealt cards: \n";
    
    for (int k = numUndealtCards - 1; k >= 0; k--) {
      rtn = rtn + cards.get(k);
      if (k != 0) {
        rtn = rtn + ", ";
      }
      if ((numUndealtCards - k) % 2 == 0) {
        // Insert carriage returns so entire deck is visible on console.
        rtn = rtn + "\n";
      }
    }
    
    rtn = rtn + "\nDealt cards: \n";
    for (int k = cards.size() - 1; k >= numUndealtCards; k--) {
      rtn = rtn + cards.get(k);
      if (k != numUndealtCards) {
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