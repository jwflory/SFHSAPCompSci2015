/**
 * There were 14 points that could be earned for this file
 * 1) presence of a header at the top and bottom of the Starter code file
 *    distributed via itsLearning
 * 2) the presence of both the SHUFFLE_COUNT and VALUE_COUNT constants
 * 3) main method shuffle tests were left unchanged: these were provided and there
 *    was no reason to change them
 * 4) code was added to main method to test flip() method at least 30 times; 1/2 credit if
 *    you at least attempted to test flip() in some way
 * 5) code was added to main method to test arePermutations() on arrays that were permutations
 *    and therefore should have returned true
 * 6) code was added to main method to test arePermutations() on arrays that were NOT permutations
 *    and therefore should have return false
 * NOTE: when writing testing code, it is best if your code states in the output what the EXPECTED
 *   result is AS WELL AS showing the actual result; otherwise, how are you supposed to know whether
 *   the test was successful or not
 * 7/8) perfectShuffle implemented - most common reasons to lose points: if your code would not have worked correctly
 *      on a deck with both even number of cards and odd numbers of cards [you should have thought to test both],
 *      or if you assumed a 52 entry array like the example in the SG, or if the results didn't end up
 *      in the right place
 * 9/10) selectionShuffle implemented - most common reason to lose points: if you created an extra array to perform the
 *       process [ the whole point of selectionShuffle is that no extra collection is required ], you assumed
 *       52 items in the array, you didn't use Math.random() to generate the random number, the results
 *       didn't end up in the right place
 * 11/12) flip() method implemented - most common reasons to lose points: didn't use Math.random() to generate
 *        random number; didn't maintain the ratio of 2 heads to 1 tail
 * 13/14) arePermutations() method implemented - most common reasons to lose points: you didn't do it all, you copied
 *        someone else's code; solutions that used Arrays.sort() should have been rejected (but weren't), since the Arrays class is
 *        not part of the AP subset; solutions that provided their own sort method were overkill, and solutions that provided
 *        identical sort methods were copies of each other
 */


/**
 * This class provides a convenient way to test shuffling methods.
 * SFHS AP Computer Science 2015 (1)
 */
public class SolutionShuffler {
  
  // From class discussion, you should remember that 4 perfect shuffles of a 6 value array
  // should return the array to it's original state.  So, those would be good numbers to test with.
  // The Student Guide says a 52-card deck takes 8 shuffles, so that would be another good pair of test values
  
  /**
   * The number of consecutive shuffle steps to be performed in each call
   * to each sorting procedure. Experiement with different values.
   */
  // (2)
  private static final int SHUFFLE_COUNT = 8;   // good values to test with:  4, 8
  
  /**
   * The number of values to fill the values array with. Experiment with different values,
   * including both even numbers and odd numbers.
   */
  // (2)
  private static final int VALUE_COUNT = 52;   // good values to test with:  6, 52
  
  
  /**
   * Tests shuffling methods.
   * @param args is not used.
   */
  public static void main(String[] args) {
    // (3) - all these tests should have remained the same
    // if you didn't use the Starter code file distributed through itsLearning, you would have been missing
    // the code that uses VALUE_COUNT to create and fill the values1 and values2 arrays, so you would have lost
    // credit
    System.out.println("Results of " + SHUFFLE_COUNT +
                       " consecutive perfect shuffles:");
    
    int[] values1 = new int[VALUE_COUNT];
    for (int i = 0; i < VALUE_COUNT; i++) {
      values1[i] = i;
    }
    
    for (int j = 1; j <= SHUFFLE_COUNT; j++) {
      perfectShuffle(values1);
      System.out.print("  " + j + ":");
      for (int k = 0; k < values1.length; k++) {
        System.out.print(" " + values1[k]);
      }
      System.out.println();
    }
    System.out.println();
    
    // testing the ALTERNATE SOLUTION for the perfect shuffles
    // you were not expected to have this
    System.out.println("Results of " + SHUFFLE_COUNT +
                       " consecutive perfect shuffles using ALTERNATE method:");
    
    values1 = new int[VALUE_COUNT];
    for (int i = 0; i < VALUE_COUNT; i++) {
      values1[i] = i;
    }
    
    for (int j = 1; j <= SHUFFLE_COUNT; j++) {
      perfectShuffle2(values1);
      System.out.print("  " + j + ":");
      for (int k = 0; k < values1.length; k++) {
        System.out.print(" " + values1[k]);
      }
      System.out.println();
    }
    System.out.println();
    
    System.out.println("Results of " + SHUFFLE_COUNT +
                       " consecutive efficient selection shuffles:");
    
    int[] values2 = new int[VALUE_COUNT];
    for (int i = 0; i < VALUE_COUNT; i++) {
      values2[i] = i;
    }
    
    for (int j = 1; j <= SHUFFLE_COUNT; j++) {
      selectionShuffle(values2);
      System.out.print("  " + j + ":");
      for (int k = 0; k < values2.length; k++) {
        System.out.print(" " + values2[k]);
      }
      System.out.println();
    }
    System.out.println();
    
    // test flip() - (4)
    // some people did a nice job with this of actually counting and printing the results,
    // to avoid having to count by hand
    System.out.println("30 coin flips; on average, expect 20 heads, 10 tails");
    for (int i = 0; i < 30; i++)
    {
      System.out.print(flip() + " ");
    }
    System.out.println();
    System.out.println();
    
    // test arePermutations()
    int[] i1 = { 1, 2, 3, 4 };
    int[] i2 = { 3, 2, 4, 1 };
    int[] i3 = { 7, 5, 2, 1 };
    
    System.out.println("i1 and i2 are permutations, expect true: " + arePermutations(i1, i2));        // (5)
    System.out.println("i1 and i3 are NOT permutations, expect false: " + arePermutations(i1, i3));   // (6)
    
    
  }
  
  
  /**
   * Apply a "perfect shuffle" to the argument.
   * The perfect shuffle algorithm splits the deck in half, then interleaves
   * the cards in one half with the cards in the other.
   * @param values is an array of integers simulating cards to be shuffled.
   */
  // points 7 and 8
  public static void perfectShuffle(int[] values) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
    // the directions for implementing a perfect shuffle are given in the
    // Activity 3 section of the Student Guide
    
    // since the results need to go into the "values" array we've been given as a parameter,
    // we can either copy the whole array into one of the same size, or we can create two arrays with
    // one being for the top half and one being for the bottom half, which is what is done here, since it
    // corresponds with "splits the deck in half"
    // NOTE: we talked about this being a "two collection" algorithm in class, but the code below creates two new
    //  arrays for a total of 3 collections.  However, since the size of the 2 "half" arrays is the same as one
    //  whole array, we haven't used any more space than 2 collections would have used.
    //
    int half = (values.length + 1) / 2;   // round up; top half gets the extra card if odd number in deck
    int[] topHalf = new int[half];
    int[] bottomHalf = new int[values.length/2];
    
    for (int i = 0; i < half; i++)
    {
      topHalf[i] = values[i];
    }
    for (int i = half; i < values.length; i++)
    {
      bottomHalf[i - half] = values[i];
    }
    
    // put the top half cards into the even slots in values
    int k = 0;
    for (int j = 0; j < topHalf.length; j++)
    {
      values[k] = topHalf[j];
      k += 2;
    }
    
    // put the bottom half cards into the odd slots in values
    k = 1;
    for (int j = 0; j < bottomHalf.length; j++)
    {
      values[k] = bottomHalf[j];
      k += 2;
    }
  }
  
  public static void perfectShuffle2(int[] values) {
    /* ALTERNATE SOLUTION */
    // the directions for implementing a perfect shuffle are given in the
    // Activity 3 section of the Student Guide
    
    // since the results need to go into the "values" array we've been given as a parameter,
    // we can either copy the whole array into one of the same size, or we can create two arrays with
    // one being for the top half and one being for the bottom half
    // NOTE: this version implements a strictly "2 collection" version, by copying values into another array of
    // exactly the same size
    //
    // we still need to know where halfway is, adjusted for a deck with odd number of cards.
    //
    int half = (values.length + 1) / 2;   // round up; top half gets the extra card if odd number in deck
    
    int[] copy = new int[values.length];
    for (int i = 0; i < values.length; i++)
    {
      copy[i] = values[i];
    }
    
    // put the top half cards into the even slots in values
    int k = 0;
    for (int j = 0; j < half; j++)
    {
      values[k] = copy[j];
      k += 2;
    }
    
    // put the bottom half cards into the odd slots in values
    k = 1;
    for (int j = half; j < copy.length; j++)
    {
      values[k] = copy[j];
      k += 2;
    }
  }
  
  /**
   * Apply an "efficient selection shuffle" to the argument.
   * The selection shuffle algorithm conceptually maintains two sequences
   * of cards: the selected cards (initially empty) and the not-yet-selected
   * cards (initially the entire deck). It repeatedly does the following until
   * all cards have been selected: randomly remove a card from those not yet
   * selected and add it to the selected cards.
   * An efficient version of this algorithm makes use of arrays to avoid
   * searching for an as-yet-unselected card.
   * @param values is an array of integers simulating cards to be shuffled.
   */
  // points 9 and 10
  public static void selectionShuffle(int[] values) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
    // instructions for implementing a selection Shuffle are in the
    // Activity 3 section of the Student Guide
    
    // since "selection shuffle" works within one collection, instead of making a copy of
    // values, we only need 2 helper variables, in this case - two ints
    int position = values.length - 1;  // set position to the last element in the deck
    int temp;                          // to be used during the swapping
    
    while (position > 0) // will be working our way toward the "top"
    {
      // position also tells us how many cards are still in the deck that haven't been selected yet
      // use it to generate a random position
      int randPos = (int)(Math.random() * position);
      
      // swap the card at position with the card at randPos
      temp = values[position];
      values[position] = values[randPos];
      values[randPos] = temp;
      
      // move position closer to the "top"
      position--;
    }
  }
  
  /*
   * Activity 3 - Question 1
   */
  // points 11 and 12
  public static String flip() {
    int r = (int)(Math.random() * 3);
    if (r < 2)
      return "heads";
    else
      return "tails";
  }
  
  /*
   * Activity 3 - Question 2
   * NOTE: this method can be implemented without having to pre-sort the two arrays
   * pre-sorting the arrays is an expensive process - what if the arrays had 20 million entries each?
   * 
   * NOTE 2: it was not necessary to test if the arrays were the same length; the problem said
   * "given arrays of the same length", so being the same length was a pre-condition.  No points were taken off if you did,
   * unless your test caused something else to be wrong.
   * 
   * For Card and Deck, no such guarantee has been made, so it WAS necessary to test everything in those
   * classes.
   */
  // points 13 and 14
  public static boolean arePermutations(int[] a, int[] b)
  {
    for (int i = 0; i < a.length; i++)
    {
      boolean found = false;
      for (int j = 0; j < b.length; j++)
      {
        if (a[i] == b[j])
        {
          found = true;
          break;
        }
      }
      if (!found)
        return false;
    }
    return true;
  }
}

//
// SFHS AP Computer Science 2015 (1)
//