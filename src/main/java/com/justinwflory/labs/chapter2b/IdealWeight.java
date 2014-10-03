import java.util.Scanner;

public class IdealWeight {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    final int femaleInit = 100;
    final int maleInit = 106;
    String gender;
    int feet;
    int inches;
    int totalHeight;
    int idealWeight;
    
    System.out.println("Are you male or female? (m/f)");
    gender = scan.next();
    
    if (gender.equals("m") || gender.equals("f")) {
          System.out.println("How many feet tall are you?");
          feet = scan.nextInt();
    
          System.out.println("How many inches past " + feet +
                       " feet are you?");
          inches = scan.nextInt();
    
          totalHeight = (feet * 12) + inches;
    
          if (gender.equals("m")) {
            idealWeight = maleInit + ((totalHeight - (12 * 5)) * 6);
            
            System.out.println("Your ideal weight is " +  idealWeight +
                               " pounds.");
            System.out.println("A healthy range from this weight is " +
                               (idealWeight - (idealWeight * 0.15f)) +
                               " to " + (idealWeight + (idealWeight * 0.15f)) +
                               " pounds.");
          }
          
          else if (gender.equals("f")) {
            idealWeight = femaleInit + ((totalHeight - (12 * 5)) * 6);
            
            System.out.println("Your ideal weight is " +  idealWeight +
                               " pounds.");
            System.out.println("A healthy range from this weight is " +
                               (idealWeight - (idealWeight * 0.15f)) +
                               " to " + (idealWeight + (idealWeight * 0.15f)) +
                               " pounds.");
          }
    } else {
      System.out.println("That's not a valid input! Please re-run the program.");
    }
  }
}