/*
 * this class contains utility methods for array manipulation.
 */
public class ArrayUtil {
  /*
   * Creates an array filled with random values.
   * @param length the length of the array
   * @param n the number of possible random values
   * @return an array filled with "length" values between 0 and n-1, inclusive
   */
  public static int[] randomIntArray(int length, int n) {
    int[] returnArray = new int[length];
    
    // using a regular for loop, since we need the index in order to store a
    // value into each element of the array
    //
    for (int i = 0; i < length; i++)
      returnArray[i] = (int)(Math.random() * n);
    
    return returnArray;
  }
  
  /*
   * prints all elements in an array of ints
   * @param array the integer array to print
   */
  public static void print(int[] array) {
    // using a for-each loop since we need to print every element, and don't need
    // the index, just the value, of each element
    //
    for (int i : array)
      System.out.print(i + " ");
    
    // new line (return) only at the very end
    System.out.println();
  }
}