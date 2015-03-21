import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;

/**
 * This class runs a world that contains z-bugs.
 */
public class ZBugInheritedRunner implements Colors {
  public static void main(String[] args) {
    BoundedGrid<Actor> grid = new BoundedGrid<Actor>(50, 50);
    ActorWorld world = new ActorWorld(grid);
    
    ZBugInherited z1 = new ZBugInherited();
    z1.setColor(allColors[(int) (Math.random() * allColors.length)]);
    
    ZBugInherited z2 = new ZBugInherited(11);
    z2.setColor(allColors[(int) (Math.random() * allColors.length)]);
    
    Rock zRock = new Rock(allColors[(int) (Math.random() * allColors.length)]);

    world.add(new Location(10, 5), z1);
    world.add(new Location(25, 20), z2);
    world.add(new Location(16, 8), zRock);
    
    world.show();
  }
}