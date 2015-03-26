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
  
  /**
   * Right now, this method is fighting the act() method of the abstract class that it extends. Because in line 25:
   * 
   * if (canMove() && steps < sideLength && keepMoving()) {
   * 
   * We are moving the bug the given number of times when the steps are less than the sidelength. I don't know how to
   * override this action. I know there is the @Override annotation, but that would have to be done for an act() method
   * inside of this class, but that would require me to write an entirely new method and thus defeat the purpose of
   * abstraction altogether.
   * 
   * How can I override that conditional without upsetting all of my other bugs, rewriting it from scratch in this
   * class, and/or abandoning the idea of abstraction?
   */
  public void endOfSide() {
    if (getRotateCount() == 4 && getSteps() < halfSideLength) {
      setDirection(270);
      if (DEBUG) System.out.println("when getRotateCount() == 4, setDirection(270) (3rd cond): " + getRotateCount());
    } else if (getRotateCount() < 3 || getRotateCount() == 6) {
      directTurn();
      if (DEBUG) System.out.println("directTurn() (1st cond): " + getRotateCount());
    } else if (getRotateCount() == 3 || getRotateCount() == 5) {
      if (getRotateCount() == 3) this.setDirection(0);
      diagonalTurn();
      if (DEBUG) System.out.println("diagonalTurn() (2nd cond): " + getRotateCount());
    }
    if (getRotateCount() > 5) setRotateCount(0);
    if (DEBUG) System.out.println("End of method: " + getRotateCount());
  }
    
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