import info.gridworld.actor.Bug;

public class SpiralBug extends ShapeBug {
  private int steps;
  private int sideLength;
  
  /**
   * Constructs a spiral bug that traces a spiral until it is impossible to grow larger
   * @param length the side length
   */
  public SpiralBug(int length) {
    super(length);
  }
  
  /**
   * Moves to the next location of the circle.
   */
  public void act() {
    if (steps < sideLength && canMove()) {
      move();
      steps++;
    } else {
      turn();
      turn();
      steps = 0;
      sideLength++;
    }
  }
}