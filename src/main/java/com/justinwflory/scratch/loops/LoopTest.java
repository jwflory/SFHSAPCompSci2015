import java.util.Scanner;

public class LoopTest {
  public static void main(String[] args) {
    int i = 0;
    final int LIMIT = 100;
    while (i <= LIMIT) {
      System.out.println("while loop: " + i);
      i++;
    }
    
    /*
    for (initialization; condition; change;) {
      // body runs if condition == true;
    }
    */
    
    for (int j = 0; j <= LIMIT; j++) {
      System.out.println("for loop: " + j);
    }
  }
}