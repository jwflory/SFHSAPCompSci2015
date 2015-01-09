// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************

import java.util.Scanner;

public class Square {
  int[][] square;
  
  //--------------------------------------
  //create new square of given size
  //--------------------------------------
  public Square(int size) {
    square = new int[size][size];
  }
  
  //--------------------------------------
  //return the sum of the values in the given row
  //--------------------------------------
  public int sumRow(int row) {
    int sum = 0;
    for (int i=0; i < square.length; i++) {
      sum += square[row][i];
    }
    return sum;
  }
  
  //--------------------------------------
  //return the sum of the values in the given column
  //--------------------------------------
  public int sumCol(int col) {
    int sum = 0;
    for (int i=0; i < square.length; i++) {
      sum += square[i][col];
    }
    return sum;
  }
  
  //--------------------------------------
  //return the sum of the values in the main diagonal
  // top left down to lower right
  //--------------------------------------
  public int sumMainDiag() {
    int sum = 0;
    for (int i=0; i < square.length; i++) {
      sum += square[i][i];
    }
    return sum;
  }
  
  //--------------------------------------
  //return the sum of the values in the other ("reverse") diagonal
  // bottom left up to top right
  //--------------------------------------
  public int sumOtherDiag() {
    int sum = 0;
    for (int i=0; i < square.length; i++) {
      sum += square[i][square.length-1-i];
    }
    return sum;
  }
  
  //--------------------------------------
  // return true if the square is magic (all rows, cols, and diags have
  // same sum), false otherwise
  // Hint: get one of the diagonal sums as the "target"
  //  then compare the target with all other possibilities; as soon as
  //  something doesn't match, you can return false
  //--------------------------------------
  public boolean magic() {
    int target = sumMainDiag();
    
    if (sumOtherDiag() == target) {
      for (int i=0; i < square.length; i++) {
        if (sumRow(i) != target) return false;
      }
      for (int i=0; i < square.length; i++) {
        if (sumCol(i) != target) return false;
      }
    } else {
      return false;
    }
    return true;
  }
  
  //--------------------------------------
  // Read info into the square from the input stream associated with the 
  // Scanner parameter
  // This method is COMPLETE.  You do not need to add to or change
  //  anything in it.
  //--------------------------------------
  public void readSquare(Scanner scan){
    for (int row = 0; row < square.length; row++)
      for (int col = 0; col < square.length; col ++)
      square[row][col] = scan.nextInt();
  }
  
  //--------------------------------------
  // print the contents of the square, neatly formatted
  // Hint: use nested loops and the "\t" escape character (see Section 2.2)
  //--------------------------------------
  public void printSquare() {
    for (int row=0; row < square.length; row++) { 
      for (int col=0; col < square[row].length; col++) 
        System.out.print (square[row][col] + "\t"); 
      System.out.println(""); 
    }
  }
}