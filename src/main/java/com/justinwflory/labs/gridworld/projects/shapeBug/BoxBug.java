import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.*;

public class BoxBug extends ShapeBug {
  /**
   * Constructs a box bug that traces a box for an infinite amount of time
   * @param length the side length
   */
  public BoxBug(int length) {
    super(length);
  }
  
  /**
   * Method for determining whether the box has reached the end of its side, thereby determining
   * whether or not it has to change direction.
   */
  public void endOfSide() {
    setDirection(getDirection() + 90);
  }
}