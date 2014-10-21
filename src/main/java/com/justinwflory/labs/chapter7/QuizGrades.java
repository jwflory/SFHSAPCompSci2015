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
    String studentAnswers;
    int totalCorrect = 0;
    float percentCorrect; // Used float to use fewer decimal places
    boolean done = false;
    String doneCheck;
    
    System.out.println("How many questions were on the quiz?");
    totalQuestions = scan.nextInt();
    scan.nextLine(); // Necessary otherwise scanner doesn't move to next line for strings because of nextInt
    
    System.out.println("Please enter the answer key, separated by spaces:");
    answerKey = scan.nextLine();   
    
    // Convert the string answerKey into an array with data split by whitespace
    String[] answerSplit = answerKey.split("\\s+");
    
    while (!done) {
      System.out.println("Please enter the student's answers, separated by spaces.");
      studentAnswers = scan.nextLine();
      String[] studentSplit = studentAnswers.split("\\s+");
      
      totalCorrect = 0;
      for (int i=0; i < totalQuestions; i++) {
        if (answerSplit[i].equals(studentSplit[i])) {
          totalCorrect++;
        }
      }
      
      percentCorrect = ((float) totalCorrect / totalQuestions) * 100;
      
      System.out.println("The student answered " + totalCorrect + " questions out of " + totalQuestions +
                         " correctly. Their percentage of questions answered correctly was " + percentCorrect + "%.");
      
      System.out.println("\n\nGrade another quiz? (y/n)");
      doneCheck = scan.nextLine();
      while (doneCheck.charAt(0) != 'y' && doneCheck.charAt(0) != 'n') {
        System.out.println("Invalid input! Please enter a lowercase 'y' or 'n'.");
        doneCheck = scan.nextLine();
      }
      if (doneCheck.charAt(0) == 'y') {
        done = false;
      } else if (doneCheck.charAt(0) == 'n') {
        done = true;
      }
    }
  }
}