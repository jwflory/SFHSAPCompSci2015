// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;

public class Sales {
  public static void main(String[] args) {
    
    /* when an array is going to be a fixed size, using a constant like the one used
     * below to define the size of the array is a good idea.  The name of the constant
     * is a better indicator of why the array is the size that it is.
     */
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter the total number of salespeople:");
    int salespeople = scan.nextInt();
    
    int[] sales = new int[salespeople];
    int sum = 0;
    int maximumSales;
    
    for (int i=0; i<sales.length; i++) {
      System.out.print("Enter sales for salesperson " + i + ": ");
      sales[i] = scan.nextInt();
    }
    
    maximumSales = sales[0];
    
    System.out.println("\nSalesperson   Sales");
    System.out.println("--------------------");
    for (int i=0; i<sales.length; i++) {
      System.out.println("     " + i + "         $" + sales[i]);
      sum += sales[i];
      if (sales[i] > maximumSales) {
        maximumSales = i;
      }
    }
    
    System.out.println("\nTotal sales: $5" + sum);
    System.out.println("Average sales: $" + (sum / salespeople));
    System.out.println("\nHighest sales by Salesperson " + maximumSales + " with $" + sales[maximumSales]);
  }
}