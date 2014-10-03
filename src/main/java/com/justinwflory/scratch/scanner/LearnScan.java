import java.util.Scanner;

public class LearnScan {
  public static void main(String[] args) {
    
    Scanner scanKB = new Scanner(System.in);
    // Scanner scanFile = new Scanner (new File("learn.txt"));
    String string1 = ("10 20 30 40 50");
    Scanner scanString = new Scanner ("string1");
  
    int x = scanString.nextInt();
    System.out.println("x is " + x);
  
    int y = scanString.nextInt();
    System.out.println("y is " + y);
  
    int z = scanString.nextInt();
    System.out.println("z is " + z);
  
  /*
   * nextInt()
   * next()
   * nextLine()
  */
  }
}