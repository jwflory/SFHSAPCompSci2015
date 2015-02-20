import java.util.List;
import java.util.ArrayList;

/**
 * There were 13 required things and 1 EC thing being looked for in the Deck.java code
 * 1) the presence of a top & bottom header which were added to the Starter file
 *    distributed via itsLearning and which would not have been present in the
 *    version you were told to delete or any "answer" file that may have been
 *    available on the Internet
 * 2) that the "number of undealt cards" instance field was renamed from "size" to something
 *    more appropriate and not conflicting with typical use of "size"; this was discussed in
 *    class and the itsLearning version of the Starter code included a comment which
 *    said it was needed
 * 3) custom constructor create a new ArrayList of Cards
 * 4) custom constructor verified that parameters were not null and if one was
 *    reported the individual parameter that was null
 * 5) custom constructor verified that the 3 arrays were all the same length and
 *    reported the lengths if they didn't match
 * 6) that only 1 loop was used to create the Cards, matching corresponding elements
 *    from the three parameter arrays; the comments above the custom constructor
 *    stated this behavior was required
 * 7) set the "number of undealt cards" instance field (whatever you changed it to) to the
 *    total number of Cards added to the deck; you still got credit for this even if you left
 *    the name as "size"
 * 8) the presence of a default constructor (1/2 credit) that correctly built a
 *    standard 52 card deck (other 1/2 credit)
 * EC) that the default constructor made use of the custom constructor, fulfilling the
 *     "code reuse" philosophy of object-oriented programming
 * 9) complete the isEmpty method (still got full credit if "size" wasn't renamed)
 * 10) rename the "size" method to correspond appropriately with whatever you renamed "size" to
 * 11) complete the "size" method (still got full credit for this if "size" wasn't renamed)
 * 12) complete the "deal" method
 * 13) renamed the "size" instance field in the toString method (if you didn't get #2, you didn't
 *     get this one either)
 */

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 * SFHS AP Computer Science A 2015  (1)
 */
public class SolutionDeck {

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
 private int numNotDealt;   // (2)

 // set up three arrays with the values needed for a default deck
 // these are declared private (only need to be accessed in this class), static (only want one copy for the entire Deck class), and
 // final (they won't be changing) since the default deck is always the same
 // (needed for 8/EC)
 //
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
  * 
  * (This was the comment that corresponded to what we discussed in class, and would lead to
  *  a one-loop solution, as opposed to the two-loop solution many of you copied from some
  *  other source.)
  * It matches each element of ranks with the corresponding element of suits
  * and the corresponding element of values,
  * and produces an appropriate card.  Each card created is then added to the List object.
  * 
  * (Here was the reminder in the comments to check for errors.)
  * Be sure to check for obvious errors and throw exceptions as necessary.
  * Make sure any thrown exceptions come with appropriately detailed messages.
  * Don't duplicate any work that the Card class will take care of on it's own.
  * 
  * @param ranks is an array containing all of the card ranks.
  * @param suits is an array containing all of the card suits.
  * @param values is an array containing all of the card point values.
  */
 public SolutionDeck(String[] ranks, String[] suits, int[] values) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
   
   cards = new ArrayList<Card>();  // (3)
   
   // this test needs to come before the lengths are tested, since using a null pointer to try and
   // get the length of an array will generate a NullPointerException and the error message won't be as
   // meaningful as the one below
   // (4)
   if (ranks == null)
   {
     throw new IllegalArgumentException("The 'ranks' array parameter was 'null'. " +
                                        "You must supply three valid arrays.");
   }
   if (suits == null)
   {
     throw new IllegalArgumentException("The 'suits' array parameter was 'null'. " +
                                        "You must supply three valid arrays.");
   }
   if (values == null)
   {
     throw new IllegalArgumentException("The 'values' array parameter was 'null'. " +
                                        "You must supply three valid arrays.");
   }
   
   // (5)
   if (ranks.length != suits.length || ranks.length != values.length)
   {
     throw new IllegalArgumentException("The lengths of the three arrays are not all the same.  They must match.\n" +
                                        "The lengths are:\nranks.length = " + ranks.length +
                                        "\nsuits.length = " + suits.length + "\nvalues.length = " + values.length);
   }
   
   // (6)
   for (int i = 0; i < ranks.length; i++)
   {
     cards.add(new Card(ranks[i], suits[i], values[i]));
   }
   
   // the entire deck has not been dealt
   // (7)
   numNotDealt = cards.size();
 }

 /**
  * Creates a default <code>Deck</code> instance.<BR>
  * A default deck consists of 52 cards: 13 cards using the traditional ranks, in each of the
  * 4 traditional suits, where a "two" is worth 1 point and an "ace" is worth 13 points.
  * (8/EC)
  */
 public SolutionDeck() {
   /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */  
   // the arrays are built as constants, up with the instance fields
   // use the other constructor to actually build the deck
   // (important rule of encapsulation and code re-use: NEVER duplicate functionality that you could get by calling a method or
   //  constructor that already exists)
   //
   this(DEFAULT_RANKS, DEFAULT_SUITS, DEFAULT_VALUES);
   
 }
 
 /**
  * Determines if this deck is empty (no undealt cards).
  * @return true if this deck is empty, false otherwise.
  */
 public boolean isEmpty() {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
   
   // no need for an if statement, since the equality test evaluatesd to true or false, can just return it
   // (9)
   return (numNotDealt == 0);
 }

 /**
  * Accesses the number of undealt cards in this deck.
  * NOTE: needs renaming to correspond with your renamed instance field from above.
  * @return the number of undealt cards in this deck.
  */
 public int numNotDealt() {  // (10) - renamed appropriately
  /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
   return numNotDealt;  // (11) - return the value
 }

 /**
  * Randomly permute the given collection of cards
  * and reset the "numNotDealt" to represent the entire deck.
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
   
   // we are dealing "off the bottom" of the deck, by reducing
   // numNotDealt by 1, and then returning the card at that location
   // (12)
   // Note: if you threw an exception when the deck was empty you did not get full credit
   
   if (numNotDealt > 0)
   {
     numNotDealt--;
     return cards.get(numNotDealt);
   }
   else
   {
     return null;
   }
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
  String rtn = "numNotDealt = " + numNotDealt + "\nUndealt cards: \n";  // (13) - size renamed

  for (int k = numNotDealt - 1; k >= 0; k--) {
   rtn = rtn + cards.get(k);
   if (k != 0) {
    rtn = rtn + ", ";
   }
   if ((numNotDealt - k) % 2 == 0) {
    // Insert carriage returns so entire deck is visible on console.
    rtn = rtn + "\n";
   }
  }

  rtn = rtn + "\nDealt cards: \n";
  for (int k = cards.size() - 1; k >= numNotDealt; k--) {
   rtn = rtn + cards.get(k);
   if (k != numNotDealt) {
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
// SFHS AP Computer Science 2015 (1)
//