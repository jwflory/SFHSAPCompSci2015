import info.gridworld.actor.Bug;

public class CustomBug extends ShapeBug {
  private static final boolean DEBUG = true;
  private static final int LONG_SIDES = 2;
  private static final int SHORT_SIDES = 4;
  
  private int halfSideLength;
  private int tempRotate;
  private int tempSteps;
  
  /**
   * Constructs a custom bug that resembles a house
   * @param length the long side length
   */
  public CustomBug(int length) {
    super(length);
    this.setDirection(180);
    halfSideLength = getSideLength() / 2;
  }
  
  public void endOfSide() {
    if (getRotateCount() < 3 || getRotateCount() == 5) {
      directTurn();
      if (DEBUG) System.out.println(getRotateCount());
    } else if (getRotateCount() == 3 || getRotateCount() == 4) {
      if (getRotateCount() == 3) this.setDirection(0);
      diagonalTurn();
      if (getSteps() >= halfSideLength) {
        if (getRotateCount() == 3) diagonalTurn();
        else this.setDirection(90);
      }
      if (getRotateCount() > 5) setRotateCount(0);
    }
    if (DEBUG) System.out.println(getRotateCount());
    
    /*
     if ((getRotateCount() == 4 || getRotateCount() == 6 || getRotateCount() == 8) && canMove() && getSteps() < doubleSideLength && canMove()) {
     move();
     setSteps(getSteps() + 1);
     if (DEBUG) System.out.println(getRotateCount());
     } else if ((getRotateCount() == 0 || getRotateCount() == 2) && canMove()) {
     diagonalTurn();
     if (DEBUG) System.out.println("diagonalTurn() " + getRotateCount());
     } else if (canMove() && (getRotateCount() == 1 || getRotateCount() == 3 || getRotateCount() == 4 || getRotateCount() == 5 || getRotateCount() == 6 || getRotateCount() == 7 || getRotateCount() == 8)) {
     directTurn();
     if (DEBUG) System.out.println("directTurn() " + getRotateCount());
     } else if (!canMove()) {
     turn();
     } else {
     if (DEBUG) System.out.println("About to reset: " + getRotateCount());
     this.setDirection(0);
     setRotateCount(0);
     if (DEBUG) System.out.println("Now reset: " + getRotateCount());
     }
     */
  }
  
  public void directTurn() {
    setDirection(getDirection() + 90);
    //setSteps(0);
    //setRotateCount(getRotateCount() + 1);
  }
  
  public void diagonalTurn() {
    setDirection(getDirection() - 45);
    //setSteps(0);
    //setRotateCount(getRotateCount() + 1);
  }
}