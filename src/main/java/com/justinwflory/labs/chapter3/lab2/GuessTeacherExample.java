// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class GuessTeacherExample
{
    public static void main(String[] args)
    {
      int numToGuess;       //Number the user tries to guess
      int guess;            //The user's guess
      int lastGuess;
      int numGuesses;
      int numTooLow = 0;
      int numTooHigh = 0;
      boolean tooHigh = false, tooLow = false;

      //randomly generate the  number to guess
      numToGuess = (int)(Math.random()*100) + 1;

      //print message asking user to enter a guess
      System.out.println("Let's play a game . . .");
      System.out.println("I have picked a number between 1 and 100 and you have to try and guess it.");
      
      //read in guess
      guess = getGuess();
                
      while ( guess != numToGuess )  //keep going as long as the guess is wrong
        {
            //print message saying guess is wrong
            // your code goes here
            System.out.println("I'm sorry, but that guess is incorrect.");
            // inside joke from H2G2
            System.out.println("Please sit still, while I administer a punshiment using the shock plate in the seat of your chair.\n");

            // Step #2 - give them a hint
            if (guess < numToGuess)
            {
               System.out.println("Your guess was too low.");
               numTooLow++;
               tooHigh = false;
               tooLow = true;
            }
            else // must have been too high
            {
              System.out.println("Your guess was too high.");
              numTooHigh++;
              tooHigh = true;
              tooLow = false;
            }
            
            //get another guess from the user
            lastGuess = guess;
            guess = getGuess();
            
            // make sure that the user went the right direction
            // Note: decided to do all the condition checking in the fixGuess method, since the code demonstrated in class
            // was doing the same thing in both places, which means it was also necessary to pass the guess as a parameter
            guess = fixGuess(tooLow, tooHigh, guess, lastGuess);
        }

        //print message saying guess is right
        // your code goes below here
        System.out.println("Congratulations, you correctly guessed " + guess + " in only " + (numTooLow + numTooHigh + 1) + " guesses.");
        System.out.println(numTooLow + " guesses were too low; " + numTooHigh + " guesses were too high");
        // inside joke from H2G2
        System.out.println("The punishments will now end.");

    }
    
    public static int getGuess()
    {
      Scanner scan = new Scanner(System.in);
      int guess;
      
      System.out.print("Please enter a guess between 1 and 100:");
      guess = scan.nextInt();
      while (guess < 1 || guess > 100)
      {
        System.out.println("That is not between 1 and 100.  Try again.");
        System.out.print("Please enter a guess between 1 and 100:");
        guess = scan.nextInt();
      }
      return guess;
    }
    
    public static int fixGuess(boolean tooLow, boolean tooHigh, int guess, int lastGuess)
    {
      // this time, there is no prompt before the while loop; if the user's next guess is in the correct direction
      // then the condition of the loop will fail, and the user will never get a prompt
      // this reduces our ability to be extra snarky if they guess in the wrong direction more than once, but we
      // are trapping the user in an infinite loop if they continute to disobey which is probably snarky enough
      while ((tooLow && (guess <= lastGuess)) ||
             (tooHigh && (guess >= lastGuess)) )
      {
        if (tooLow && (guess <= lastGuess))
        {
          System.out.println("Your last guess, " + lastGuess + ", was too low.  Please guess a higher number.");
        }
        else // must have been the other condition
        {
          System.out.println("Your last guess, " + lastGuess + ", was too high.  Please guess a lower number.");
        }
        guess = getGuess();
      }
      return guess;
    }
}
