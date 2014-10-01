// ************************************************
//   BaseConvert.java
//
//   Converts base 10 numbers to another base
//   (at most 4 digits in the other base).  The
//   base 10 number and the base are input.
// ************************************************

import java.util.Scanner;

public class BaseConvert {
   public static void main (String[] args) {
      int base;        // the new base
      int base10Num;   // the number in base 10
      int maxNumber;   // the maximum number that will fit
                       // in 4 digits in the new base

      int place0;      // digit in the 1's (base^0) place
      int place1;      // digit in the base^1 place
      int place2;      // digit in the base^2 place
      int place3;      // digit in the base^3 place

      String baseBNum = new String (""); // the number in the new base
      Scanner scan = new Scanner(System.in);

      // read in the base 10 number and the base
      System.out.println();
      System.out.println ("Base Conversion Program");
      System.out.println();
      System.out.print ("Please enter a base (2 - 9): ");
      base = scan.nextInt();

      // Compute the maximum base 10 number that will fit in 4 digits 
      // in the new base and tell the user what range the number they
      // want to convert must be in (2 statements; maybe more depending on your style)
      maxNumber = 9999;

      // prompt the user for a number
      System.out.print ("Please enter a base 10 number, in the range shown above, to convert: ");
      base10Num = scan.nextInt();

      // check if the entered number is in the proper range; if it is, do the conversion and print the result
      // if it is not, print an error message
      if (base10Num <= maxNumber) {
        place3 = base10Num % base;
        int quotient3 = base10Num / base;
        place2 = quotient3 % base;
        int quotient2 = quotient3 / base;
        place1 = quotient2 % base;
        int quotient1 = quotient2 / base;
        place0 = quotient1 % base;
        int quotient0 = quotient1 / base;
        
        System.out.println("The result is " + place0 + place1 + place2 + place3 + ".");
      } else {
        System.out.println("You entered too large of a base!");
      }
    }
}