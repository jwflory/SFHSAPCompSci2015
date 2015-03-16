import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.*;

public class ZBugInherited extends ShapeBug {
  private static final int DEFAULT_SIDE_LENGTH = 6;
  
  /**
   * Constructs a Z-bug that forms a "Z" of a side length of 6
   * @param length the side length
   */
  public ZBugInherited() {
    super(DEFAULT_SIDE_LENGTH);
    this.setDirection(90);
  }
  
  /**
   * Constructs a Z-bug that forms a "Z" of a given side length
   * @param length the side length
   */
  public ZBugInherited(int length) {
    super(length);
    this.setDirection(90);
  }
  
  /**
   * Moves to the next location of the Z.
   */
  public void act() {
    /*
    if (getSteps() < getSideLength() && nextMove()) {
      move();
      steps++;
    } else if (nextMove() && rotateCount == 0) {
      this.setDirection(225);
      steps = 0;
      rotateCount++;
    } else if (nextMove() && rotateCount == 1) {
      this.setDirection(90);
      steps = 0;
      rotateCount++;
    }
    */
  }
  
  /**
   * Checks to see if the next location is a valid move.
   * @return <code>true</code> if the next location is empty,
   * <code>false</code> if occupied by another Actor
   */
  public boolean nextMove() {
    Grid<Actor> curGrid = getGrid();
    if (curGrid == null) return false;
    Location loc = getLocation();
    Location next = loc.getAdjacentLocation(getDirection());
    if (!curGrid.isValid(next)) return false;
    Actor neighbor = curGrid.get(next);
    return (neighbor == null);
  }
}
