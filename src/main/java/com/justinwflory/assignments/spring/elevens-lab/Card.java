/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 * This is a working sample - it is not the only possible solution.
 * You may use this code to update your Card.java class (will help you learn more), or
 * you can just drop it into your folder and use as is (won't learn as much, but this part of your project will work)
 * SFHS AP Computer Science 2015
 * 
 * The 11 items being looked for when this file was graded were:
 * 1) verify the cardRank parameter in constructor, before assigning
 * 2) assign cardRank to rank
 * 3) verify the cardSuit parameter in constructor, before assigning
 * 4) assign cardSuit to suit
 * 5) assign cardPointValue to pointValue without restrictions
 * 6) complete the suit method
 * 7) complete the rank method
 * 8) complete the pointValue method
 * 9) complete the matches method
 * 10) complete the toString method
 * 11) class has no extraneous code (e.g. no println statements that would generate output where
 *     output isn't expected, no unecessary verifications, etc)
 */
public class Card {

 /**
  * String value that holds the suit of the card
  */
 private String suit;

 /**
  * String value that holds the rank of the card
  */
 private String rank;

 /**
  * int value that holds the point value.
  */
 private int pointValue;

 // arrays with accepted values are declared static (so there's only one copy no matter how many cards we create),
 // final (they don't need to be changed), and private (only need to be accessed in this code)
 private static final String[] suits = { "spades", "hearts", "clubs", "diamonds" };
 private static final String[] ranks = { "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
   "jack", "queen", "king", "ace" };

   /**
  * Creates a new <code>Card</code> instance.
  *
  * @param cardRank  a <code>String</code> value
  *                  containing the rank of the card
  * @param cardSuit  a <code>String</code> value
  *                  containing the suit of the card
  * @param cardPointValue an <code>int</code> value
  *                  containing the point value of the card
  */
 public Card(String cardRank, String cardSuit, int cardPointValue) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

   // verify the cardRank using an array - Item 1
   boolean rankOK = false;
   cardRank = cardRank.toLowerCase();      // try to help the user out a little by forcing lower case
   for (int i = 0; i < ranks.length; i++) {
     if (cardRank.equals(ranks[i])) {
       rankOK = true;
       break;           // stop the loop, we found a match
     }
   }
   if (!rankOK) {
     throw new IllegalArgumentException("The cardRank parameter, " + cardRank + ", is not allowed.\n" +
                                        "Acceptable values are: two, three, four, five, six, seven, eight, nine, " +
                                        "ten, jack, queen, king, and ace");
   }
   rank = cardRank; // Item 2
   
   // verify the cardSuit using an array - Item 3
   boolean suitOK = false;
   cardSuit = cardSuit.toLowerCase();      // try to help the user out a little by forcing lower case
   for (int i = 0; i < suits.length; i++) {
     if (cardSuit.equals(suits[i])) {
       suitOK = true;
       break;           // stop the loop, we found a match
     }
   }
   if (!suitOK) {
     throw new IllegalArgumentException("The cardSuit parameter, " + cardSuit + ", is not allowed.\n" +
                                        "Acceptable values are: spades, hearts, clubs, diamonds");
   }
   suit = cardSuit;  // Item 4
   
   // point value is taken as provided - Item 5
   pointValue = cardPointValue;
   
 }


 /**
  * Accesses this <code>Card's</code> suit.
  * @return this <code>Card's</code> suit.
  */
 public String suit() {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   return suit; // Item 6
   }

 /**
  * Accesses this <code>Card's</code> rank.
  * @return this <code>Card's</code> rank.
  */
 public String rank() {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   return rank; // Item 7
 }

   /**
  * Accesses this <code>Card's</code> point value.
  * @return this <code>Card's</code> point value.
  */
 public int pointValue() {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   return pointValue; // Item 8
 }

 /** Compare this card with the argument.
  * @param otherCard the other card to compare to this
  * @return true if the rank, suit, and point value of this card
  *              are equal to those of the argument;
  *         false otherwise.
  */
 public boolean matches(Card otherCard) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   
   // we use the instance fields directly in the comparisons, since it is faster than
   // calling the accessor methods; since otherCard is an object of this Card class, we are allowed
   // to access its private instance fields in this code
   // if you used the accessor methods, you still received credit
   
   return (this.rank.equals(otherCard.rank) &&
           this.suit.equals(otherCard.suit) &&
           this.pointValue == otherCard.pointValue);  // Item 9
 }

 /**
  * Converts the rank, suit, and point value into a string in the format
  *     "[Rank] of [Suit] (point value = [PointValue])".
  * This provides a useful way of printing the contents
  * of a <code>Deck</code> in an easily readable format or performing
  * other similar functions.
  *
  * @return a <code>String</code> containing the rank, suit,
  *         and point value of the card.
  */
 @Override
 public String toString() {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   
   // Item 10; NOTE: you still received credit if you included all 3 pieces of data in the String, even if
   //          you didn't precisely follow the given format.  That won't always be the case. FOLLOW DIRECTIONS!
   return rank + " of " + suit + " (point value = " + pointValue + ")";
   
 }
}
