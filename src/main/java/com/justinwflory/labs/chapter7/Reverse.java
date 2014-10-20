// ****************************************************************
// Reverse.java
//
// Reverse the order of an array from bottom to top.
//
// ****************************************************************
import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) throws InterruptedException {
    int size, swap;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("How many integers do you wish to store?");
    size = scan.nextInt();
    
    int[] array = new int[size];
    
    for (int i=0; i < array.length; i++) {
      System.out.print("Enter Array Value #" + i + ".");
      array[i] = scan.nextInt();
    }
    
    System.out.println("Here is what your original array looks like...");
    Thread.sleep(1000);
    printArray(array);
    
    for (int i=0; i < (array.length/2); i++) {
      swap = array[i];
      array[i] = array[array.length-1-i];
      array[array.length-1-i] = swap; 
    }
    Thread.sleep(3000);
    System.out.println("Here is your reversed array!");
    Thread.sleep(1000);
    printArray(array); 
  }
  
  public static void printArray(int[] a) {
    for (int i=0; i < a.length; i++) {
      System.out.print(a[i]+"\t");
      System.out.println();
    }
  }
}

