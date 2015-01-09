import java.util.Scanner;

public class UtiliyRunner {
  
  /*
   * this class demonstrates how to use the utility classes/methods in ArrayUtil and StopWatch
   */
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an array size (enter 0 to stop): ");
    int length = in.nextInt();
    
    while (length > 0) {
      // use stopwatch to time creation and printing of array
      StopWatch timer = new StopWatch();
      timer.start();
      
      // construct random array; values in array between 0 and 199
      int[] a = ArrayUtil.randomIntArray(length, 200);
      
      // print the array
      ArrayUtil.print(a);
      
      // stop the timer and print the time
      timer.stop();
      System.out.println("Elapsed time: " + timer.getElapsedTime() + " milliseconds");
      
      System.out.print("Enter an array size (enter 0 to stop): ");
      length = in.nextInt();
    }
  }
}