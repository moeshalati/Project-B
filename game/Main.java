package game;

import fixtures.Room;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomManager rm = new RoomManager();
		rm.init();
		for (int i = 0; i < rm.getRooms().length; i++)
		{
			System.out.println(rm.getRooms()[i].getName());
			Player p = new Player();
			
			p.setCurrentRoom(rm.getRooms()[0]);
			System.out.println(p.getCurrentRoom().getName());
		}
		
	}
	
//	public static void printRoom (Player player) {
		
		
//	}

}
