// ****************************************************************
//   GuessMethod.java
//
//   Play a game where the user guesses a number from 1 to 100
//   and use methods to check the validity of guesses
//
//   This is an example of encapsulation!
//          
// ****************************************************************
import java.util.Scanner;

public class GuessMethod {
  public static void main(String[] args) {
    int numToGuess;       // Number the user tries to guess
    int guess;            // The user's guess
    int guessesTaken = 0; // The user's total number of guesses
    int snapshotGuess;  // Temporary integer used to remember the guess taken before changing it
    int numLowGuesses = 0;
    int numHighGuesses = 0;
    boolean tooLow = false;
    boolean tooHigh = false;
    
    Scanner scan = new Scanner(System.in);
    
    // Give a debug warning to the user running this code :)
    System.out.println("WARNING! This code is not functional... yet.");
    
    // Randomly generate the  number to guess
    numToGuess = (int) ((Math.random() * 100) + 1);
    
    // Get a guess from the user
    guess = readGuess();
    
    // Check to see if they went the right direction
    //if (outOfRange || guess == snapshotGuess)
    
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
    
    //print message saying guess is right
    System.out.println("You're good.");
    System.out.println("It only took you " + guessesTaken + " times!");
  }
  /*
  public static int readGuess() {
    int numToGuess;
    int guess;
    int guessesTaken = 0;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("What number am I thinking of between 1 and 100?");
    guess = scan.nextInt();
    guessesTaken++;
    
    while (numToGuess != guess) {
      while (guess < 1 || guess > 100) {
        System.out.println("What? That's not even a valid answer!");
        System.out.println("Give me a valid guess...");
        guess = scan.nextInt();
        guessesTaken++;
      }
    }
    return guess;
  }
  
  public static int checkGuess (boolean tooLow, boolean tooHigh, int guess) {
    int guess;
    
    Scanner scan = new Scanner(System.in);
    
    if (tooLow) {
      System.out.println("Please guess higher than " + guess + ".");
    }
    if (tooHigh) {
      System.out.println("Please guess lower than " + guess + ".");
    }
    
    while ((tooLow && guess <= snapshotGuess) || (tooHigh && guess >= snapshotGuess)) {
      //TODO
      System.out.println("TODO");
    }
  }*/
  
}
