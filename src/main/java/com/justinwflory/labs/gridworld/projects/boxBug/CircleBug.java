import info.gridworld.actor.Bug;

public class CircleBug extends Bug {
  private int steps;
  private int radiusLength;
  
  /**
   * Constructs a circle bug that traces a circle of a given radius <br />
   * Even though we call it a circle, there is no possible way to
   * draw a perfect circle in a grid-oriented world. A perfect circle
   * cannot exist. <br />
   * @param length the radius length
   */
  public CircleBug(int length) {
    steps = 0;
    radiusLength = length;
  }
  
  /**
   * Moves to the next location of the "circle"
   */
  public void act() {
    if (steps < radiusLength && canMove()) {
      move();
      steps++;
    } else {
      turn();
      steps = 0;
    }
  }
}