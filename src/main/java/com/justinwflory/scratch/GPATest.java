import java.util.Scanner;

public class GPATest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter the grade to be checked.");
    int g = scan.nextInt();
    int gpa;
    
    if (g >= 90) {
      gpa = 4;
    } else if (g >= 80) {
      gpa = 3;
    } else if (g >= 70) {
      gpa = 2;
    } else if (g >= 60) {
      gpa = 1;
    } else {
      gpa = 0;
    }
    
    System.out.println("GPA is " + gpa);
  }
}
