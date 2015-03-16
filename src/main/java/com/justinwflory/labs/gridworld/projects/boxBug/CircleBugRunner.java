import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;

/**
 * This class runs a world that contains circle bugs <br />
 * Even though we call it a circle, there is no possible way to
 * draw a perfect circle in a grid-oriented world. A perfect circle
 * cannot exist.
 */
public class CircleBugRunner implements Colors {
  public static void main(String[] args) {
    BoundedGrid<Actor> grid = new BoundedGrid<Actor>(50, 50);
    ActorWorld world = new ActorWorld(grid);
    
    CircleBug circle1 = new CircleBug(4);
    circle1.setColor(allColors[(int) (Math.random() * allColors.length)]);
    
    CircleBug circle2 = new CircleBug(14);
    circle2.setColor(allColors[(int) (Math.random() * allColors.length)]);
    
    world.add(new Location(15, 20), circle1);
    world.add(new Location(32, 0), circle2);
    
    world.show();
  }
}