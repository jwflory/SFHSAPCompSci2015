// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//
// add code after each comment below that tells you what code to add
//          
// ****************************************************************

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SquareTest {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("magicData.txt"));
    
    int count = 1;                 //count which square we're on
    int size = scan.nextInt();     //size of next square
    
    //Expecting -1 at bottom of input file
    while (size != -1) {
      
      //create a new Square of the given size
      Square square = new Square(size);
      
      //call its read method to read the values of the square
      square.readSquare(scan);
      
      System.out.println("\n******** Square " + count + " ********");
      //print the square
      square.printSquare();
      System.out.print("\n");
      
      //print the sums of its rows
      for (int row=0; row < size; row++) System.out.println("The sum of Row #" + row + " is:\t\t" + 
                                                            square.sumRow(row));
      
      //print the sums of its columns
      for (int col=0; col < size; col++) System.out.println("The sum of Column #" + col + " is:\t\t" + 
                                                            square.sumCol(col));
      
      //print the sum of the main diagonal
      System.out.println("The sum of the main diagonal is:\t" + square.sumMainDiag());
      
      //print the sum of the other diagonal
      System.out.println("The sum of the other diagonal is:\t" + square.sumOtherDiag());
      
      //determine and print whether it is a magic square
      System.out.println("Is Square #" + count + " a magic square?\t\t" + square.magic());
      
      //get size of next square
      size = scan.nextInt();
      count++;
    }
    
  }
}