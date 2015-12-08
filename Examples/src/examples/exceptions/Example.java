package examples.exceptions;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("What is your age?");
		boolean validAge = false;
		while (!validAge) {
			try {
				int input = s.nextInt();
				if (input >= 0) {
					System.out.format("Next year you will be %d years old", ++input);
					validAge = true;
					s.close();
				} else {
					System.out.println("Invalid age input");
				}
			
			} catch (Exception e) {
				e.printStackTrace();
				s.next();
			}
		}
	}
}
