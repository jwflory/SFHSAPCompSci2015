import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;

/**
 * This class runs a world that contains shape bugs.
 */
public abstract class ShapeRunner implements Colors {
  public static void main(String[] args) {
    BoundedGrid<Actor> grid = new BoundedGrid<Actor>(50, 50);
    ActorWorld world = new ActorWorld(grid);
    
    ZBug z1 = new ZBug();
    z1.setColor(colors[(int) (Math.random() * colors.length)]);
    
    ZBug z2 = new ZBug(11);
    z2.setColor(colors[(int) (Math.random() * colors.length)]);
    
    Rock zRock = new Rock(colors[(int) (Math.random() * colors.length)]);

    world.add(new Location(10, 5), z1);
    world.add(new Location(25, 20), z2);
    world.add(new Location(16, 8), zRock);
    
    world.show();
  }
}