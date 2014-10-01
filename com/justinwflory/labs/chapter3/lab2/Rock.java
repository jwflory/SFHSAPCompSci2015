// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;

public class Rock {
  public static void main(String[] args) {
    String personPlay;    //User's play -- "R", "P", or "S"
    String computerPlay;  //Computer's play -- "R", "P", or "S"
    int computerInt;      //Randomly generated number used to determine
    //computer's play
    
    Scanner scan = new Scanner(System.in);
    
    // add the code for each action below the comment
    // more than one line may be needed in some cases
    
    // Get player's play -- note that this is stored as a string
    System.out.println("Enter your play: R, P, or S:");
    personPlay = scan.next();
    if (personPlay.equals("r") || personPlay.equals("p") || personPlay.equals("s")) {
      if (personPlay.equals("r")) {
        personPlay = "R";
      } else if (personPlay.equals("p")) {
        personPlay = "P";
      } else {
        personPlay = "S";
      }
    }
    
    // Make player's play uppercase for ease of comparison
    while (!personPlay.equals("R") && !personPlay.equals("P") && !personPlay.equals("S")) {
      System.out.println("You entered an invalid character!");
      System.out.println("Please enter a valid play: R, P, or S:");
      personPlay = scan.next();
      if (personPlay.equals("r") || personPlay.equals("p") || personPlay.equals("s")) {
        if (personPlay.equals("r")) {
          personPlay = "R";
        } else if (personPlay.equals("p")) {
          personPlay = "P";
        } else {
          personPlay = "S";
        }
      }
    }
    
    // Generate computer's play (0,1,2) - use Math.random()
    computerInt = (int) (Math.random() * 3); 
    
    //Translate computer's randomly generated play to string
    // using mutually exclusive conditional statements
    if (computerInt == 0) {
      computerPlay = "R";
    } else if (computerInt == 1) {
      computerPlay = "P";
    } else {
      computerPlay = "S";
    }
    
    //Print computer's play
    System.out.println("The computer plays " + computerPlay + "!");
    
    //See who won.  Use nested ifs instead of &&.
    if (personPlay.equals(computerPlay)) {
      System.out.println("It's a tie!");
    } else if (personPlay.equals("R")) {
      if (computerPlay.equals("S")) {
        System.out.println("Rock crushes scissors. You win!");
      } else {
        System.out.println("Paper covers rock. You lose!");
      }
    } else if (personPlay.equals("P")) {
      if (computerPlay.equals("R")) {
        System.out.println("Paper covers rock. You win!");
      } else {
        System.out.println("Scissors cut paper. You lose!");
      }
    } else {
      if (computerPlay.equals("R")) {
        System.out.println("Rock crushes scissors. You lose!");
      } else {
        System.out.println("Scissors cut paper. You win!");
      }
    }
  }
}