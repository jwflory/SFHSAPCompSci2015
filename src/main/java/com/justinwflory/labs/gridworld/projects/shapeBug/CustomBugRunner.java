import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;

/**
 * This class runs a world that contains custom bugs.
 */
public class CustomBugRunner implements Colors {
  public static void main(String[] args) {
    UnboundedGrid<Actor> grid = new UnboundedGrid<Actor>();
    ActorWorld world = new ActorWorld(grid);
    
    CustomBug custom1 = new CustomBug(4);
    custom1.setColor(colors[(int) (Math.random() * colors.length)]);
    
    CustomBug custom2 = new CustomBug(12);
    custom2.setColor(colors[(int) (Math.random() * colors.length)]);

    world.add(new Location(35, 45), custom1);
    world.add(new Location(15, 25), custom2);
    
    world.show();
  }
}