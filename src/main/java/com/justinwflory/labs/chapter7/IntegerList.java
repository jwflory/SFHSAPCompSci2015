// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create & fill
// a list of integers.
//          
// ****************************************************************

public class IntegerList {
  int[] list; //values in the list
  
  //-------------------------------------------------------
  // Create a list of the given size
  //-------------------------------------------------------
  public IntegerList(int size) {
    list = new int[size];
  }
  
  
  //-------------------------------------------------------
  // Fill array with integers between 1 and 100, inclusive
  //-------------------------------------------------------
  public void randomize() {
    for (int i=0; i<list.length; i++)
      list[i] = (int)(Math.random() * 100) + 1;
  }
  
  //-------------------------------------------------------
  // Print array elements with indices
  //-------------------------------------------------------
  public void print() {
    for (int i=0; i<list.length; i++)
      System.out.println(i + ":\t" + list[i]);
  }
  
  
  //-------------------------------------------------------
  // Increase the size of the current array
  //-------------------------------------------------------
  public void increaseSize(int size) {
    list = new int[size * 2];
  }
  
  
  //-------------------------------------------------------
  // Add an element to the current array
  //-------------------------------------------------------
  public void addElement(int newVal) {
    if (list[(list.length()-1)] != null) {
      increaseSize(list.length());
    }
  }
}