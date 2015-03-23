import info.gridworld.actor.Bug;

public abstract class ShapeBug extends Bug {
  private int rotateCount;
  private int sideLength;
  private int steps;
  
  /**
   * Constructs a generic shape bug.
   * @param length the side length
   */
  public ShapeBug(int sideLength) {
    if (sideLength < 1) throw new IllegalArgumentException("The side length (" + sideLength + ") must be positive.");
    else {
      this.sideLength = sideLength;
      steps = 0;
      rotateCount = 0;
    }
  }
  
  /**
   * Moves to the next location of the shape.
   */
  public void act() {
    if (canMove() && steps < sideLength && keepMoving()) {
      move();
      steps++;
    } else {
      endOfSide();
      //steps = 0;
      //rotateCount++;
    }
  }
  
  /**
   * Turn the bug the given number of times. <br />
   * NOTE: This functionality is made redundant by the <code>setDirection</code> method...
   * @param numTurns the number of turns the bug should make
   */
  public void turn(int numTurns) { for (int i=0; i<numTurns; i++) this.turn(); }
  
  /**
   * Determine whether or not the bug should continue to move, if
   * necessary. Ultimately, it is up to the child class to decide
   * how to implement this. If a shape does not need this method,
   * then it will default to true and have no effect on the class.
   */
  public boolean keepMoving() { return true; }
  
  /**
   * Method for determining whether an open shape has reached the
   * end of its side, thus determining whether or not it has to
   * turn its direction. This is up to the child to truly define.
   */
  public abstract void endOfSide();
  
  /**
   * Access the value in <code>rotateCount</code>.
   */
  public int getRotateCount() {
    return rotateCount;
  }
  
  /**
   * Access the value in <code>sideLength</code>.
   */
  public int getSideLength() {
    return sideLength;
  }
  
  /**
   * Access the value in <code>steps</code>.
   */
  public int getSteps() {
    return steps;
  }
  
  /**
   * Set the value in <code>sideLength</code>.
   */
  public void setRotateCount(int rotateCount) {
    this.rotateCount = rotateCount;
  }
  
  /**
   * Set the value in <code>sideLength</code>.
   */
  public void setSideLength(int sideLength) {
    this.sideLength = sideLength;
  }
  
  /**
   * Set the value in <code>steps</code>.
   */
  public void setSteps(int steps) {
    this.steps = steps;
  }
}