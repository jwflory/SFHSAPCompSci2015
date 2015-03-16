/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.*;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BoxBugRunner implements Colors {
  public static void main(String[] args) {
    BoundedGrid<Actor> grid = new BoundedGrid<Actor>(20, 20);
    ActorWorld world = new ActorWorld(grid);
    
    BoxBug alice = new BoxBug(6);
    alice.setColor(allColors[(int) (Math.random() * allColors.length)]);
    
    BoxBug bob = new BoxBug(3);
    bob.setColor(allColors[(int) (Math.random() * allColors.length)]);
    
    world.add(new Location(7, 8), alice);
    world.add(new Location(5, 5), bob);
    
    world.show();
  }
}