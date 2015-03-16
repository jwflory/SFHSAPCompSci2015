/* 
 * GridWorld programs have many things that need to be imported, since you are using a lot of
 * classes that have already been written and compiled and you can't make any changes to.
 * 
 * Instead of importing individual classes, you can also import entire packages using the * wildcard
 * character.  For example, instead of the separate import statements below, the single statement
 * 
 * import info.gridworld.actor.*;
 * 
 * could have been used.
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

// if you're going to create specific grids, you need to import classes from the grid package
// we'll be lazy and use the * wildcard to just pull in everything
import info.gridworld.grid.*;

// this imported class gives us access to the color name constants
import java.awt.Color;

/**
 * This class runs a world that contains bugs and rocks, some added at random
 * locations, some added at specific locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * There are also samples for how to create a world with a BoundedGrid other than the default size, and how to
 * create a world with an UnboundedGrid.
 * 
 * To build your own worlds, define your own actors and a runner class.
 */
public class GridWorldIntroRunner
{
    public static void main(String[] args)
    {
      // below are three different examples of creating an ActorWorld; uncomment one example at a time
      //  to see the different ways worlds can be created
      
      // code to create a default world
      ActorWorld world = new ActorWorld();
      
      // code to create a world with a BoundedGrid that is 30 rows x 50 cols instead of the default 10x10
      //BoundedGrid<Actor> myGrid = new BoundedGrid<Actor>(30, 50);
      //ActorWorld world = new ActorWorld(myGrid);
      
      // code to create a world with an UnboundedGrid
      //UnboundedGrid<Actor> myGrid = new UnboundedGrid<Actor>();
      //ActorWorld world = new ActorWorld(myGrid);
      
      // these two statements create a Bug and a Rock and place them at random, unoccupied locations
      //    on the grid
        world.add(new Bug());
        world.add(new Rock());
        
      /* these two statements create a Bug and a Rock at specific Locations; normally, when you run this
       * program there should be four actors on the grid, but sometimes when you run it there will
       * be less than four; why?
       * also, notice than when a specific location is desired, we can't just pass coordinates to the
       * add() method; we have to create a Location object, and have the new object passed as a 
       * parameter to the add() method
       */
        world.add(new Location(2, 3), new Bug(Color.GREEN));
        world.add(new Location(7, 8), new Rock(Color.BLUE));
        
        // and finally, once we've put everything we want to on the initial grid, we call the
        // method below to display the grid
        world.show();
        
        /* NOTE: once you have called world.show(), the only way to get more actors onto the grid
         * is to have other actors create them during the execution of their act() methods, or to
         * stop the world from running and add them manually using the menus
         */
    }
}
