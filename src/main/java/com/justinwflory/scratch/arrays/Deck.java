public class Deck {
  private int[] cards = new int[50];
  
  public void initialize() {
    for (int i=0; i<cards.length(); i++) {
      cards[i] = i;
    }
    return true;
  }
  
  initialize();
  
  public Deck(int numCards) { /* code not shown */ }
  public boolean inOrder() {
    int counter = 0;
    for (int i=0; i<cards.length()-1; i++) {
      if (cards[i] == i) {
        counter++;
      }
      if (counter == cards.length()-1) {
        return true;
      } else {
        return false;
      }
    }
  }
  public void shuffle() {
    int[] originalOrder = cards;
    int[] temp = new int[cards.length()];
    int halfway = cards.length() / 2;
    for (int i=0; i<cards.length()-1; i++) {
      if (i <= halfway) {
        temp[i] = cards[i];
        temp[i+1] = cards[halfway];
        halfway++;
      }
    }
    cards = temp;
  }
  public int reorderingCount() {
    cards = originalOrder;
    if (inOrder()) {
      System.out.println("Successfully restored!");
    }
  }
  
  /*
   * This code is by no means complete, and if you choose to use it,
   * you should use it at your own risk, be it for an actual application
   * (which I sincerely hope not) or for learning how to perform a
   * particular method for a grade. I am still trying to understand
   * myself, so please keep that in mind as well.
   */
}