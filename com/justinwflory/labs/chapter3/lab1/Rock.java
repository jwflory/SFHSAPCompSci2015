// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;

public class Rock
{
    public static void main(String[] args)
    {
      String personPlay;    //User's play -- "R", "P", or "S"
      String computerPlay;  //Computer's play -- "R", "P", or "S"
      int computerInt;      //Randomly generated number used to determine
                            //computer's play

      Scanner scan = new Scanner(System.in);
 
      // add the code for each action below the comment
      // more than one line may be needed in some cases
      
      //Get player's play -- note that this is stored as a string
      
      //Make player's play uppercase for ease of comparison
      
      //Generate computer's play (0,1,2) - use Math.random()
      
      //Translate computer's randomly generated play to string
      // using mutually exclusive conditional statements

      //Print computer's play
      
      //See who won.  Use nested ifs instead of &&.
      if (personPlay.equals(computerPlay))  
        System.out.println("It's a tie!");
      else if (personPlay.equals("R"))
        if (computerPlay.equals("S"))
        System.out.println("Rock crushes scissors.  You win!!");
      else
        //...  Fill in rest of code
    }
}