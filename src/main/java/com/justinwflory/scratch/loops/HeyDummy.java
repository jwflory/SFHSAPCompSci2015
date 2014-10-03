import java.util.Scanner;

public class HeyDummy {
  public static void main(String[] args) {
    System.out.println("Please enter number between 1 and 10.");
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    while(i < 1 || i > 10) {
      System.out.println("Hey Dummy! I said between 1 and 10!");
      i = scan.nextInt();
    }
  }
}