package Rooms;

import People.Person;

import java.util.Scanner;

public class Room {
	Person occupant;
	int xLoc,yLoc,xDeck,xGold;
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}


	/**
	 * Method controls the results when a person enters this room.
	 * @param x the Person entering
	 */
	public void enterRoom(Person x)
	{
		System.out.println("You enter a plain old room");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}

	/**
	 * Removes the player from the room.
	 * @param x
	 */
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}
