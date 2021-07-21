package game;

import fixtures.Room;

public class Player {
	
	private Room currentRoom;
	
	public void setCurrentRoom(Room r) {
		this.currentRoom = r;
	}
	public Room getCurrentRoom() {
		return this.currentRoom;
	}

}