import info.gridworld.actor.Bug;

public class CustomBug extends Bug {
  private static final boolean DEBUG = false;
  private static final int LONG_SIDES = 2;
  private static final int SHORT_SIDES = 4;
  
  private int doubleSideLength;
  private int rotateCount;
  private int sideLength;
  private int steps;
  
  /**
   * Constructs a custom bug that resembles a house
   * @param length the long side length
   */
  public CustomBug(int length) {
    this.setDirection(0);
    steps = 0;
    rotateCount = 0;
    sideLength = length;
    doubleSideLength = length * 2;
  }
  
  /**
   * Moves to the next location of the shape
   */
  public void act() {
    if (steps < sideLength && canMove()) {
      move();
      steps++;
      if (DEBUG) System.out.println(rotateCount);
    } else if ((rotateCount == 4 || rotateCount == 6 || rotateCount == 8) && canMove() && steps < doubleSideLength && canMove()) {
      move();
      steps++;
      if (DEBUG) System.out.println(rotateCount);
    } else if ((rotateCount == 0 || rotateCount == 2) && canMove()) {
      diagonalTurn();
      if (DEBUG) System.out.println("diagonalTurn() " + rotateCount);
    } else if (canMove() && (rotateCount == 1 || rotateCount == 3 || rotateCount == 4 || rotateCount == 5 || rotateCount == 6 || rotateCount == 7 || rotateCount == 8)) {
      directTurn();
      if (DEBUG) System.out.println("directTurn() " + rotateCount);
    } else if (!canMove()) {
      turn();
    } else {
      if (DEBUG) System.out.println("About to reset: " + rotateCount);
      this.setDirection(0);
      rotateCount = 0;
      if (DEBUG) System.out.println("Now reset: " + rotateCount);
    }
  }
  
  public void directTurn() {
    turn();
    turn();
    steps = 0;
    rotateCount++;
  }
  
  public void diagonalTurn() {
    turn();
    steps = 0;
    rotateCount++;
  }
}