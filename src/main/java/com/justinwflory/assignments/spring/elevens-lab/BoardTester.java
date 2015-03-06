// Justin Flory's Code

import java.util.List;

/**
 * AP Computer Science A 2015
 *
 * A simple BoardTester class
 * creates an ElevensBoard object and then prints the cards that were initially dealt to the board
 */

public class BoardTester {
  public static void main(String[] args) {
    ElevensBoard board = new ElevensBoard();
    for (int i=0; i<board.boardSize(); i++) {
      board.deal(i);
    }
    
    // using the ElevensBoard toString
    System.out.println();
    System.out.println("Printing the board using the toString() method");
    System.out.println(board);
    
    // using the method you have to write below
    System.out.println();
    System.out.println("Printing the board using the printCards() method");
    printCards(board);
  }
  
  /**
   * Print all of the cards on the board.
   */
  public static void printCards(ElevensBoard board) {
    List<Integer> cIndexes = board.cardIndexes();
    
    for (int i : cIndexes) {
      System.out.println(board.cardAt(i));
    }
  }
}