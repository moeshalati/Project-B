package game;

import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	private Room[] rooms;
	
	public void init() {
		this.rooms = new Room[4];
	    Room foyer = new Room(
			"The Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
			+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
			+ "To the north is a small room, where you can see a piano.");
	    	this.rooms[0] = foyer;
	        this.startingRoom = foyer;  
	        Room r2 = new Room("myroom1", "myroomshort1", "myroomlong1");
	        this.rooms[1]= r2;
	        Room r3 = new Room("myroom2", "myroomshort2", "myroomlong2");
	        this.rooms[2]= r3;
	        Room r4 = new Room("myroom3", "myroomshort3", "myroomlong3");
	        this.rooms[3]= r4;
	}

	public Room[] getRooms() {
		return this.rooms;
	}
}
