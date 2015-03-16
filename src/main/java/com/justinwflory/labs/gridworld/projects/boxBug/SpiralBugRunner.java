import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;

/**
 * This class runs a world that contains spiral bugs.
 */
public class SpiralBugRunner implements Colors {
  public static void main(String[] args) {
    UnboundedGrid<Actor> grid = new UnboundedGrid<Actor>();
    ActorWorld world = new ActorWorld(grid);
    
    SpiralBug spiral1 = new SpiralBug(3);
    spiral1.setColor(allColors[(int) (Math.random() * allColors.length)]);
    
    SpiralBug spiral2 = new SpiralBug(11);
    spiral2.setColor(allColors[(int) (Math.random() * allColors.length)]);

    world.add(new Location(10, 5), spiral1);
    world.add(new Location(35, 40), spiral2);
    
    world.show();
  }
}