import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;

/**
 * This class runs a world that contains box bugs.
 */
public class BoxBugRunner implements Colors {
  public static void main(String[] args) {
    BoundedGrid<Actor> grid = new BoundedGrid<Actor>(20, 20);
    ActorWorld world = new ActorWorld(grid);
    
    BoxBug box1 = new BoxBug(6);
    box1.setColor(colors[(int) (Math.random() * colors.length)]);
    
    BoxBug box2 = new BoxBug(3);
    box2.setColor(colors[(int) (Math.random() * colors.length)]);
    
    world.add(new Location(7, 8), box1);
    world.add(new Location(5, 5), box2);
    
    world.show();
  }
}