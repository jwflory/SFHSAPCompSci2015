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
    spiral1.setColor(colors[(int) (Math.random() * colors.length)]);
    
    SpiralBug spiral2 = new SpiralBug(11);
    spiral2.setColor(colors[(int) (Math.random() * colors.length)]);
    
    Rock spiralRock = new Rock(colors[(int) (Math.random() * colors.length)]);

    world.add(new Location(10, 5), spiral1);
    world.add(new Location(25, 20), spiral2);
    world.add(new Location(16, 8), spiralRock);
    
    world.show();
  }
}