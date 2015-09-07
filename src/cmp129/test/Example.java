package cmp129.test;

import java.util.Scanner;
import cmp129.test.ageException;
import cmp129.test.User;

public class Example {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User();
		System.out.format("Enter Age:");
		Scanner s = new Scanner(System.in);
		try {
			u.setAge(s.nextInt());
		}
		catch (ageException aE) {
			System.out.println(aE.getMessage());
		}
		System.out.format("Next year you will be %d \n", u.getAge()+1);
		s.close();
	}

}
