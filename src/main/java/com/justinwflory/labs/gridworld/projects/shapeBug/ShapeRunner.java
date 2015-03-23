import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;

/**
 * This class runs a world that contains all bugs.
 */
public class ShapeRunner implements Colors {
  private static final boolean SAFETY = false;
  
  public static void main(String[] args) {
    UnboundedGrid<Actor> grid = new UnboundedGrid<Actor>();
    ActorWorld world = new ActorWorld(grid);
    
    BoxBug alice = new BoxBug(6);
    alice.setColor(colors[(int) (Math.random() * colors.length)]);
    
    BoxBug bob = new BoxBug(3);
    bob.setColor(colors[(int) (Math.random() * colors.length)]);
    
    CircleBug circle1 = new CircleBug(4);
    circle1.setColor(colors[(int) (Math.random() * colors.length)]);
    
    CircleBug circle2 = new CircleBug(14);
    circle2.setColor(colors[(int) (Math.random() * colors.length)]);
    Rock circleRock = new Rock(colors[(int) (Math.random() * colors.length)]);
    
    SpiralBug spiral1 = new SpiralBug(3);
    spiral1.setColor(colors[(int) (Math.random() * colors.length)]);
    
    SpiralBug spiral2 = new SpiralBug(11);
    spiral2.setColor(colors[(int) (Math.random() * colors.length)]);
    Rock spiralRock = new Rock(colors[(int) (Math.random() * colors.length)]);
    
    ZBug z1 = new ZBug(4);
    z1.setColor(colors[(int) (Math.random() * colors.length)]);
    
    ZBug z2 = new ZBug(18);
    z2.setColor(colors[(int) (Math.random() * colors.length)]);
    Rock zRock = new Rock(colors[(int) (Math.random() * colors.length)]);
    
    CustomBug custom1 = new CustomBug(3);
    custom1.setColor(colors[(int) (Math.random() * colors.length)]);
    
    CustomBug custom2 = new CustomBug(11);
    custom2.setColor(colors[(int) (Math.random() * colors.length)]);
    Rock customRock = new Rock(colors[(int) (Math.random() * colors.length)]);
    
    world.add(new Location(7, 8), alice);
    world.add(new Location(5, 5), bob);
    world.add(new Location(15, 20), circle1);
    world.add(new Location(60, 20), circle2);
    world.add(new Location(74, 41), circleRock);
    world.add(new Location(45, 40), spiral1);
    world.add(new Location(70, 70), spiral2);
    world.add(new Location(74, 76), spiralRock);
    world.add(new Location(20, 35), z1);
    world.add(new Location(35, 60), z2);
    world.add(new Location(53, 69), zRock);  
    world.add(new Location(25, 5), custom1);
    world.add(new Location(70, 70), custom2);
    world.add(new Location(22, 5), customRock);
    if (SAFETY) for (int i=0; i<200; i++) world.add(new Location(0, i), new Rock());

    world.show();
  }
}