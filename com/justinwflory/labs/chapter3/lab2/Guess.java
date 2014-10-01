// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 100
//          
// ****************************************************************
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
      int numToGuess;       // Number the user tries to guess
      int guess;            // The user's guess
      int guessesTaken = 0; // The user's total number of guesses
      int snapshotGuess;  // Temporary integer used to remember the guess taken before changing it

      Scanner scan = new Scanner(System.in);
 
      // add code below each comment to carry out the action listed in the comment
      // more than one statement may be needed in some cases

      //randomly generate the  number to guess - use Math.random()
      numToGuess = (int) ((Math.random() * 100) + 1);

      //print message asking user to enter a guess
      System.out.println("What number am I thinking of between 1 and 100?");

      //read in guess
      guess = scan.nextInt();
      guessesTaken++;
                
      while (numToGuess != guess) {
        while (guess < 0 || guess > 100) {
          System.out.println("What? That's not even a valid answer!");
          System.out.println("Give me a valid guess...");
          guess = scan.nextInt();
          guessesTaken++;
        }

        System.out.println("Nope, that's not it. Try again.");
        snapshotGuess = guess;
        
        if (guess > numToGuess) {
          System.out.println("Your guess was a bit high.");
          System.out.println("Guess again.");
          guess = scan.nextInt();
          guessesTaken++;
          while (guess > snapshotGuess) {
            System.out.println("You were too high! Why are you going higher? Try again.");
            guess = scan.nextInt();
            guessesTaken++;
          }
        } else {
          System.out.println("Your guess was a bit low.");
          System.out.println("Guess again.");
          guess = scan.nextInt();
          guessesTaken++;
          while (snapshotGuess > guess) {
            System.out.println("You were too low, and you're going lower...? Try again.");
            guess = scan.nextInt();
            guessesTaken++;
          }
        }
      }

      //print message saying guess is right
      System.out.println("You're good.");
      System.out.println("It only took you " + guessesTaken + " times!");
    }
}
