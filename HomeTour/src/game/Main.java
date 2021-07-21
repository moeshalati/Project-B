package game;

import java.io.BufferedReader;
import java.util.Scanner;

import fixtures.Room;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomManager rm = new RoomManager();
		rm.init();
		Player p = new Player();
		Scanner scan = new Scanner(System.in);
		int input = 1;
		while (input == 1){
			printRoom(p);
			parse (collectInput(), p);
		}
			
		
	}
	
	private static void printRoom (Player player) {
		System.out.println("Welcome to the Home Tour game"
				+ "\nYour character is now at" + (player.getCurrentRoom().getName()));	
	}
	
	private static String[] collectInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] commandArr = input.split(" ");
		
		return commandArr;
	}
	
	private static void parse (String [] command, Player player) {
		RoomManager rm = new RoomManager();
		rm.init();
		
		switch (command[0]){
			case "go":{
				if (command[1].equalsIgnoreCase("north")) {
					System.out.println("moving..");
					player.setCurrentRoom(rm.getRooms()[0]);
					
				}
				else if (command[1].equalsIgnoreCase("south")) {
					player.setCurrentRoom(rm.getRooms()[1]);
				}
				else if (command[1].equalsIgnoreCase("east")) {
					player.setCurrentRoom(rm.getRooms()[3]);
				}
				else if (command[1].equalsIgnoreCase("west")) {
					player.setCurrentRoom(rm.getRooms()[4]);
				}
				//else {
					//something
				//}
			}
			
			//case "move":
			
		}
	}

}
