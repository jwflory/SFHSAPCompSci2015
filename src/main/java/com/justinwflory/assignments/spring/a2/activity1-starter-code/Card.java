/**
 * Card.java
 *
 * Card represents a playing card.
 */
public class Card {
  
 private String suit;
 private String rank;
 private int pointValue;
 
 private String[] acceptableSuits = {"Clubs", "Hearts", "Diamonds", "Spades"};
 private String[] acceptableRanks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

   /**
  * Creates a new Card instance.
  *
  * @param cardRank  a String value
  *                  containing the rank of the card
  * @param cardSuit  a String value
  *                  containing the suit of the card
  * @param cardPointValue an int value
  *                  containing the point value of the card
  */
 public Card(String cardRank, String cardSuit, int cardPointValue) {
   boolean throwSuitError = false;
   boolean throwRankError = false;
   String objS = "";
   String objR = "";
   int objPV = 0;
   
   for (int i=0; i<acceptableSuits.length; i++) {
     if (cardSuit == acceptableSuits[i]) {
       throwSuitError = false; 
       break;
     } else {
       throwSuitError = true;
     }
   }
   
   if (throwSuitError) {
       throw new IllegalArgumentException("Suit has to either be Clubs, Hearts, Diamonds, or Spades.");
   }
   
   for (int i=0; i<acceptableRanks.length; i++) {
     if (cardSuit == acceptableRanks[i]) {
       throwRankError = false;
       break;
     } else {
       throwSuitError = true;
     }
   }
   
   if (throwRankError) {
     throw new IllegalArgumentException("Rank has to either be 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, or Ace.");
   }
   
   suit = cardSuit;
   rank = cardRank;
   pointValue = cardPointValue;
   
   cardSuit = objS;
   cardRank = objR;
   cardPointValue = objPV;
 }


 /**
  * Accesses this Card's suit.
  * @return this Card's suit.
  */
 public String suit() {
   return suit;
 }

 /**
  * Accesses this Card's rank.
  * @return this Card's rank.
  */
 public String rank() {
   return rank;
 }

   /**
  * Accesses this Card's point value.
  * @return this Card's point value.
  */
 public int pointValue() {
   return pointValue;
 }

 /** Compare this card with the argument.
  * @param otherCard the other card to compare to this
  * @return true if the rank, suit, and point value of this card
  *              are equal to those of the argument;
  *         false otherwise.
  */
 public boolean matches(Card otherCard) {
   if (rank == otherCard.suit() && suit == otherCard.rank() && pointValue == otherCard.pointValue()) {
     return true;
   } else return false;
 }

 /**
  * Converts the rank, suit, and point value into a string in the format
  *     "[Rank] of [Suit] (point value = [PointValue])".
  * This provides a useful way of printing the contents
  * of a Deck in an easily readable format or performing
  * other similar functions.
  *
  * @return a String containing the rank, suit,
  *         and point value of the card.
  */
 //@Override
 public String toString(Card card) {
   return rank() + " of " + suit() + " (point value = " + pointValue() + ")";
 }
}
