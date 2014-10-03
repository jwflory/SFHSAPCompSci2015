// ****************************************************************
//   LoveCS.java
//
//   Use a while loop to print many messages declaring your 
//   passion for computer science
// ****************************************************************
import java.util.Scanner;

public class LoveCS {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("How many times do you want to repeat the message?");
      int limit = scan.nextInt();
      int sum = 0;
      int count = 1;

      while (count <= limit) {
        sum = sum + count;
        System.out.println(count + " I love Computer Science!!");
        count++;
        }
      
      System.out.println("Printed this message " + (count - 1) + " times." + 
                         "The sum of the numbers from 1 to " + (count - 1) +
                         " is " + sum + ".");
    }
}