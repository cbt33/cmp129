package examples.arrays;

import java.util.Scanner;

public class ObjectArrayDemo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Create an array of House objects
			House[] houses = new House[5];
			int i;
			for (i=0; i < houses.length; i++) {
					houses[i] = new House();
					System.out.println(houses[i].toString());
			}
			boolean houseChanged = false;
			Scanner s = new Scanner(System.in);
			while (!houseChanged) {
			try {
				System.out.println("Which house do you want to change?");
			int h = s.nextInt();
			System.out.println("How many rooms does it have?");
			int rooms = s.nextInt();
			System.out.println("How much does it cost?");
			double price = s.nextDouble();
			houses[h].setRooms(rooms);
			houses[h].setPrice(price);
			houseChanged = true;
			}
			catch (ArrayIndexOutOfBoundsException aex) {
				System.out.println("Selection out of bounds: 0 to 4, please select again.");
				s.next();
			}
				
			for (House house : houses) {
				System.out.println(house.toString());
			}
			
			}
		}
	}


