import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.*;

public class CircleBug extends ShapeBug {
  /**
   * Constructs a circle bug that traces a circle for an infinite amount of time
   * @param length the side length
   */
  public CircleBug(int length) {
    super(length);
  }
  
  /**
   * Method for determining whether the cirlce has reached the end of its side, thereby determining
   * whether or not it has to turn.
   */
  public void endOfSide() {
    turn();
  }
}