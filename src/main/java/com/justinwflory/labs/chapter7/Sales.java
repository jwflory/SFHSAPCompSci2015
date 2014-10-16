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
    int maximumSales = 0;
    int minimumSales = 0;
    int qualifier;
    int qualifierTotal = 0;
    
    for (int i=0; i<sales.length; i++) {
      System.out.print("Enter sales for salesperson " + i + ": ");
      sales[i] = scan.nextInt();
    }
    
    System.out.println("\nSalesperson   Sales");
    System.out.println("--------------------");
    for (int i=0; i<sales.length; i++) {
      System.out.println("     " + (i + 1) + "         $" + sales[i]);
      sum += sales[i];
      if (sales[i] > sales[maximumSales]) {
        maximumSales = i;
      } else if (sales[minimumSales] > sales[i]) {
        minimumSales = i;
      }
    }
    
    System.out.println("\nTotal sales: $5" + sum);
    System.out.println("Average sales: $" + (sum / salespeople));
    System.out.println("\nHighest sales by Salesperson " + (maximumSales + 1) + " with $" + sales[maximumSales]);
    System.out.println("Lowest sales by Salesperson " + (minimumSales + 1) + " with $" + sales[minimumSales]);
    
    System.out.println("\nEnter a monetary value to see how many salespeople met or exceeded that amount:");
    qualifier = scan.nextInt();
    
    for (int i=0; i<sales.length; i++) {
      if (sales[i] >= qualifier) {
        qualifierTotal++;
        System.out.println("Salesperson " + (i + 1) + " met or exceeded $" + qualifier + " with a total of $" +
                           sales[i] + ".");
      }
    }
    System.out.println("In total, " + qualifierTotal + " salespeople met or exceeded $" + qualifier + ".");
  }
}