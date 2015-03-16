import info.gridworld.actor.Bug;

public class CustomBug extends Bug {
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
    } else if ((rotateCount == 4 || rotateCount == 6) && canMove() && steps < doubleSideLength && canMove()) {
      move();
      steps++;
    } else if ((rotateCount == 0 || rotateCount == 2) && canMove()) {
      diagonalTurn();
    } else if (canMove() && (rotateCount == 1 || rotateCount == 3 || rotateCount == 5 || rotateCount == 7 || rotateCount)) {
      directTurn();
    } else {
      rotateCount = 0;
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