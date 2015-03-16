import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;
import java.awt.Color;
import java.util.Scanner;

public class DrawLettersWithBugs {
  
  private static final boolean DEBUG = true;
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BoundedGrid<Actor> myGrid = new BoundedGrid<Actor>(25, 25);
    ActorWorld world = new ActorWorld(myGrid);
    int totalColumns = 0;
    char currentChar;
    
    //world.add(new Bug());
    //world.add(new Location(2, 3), new Bug(Color.GREEN));
    //world.add(new Location(7, 8), new Rock(Color.BLUE));
    
    System.out.println("Please enter a word you would like converted to dot matrix. A-Z only.");
    String magicWord = scan.next();
    
    boolean invalidInput = magicWord.matches(".*[^a-zA-Z]+.*");
    while (invalidInput) {
      System.out.println("You entered an invalid character. Try again.");
      magicWord = scan.next();
      invalidInput = magicWord.matches(".*[^a-zA-Z]+.*");
    }
    
    boolean goToLowerCase = magicWord.matches(".*[A-Z]+.*");
    if (goToLowerCase) {
      magicWord = magicWord.toLowerCase();
    }
    
    if (DEBUG) System.out.println("magicWord = " + magicWord);
    
    for (int i=0; i<magicWord.length(); i++) {
      currentChar = magicWord.charAt(i);
      totalColumns += drawLetter(world, 0, 0, currentChar);
      if (DEBUG) System.out.println(totalColumns);
    }
    
    world.show();
  }
  
  public static int drawLetter(ActorWorld myWorld, int startRow, int startCol, char letter) {
    int[][] letterA =
    { { 0, 1, 0 },
      { 0, 1, 0 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 1, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 }  };
    
    int[][] letterB =
    { { 1, 1, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 1, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 1, 1 }  };
    
    int[][] letterC =
    { { 1, 1, 1 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 1, 1 }  };
    
    int[][] letterD =
    { { 1, 1, 0 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 1, 0 }  };
    
    int[][] letterE =
    { { 1, 1, 1 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 1, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 1, 1 }  };
    
    int[][] letterF =
    { { 1, 1, 1 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 1, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 }  };
    
    int[][] letterG =
    { { 0, 1, 1 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 0, 1, 0 }  };
    
    int[][] letterH =
    { { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 1, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 }  };
    
    int[][] letterI =
    { { 1, 1, 1 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 1, 1, 1 }  };
    
    int[][] letterJ =
    { { 0, 0, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 1, 1 }  };
    
    int[][] letterK =
    { { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 0 },
      { 1, 1, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 }  };
    
    int[][] letterL =
    { { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 1, 1 }  };
    
    int[][] letterM =
    { { 1, 0, 0, 0, 1 },
      { 1, 1, 0, 1, 1 },
      { 1, 0, 1, 0, 1 },
      { 1, 0, 1, 0, 1 },
      { 1, 0, 0, 0, 1 },
      { 1, 0, 0, 0, 1 },
      { 1, 0, 0, 0, 1 },
      { 1, 0, 0, 0, 1 },
      { 1, 0, 0, 0, 1 },
      { 1, 0, 0, 0, 1 }  };
    
    int[][] letterN =
    { { 1, 1, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 }  };
    
    int[][] letterO =
    { { 1, 1, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 1, 1 }  };
    
    int[][] letterP =
    { { 1, 1, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 1, 1 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 }  };
    
    int[][] letterQ =
    { { 1, 1, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 1, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 }  };
    
    int[][] letterR =
    { { 1, 1, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 1, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 }  };
    
    int[][] letterS =
    { { 1, 1, 1 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 1, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 },
      { 1, 1, 1 }  };
    
    int[][] letterT =
    { { 1, 1, 1 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 }  };
    
    int[][] letterU =
    { { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 1, 1 }  };
    
    int[][] letterV =
    { { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 0, 1, 0 },
      { 0, 1, 0 }  };
    
    int[][] letterW =
    { { 1, 0, 0, 0, 1 },
      { 1, 0, 0, 0, 1 },
      { 1, 0, 0, 0, 1 },
      { 1, 0, 0, 0, 1 },
      { 1, 0, 0, 0, 1 },
      { 1, 0, 0, 0, 1 },
      { 1, 0, 0, 0, 1 },
      { 1, 0, 1, 0, 1 },
      { 1, 0, 1, 0, 1 },
      { 1, 1, 0, 1, 1 }  };
    
    int[][] letterX =
    { { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 }  };
    
    int[][] letterY =
    { { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 1, 0, 1 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 }  };
    
    int[][] letterZ =
    { { 1, 1, 1 },
      { 0, 0, 1 },
      { 0, 0, 1 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 0, 1, 0 },
      { 1, 0, 0 },
      { 1, 0, 0 },
      { 1, 1, 1 }  };
    
    int[][] letterNull =
    { { 1, 1, 1 },
      { 1, 1, 1 },
      { 1, 1, 1 },
      { 1, 1, 1 },
      { 1, 1, 1 },
      { 1, 1, 1 },
      { 1, 1, 1 },
      { 1, 1, 1 },
      { 1, 1, 1 },
      { 1, 1, 1 }  };
    
    int[][] myLetter;
    int direction = ((int)(Math.random() * 9));
    
    switch(letter) {
      case 'a': myLetter = letterA;
      break;
      case 'b': myLetter = letterB;
      break;
      case 'c': myLetter = letterC;
      break;
      case 'd': myLetter = letterD;
      break;
      case 'e': myLetter = letterE;
      break;
      case 'f': myLetter = letterF;
      break;
      case 'g': myLetter = letterG;
      break;
      case 'h': myLetter = letterH;
      break;
      case 'i': myLetter = letterI;
      break;
      case 'j': myLetter = letterJ;
      break;
      case 'k': myLetter = letterK;
      break;
      case 'l': myLetter = letterL;
      break;
      case 'm': myLetter = letterM;
      break;
      case 'n': myLetter = letterN;
      break;
      case 'o': myLetter = letterO;
      break;
      case 'p': myLetter = letterP;
      break;
      case 'q': myLetter = letterQ;
      break;
      case 'r': myLetter = letterR;
      break;
      case 's': myLetter = letterS;
      break;
      case 't': myLetter = letterT;
      break;
      case 'u': myLetter = letterU;
      break;
      case 'v': myLetter = letterV;
      break;
      case 'w': myLetter = letterW;
      break;
      case 'x': myLetter = letterX;
      break;
      case 'y': myLetter = letterY;
      break;
      case 'z': myLetter = letterZ;
      break;
      default:  myLetter = letterNull;
      break;
    }
    
    for (startRow = startRow; startRow<myLetter.length; startRow++) {
      for (startCol = startCol; startCol<myLetter[startRow].length; startCol++) {
        if (myLetter[startRow][startCol] == 1) {
          myWorld.add(new Location(startRow, startCol), new Bug());
          // Random colors...? http://docs.oracle.com/javase/8/docs/api/java/awt/Color.html
        }
      }
    }
    
    return myLetter[0].length;
  }
}