import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;
import java.awt.Color;
import java.util.Scanner;

public class DrawLettersWithBugs {
  
  private static int ROWS = 40;
  private static int COLS = 100;
  private static final boolean DEBUG = false;
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    BoundedGrid<Actor> myGrid = new BoundedGrid<Actor>(ROWS, COLS);
    ActorWorld world = new ActorWorld(myGrid);
    int totalColumns = 0;
    int startRow = 0;
    char currentChar;
    
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
      if (totalColumns >= COLS - 4) {
        startRow += 12;
        totalColumns = 0;
      }
      totalColumns += drawLetter(world, startRow, totalColumns, magicWord.charAt(i));
      totalColumns++; 
    
      if (DEBUG) System.out.println(totalColumns);
    }
    
    world.show();
  }
  
  public static int drawLetter(ActorWorld myWorld, int startRow, int startCol, char letter) {
    Color lastColor = Color.GRAY;
    Color curColor = Color.MAGENTA;
    int randomColorIndex = 0;
    
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
    
    int[][] letterEmpty =
    { { 0, 0, 0 },
      { 0, 0, 0 },
      { 0, 0, 0 },
      { 0, 0, 0 },
      { 0, 0, 0 },
      { 0, 0, 0 },
      { 0, 0, 0 },
      { 0, 0, 0 },
      { 0, 0, 0 },
      { 0, 0, 0 }  };
    
    int[][] myLetter;
    
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
      default:  myLetter = letterEmpty;
      break;
    }
    
    Color[] allColors = {
      Color.BLACK,
      Color.BLUE,
      Color.CYAN,
      Color.DARK_GRAY,
      Color.GRAY,
      Color.GREEN,
      Color.LIGHT_GRAY,
      Color.MAGENTA,
      Color.ORANGE,
      Color.PINK,
      Color.RED,
      Color.WHITE,
      Color.YELLOW
    };
    
    for (int i=0; i<myLetter.length; i++) {
      for (int j=0; j<myLetter[i].length; j++) {
        if (myLetter[i][j] == 1) {
          while (curColor == lastColor) {
            randomColorIndex = ((int) (Math.random() * allColors.length));
            curColor = allColors[randomColorIndex];
            if (DEBUG) System.out.println("curColor = " + curColor + "; lastColor = " + lastColor);
          }
          Bug bug = new Bug(curColor);
          bug.setDirection((int)(Math.random() * 8) * 45);
          myWorld.add(new Location(startRow + i, startCol + j), bug);
          lastColor = curColor;
          if (DEBUG) System.out.println("You made it to the end of the loop.");
        }
      }
    }
    
    return myLetter[0].length;
  }
}