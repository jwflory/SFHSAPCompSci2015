import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.*;

public class SpiralBug extends ShapeBug {
  /**
   * Constructs a spiral bug that traces a spiral until it is impossible to grow larger
   * @param length the side length
   */
  public SpiralBug(int length) {
    super(length);
  }
  
  /**
   * Method for determining whether the spiral has reached the end of its side, thereby determining
   * whether or not it has to turn its direction.
   */
  public void endOfSide() {
    turn();
    turn();
    setSideLength(getSideLength() + 1);
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