// ****************************************************************
// QuizGrades.java
//
// Calculate arithemetic quiz grades using this program.
//
// ****************************************************************
import java.util.Scanner;

public class QuizGrades {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int totalQuestions;
    String answerKey;
    
    System.out.println("How many questions were on the quiz?");
    totalQuestions = scan.nextInt();
    
    int[] answerList = new int[totalQuestions];
    
    System.out.println("Please enter the answer key separated by spaces:");
    answerKey = scan.next();
    
    /*for (int i=0; i<answerList; i++) {
      String
    }*/
  }
}