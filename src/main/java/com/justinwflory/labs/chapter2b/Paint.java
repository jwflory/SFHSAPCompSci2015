//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;

public class Paint {
  public static void main(String[] args) {
    final int COVERAGE = 350; //paint covers 350 sq ft/gal
    
    int length;
    int width;
    int height;
    int doors;
    int windows;
    double totalSqFt;
    double paintNeeded;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("How long is the room?");
    length = scan.nextInt();
    
    System.out.println("How wide is the room?");
    width = scan.nextInt();
    
    System.out.println("How tall is the room?");
    height = scan.nextInt();
    
    System.out.println("How many doors are in the room?");
    doors = scan.nextInt();
    
    System.out.println("How many windows are in the room?");
    windows = scan.nextInt();
    
    totalSqFt = (length * width * height) - (doors * 20) - (windows * 15);
    
    paintNeeded = totalSqFt / COVERAGE;

    System.out.println("The room length is " + length);
    System.out.println("The room width is " + width);
    System.out.println("The room height is " + height);
    System.out.println("The amount of paint needed is " +
                       paintNeeded + " gallons.");
  }
}