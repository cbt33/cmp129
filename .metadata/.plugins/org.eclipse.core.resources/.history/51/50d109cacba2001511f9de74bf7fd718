package examples.linkedlist;

import java.util.Scanner;

public class LinkedListDemo2 {
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		int rooms;
		double price;
		LinkedList<House> list = null;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter house? 1 for yes");
		while (s.nextInt() == 1) {
			System.out.println("Enter number of rooms ");
			rooms = s.nextInt();
			s.nextLine();
			System.out.println("Enter price ");
			price = s.nextDouble();
			s.nextLine();
			if (list == null) {
				list = new LinkedList<House>(new Node<House>(new House(rooms, price)));
			} else {
				list.addNode(new House(rooms, price));
			}
			System.out.println("Enter house? 1 for yes");
		}
		
		
		System.out.println(list);
		s.close();
		
	}

	
}
