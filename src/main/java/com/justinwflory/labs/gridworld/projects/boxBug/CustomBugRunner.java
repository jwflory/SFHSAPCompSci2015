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
    
    CustomBug custom1 = new CustomBug(3);
    custom1.setColor(allColors[(int) (Math.random() * allColors.length)]);
    
    CustomBug custom2 = new CustomBug(11);
    custom2.setColor(allColors[(int) (Math.random() * allColors.length)]);

    world.add(new Location(10, 5), custom1);
    world.add(new Location(35, 40), custom2);
    
    world.show();
  }
}