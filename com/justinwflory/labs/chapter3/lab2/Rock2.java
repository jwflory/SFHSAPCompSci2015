// ****************************************************************
//   Rock2.java
//
//   Play Rock, Paper, Scissors a certain number of times
//          
// ****************************************************************
import java.util.Scanner;

public class Rock2 {
  public static void main(String[] args) {
    String personPlay;
    String computerPlay;
    int computerInt;
    int totalGames;
    int cpuWins = 0;
    int playerWins = 0;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("How many games do you want to play?");
    totalGames = scan.nextInt();
    while (totalGames % 2 == 0) {
      System.out.println("You entered an even number! How is that even going to work? Choose an odd number.");
      totalGames = scan.nextInt();
    }
    
    while (totalGames != 0) {
      // Have the player choose their play
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
      
      // Translate computer's randomly generated play to string
      // using mutually exclusive conditional statements
      if (computerInt == 0) {
        computerPlay = "R";
      } else if (computerInt == 1) {
        computerPlay = "P";
      } else {
        computerPlay = "S";
      }
      
      // Print computer's play
      System.out.println("The computer plays " + computerPlay + "!");
      
      // See who won
      if (personPlay.equals(computerPlay)) {
        System.out.println("It's a tie!");
      } else if (personPlay.equals("R")) {
        if (computerPlay.equals("S")) {
          System.out.println("Rock crushes scissors. You win!");
          playerWins++;
        } else {
          System.out.println("Paper covers rock. You lose!");
          cpuWins++;
        }
      } else if (personPlay.equals("P")) {
        if (computerPlay.equals("R")) {
          System.out.println("Paper covers rock. You win!");
          playerWins++;
        } else {
          System.out.println("Scissors cut paper. You lose!");
          cpuWins++;
        }
      } else {
        if (computerPlay.equals("R")) {
          System.out.println("Rock crushes scissors. You lose!");
          cpuWins++;
        } else {
          System.out.println("Scissors cut paper. You win!");
          playerWins++;
        }
      }
      totalGames--;
    }
    // Broadcast who won.
    System.out.println("The winner is...");
    
    if (playerWins > cpuWins) {
      System.out.println("You!");
    } else {
      System.out.println("The computer.");
    }
    
  }
}