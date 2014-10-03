// ****************************************************************
//   Rock3.java
//
//   Play Rock, Paper, Scissors, Lizard, Spock
//          
// ****************************************************************
import java.util.Scanner;

public class Rock3 {
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
      System.out.println("Enter your play: R, P, SC, L, or SP:");
      personPlay = scan.next();
      
      // Make player's play uppercase for ease of comparison
      if (personPlay.equals("r") || personPlay.equals("p") || personPlay.equals("sc") || personPlay.equals("l") || personPlay.equals("sp")) {
        if (personPlay.equals("r")) {
          personPlay = "R";
        } else if (personPlay.equals("p")) {
          personPlay = "P";
        } else if (personPlay.equals("sc")) {
          personPlay = "SC";
        } else if (personPlay.equals("l")) {
          personPlay = "L";
        } else {
          personPlay = "SP";
        }
      }
      
      while (!personPlay.equals("R") && !personPlay.equals("P") && !personPlay.equals("SC") && !personPlay.equals("L") && !personPlay.equals("SP")) {
        System.out.println("You entered an invalid character!");
        System.out.println("Please enter a valid play: R, P, SC, L, or SP:");
        personPlay = scan.next();
        if (personPlay.equals("r") || personPlay.equals("p") || personPlay.equals("sc") || personPlay.equals("l") || personPlay.equals("sp")) {
          if (personPlay.equals("r")) {
            personPlay = "R";
          } else if (personPlay.equals("p")) {
            personPlay = "P";
          } else if (personPlay.equals("sc")) {
            personPlay = "SC";
          } else if (personPlay.equals("l")) {
            personPlay = "L";
          } else {
            personPlay = "SP";
          }
        }
      }
      
      // Generate computer's play (0,1,2,3,4) - use Math.random()
      computerInt = (int) (Math.random() * 5); 
      
      // Translate computer's randomly generated play to string
      // using mutually exclusive conditional statements
      if (computerInt == 0) {
        computerPlay = "R";
      } else if (computerInt == 1) {
        computerPlay = "P";
      } else if (computerInt == 2) {
        computerPlay = "SC";
      } else if (computerInt == 3) {
        computerPlay = "L";
      } else {
        computerPlay = "SP";
      }
      
      // Print computer's play
      System.out.println("The computer plays " + computerPlay + "!");
      
      // See who won
      if (personPlay.equals(computerPlay)) {
        System.out.println("It's a tie! Try again.");
      } else if (personPlay.equals("R")) {
        if (computerPlay.equals("P")) {
          System.out.println("Paper covers rock. You lose!");
          cpuWins++;
          totalGames--;
        } else if (computerPlay.equals("SC")) {
          System.out.println("Rock crushes scissors. You win!");
          playerWins++;
          totalGames--;
        } else if (computerPlay.equals("L")) {
          System.out.println("Rock crushes lizard. You win!");
          playerWins++;
          totalGames--;
        } else {
          System.out.println("Spock vaporizes rock. You lose!");
          cpuWins++;
          totalGames--;
        }
      } else if (personPlay.equals("P")) {
        if (computerPlay.equals("R")) {
          System.out.println("Paper covers rock. You win!");
          playerWins++;
          totalGames--;
        } else if (computerPlay.equals("SC")) {
          System.out.println("Scissors cut paper. You lose!");
          cpuWins++;
          totalGames--;
        } else if (computerPlay.equals("L")) {
          System.out.println("Lizard eats paper. You lose!");
          cpuWins++;
          totalGames--;
        } else {
          System.out.println("Paper disproves Spock. You win!");
          playerWins++;
          totalGames--;
        }
      } else if (personPlay.equals("SC")) {
        if (computerPlay.equals("R")) {
          System.out.println("Rock crushes scissors. You lose!");
          cpuWins++;
          totalGames--;
        } else if (computerPlay.equals("P")) {
          System.out.println("Scissors cut paper. You win!");
          playerWins++;
          totalGames--;
        } else if (computerPlay.equals("L")) {
          System.out.println("Scissors decapitates lizard. You win!");
          playerWins++;
          totalGames--;
        } else {
          System.out.println("Spock smashes scissors. You lose!");
          cpuWins++;
          totalGames--;
        }
      } else if (personPlay.equals("L")) {
        if (computerPlay.equals("R")) {
          System.out.println("Rock crushes lizard. You lose!");
          cpuWins++;
          totalGames--;
        } else if (computerPlay.equals("P")) {
          System.out.println("Lizard eats paper. You win!");
          playerWins++;
          totalGames--;
        } else if (computerPlay.equals("SC")) {
          System.out.println("Scissors decapitates lizard. You lose!");
          cpuWins++;
          totalGames--;
        } else {
          System.out.println("Lizard poisons Spock. You win!");
          playerWins++;
          totalGames--;
        } 
      } else {
        if (computerPlay.equals("R")) {
          System.out.println("Spock vaporizes rock. You win!");
          playerWins++;
          totalGames--;
        } else if (computerPlay.equals("P")) {
          System.out.println("Paper disproves Spock. You lose!");
          cpuWins++;
          totalGames--;
        } else if (computerPlay.equals("SC")) {
          System.out.println("Spock smashes scissors. You win!");
          playerWins++;
          totalGames--;
        } else {
          System.out.println("Lizard poisons Spock. You lose!");
          cpuWins++;
          totalGames--;
        }
      }
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