/*
 * This code has been written for completely education purposes. It does not hold any significant purpose other
 * than to help demonstrate certain AP Computer Science concepts and important elements. Other than provide an
 * example, it does not perform any viable function.
 * 
 * Written by Justin W. Flory, (C) 2014
 */

public class DeliveryRobot {
  // Attributes (or instances)
  private int[][] map;
  private int currentWeight, maxWeight, direction, currentPower, maxPower, minPower, row, column;
  private boolean isMoving;
  private String name, instructions;
  
  public static final int NORTH = 0;
  public static final int EAST = 1;
  public static final int SOUTH = 2;
  public static final int WEST = 3;
  
  // Constructors
  public DeliveryRobot(String name, int maxWeight, int maxPower, int minPower) {
    if (maxWeight > 10 && maxWeight < 200) this.maxWeight = maxWeight;
    this.name = name;
    this.maxPower = maxPower;
    this.minPower = minPower;
    
    map = null;
    currentWeight = 0;
    currentPower = 0;
    isMoving = true;
    instructions = "";
    row = 0;
    column = 0;
    direction = NORTH;
  }
  
  // Methods and Behaviors
  
  /*
   * For AP Computer Science Design FRQs, you wil ltypically only have to write the method header for the
   * problem(s) and not anything else. What exactly is the method header? It is the following items:
   *   1. Visibility modifier (e.g. private vs public)
   *   2. Return type of the method (e.g. void, int, boolean, etc.)
   *   3. Name of the method
   *   4. Parameter list for the method
   */
  
  private void move() {
    // (Mutator Method: currentLocation, isMoving) Move to the next location
  }
  
  private void turn(int direction) {
    // (Mutator Method: instructions) Turn the robot into a new direction
    if (direction >= 0 && direction <= 3) this.direction = direction;
    else System.out.println("ERROR! Invalid input. Use NORTH, EAST, SOUTH, or WEST.");
  }
  
  public void setInstructions(String instructions) {
    // (Mutator Method: instructions) Get the instructions for the receiving end of the delivery
    this.instructions = instructions;
  }
  
  public String getInstructions() {
    // (Accessor Method) Return instructions
    return instructions;
  }
  
}

// Go program a school.
//      - 3rd Period, APCOMPSCI O'Connor