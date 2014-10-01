// ****************************************************************
//   Factorial.java
//
//   Calculate factorials!
//          
// ****************************************************************
import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please input a positive integer to calculate its factorial.");
    int factorial = scan.nextInt();
    int nextFactorial = factorial - 1;
    int result = factorial;
    
    while (factorial < 0) {
      System.out.println("That's a negative number! Please input a POSITIVE number.");
      factorial = scan.nextInt();
    }
    
    while (nextFactorial > 0) {
      result = result * nextFactorial;
      nextFactorial--;
    }
    
    if (factorial == 0) {
      result = 1;
    }
    
    System.out.println(factorial + "! is " + result);
  }
}