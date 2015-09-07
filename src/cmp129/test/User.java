package cmp129.test;

import cmp129.test.ageException;

public class User {
	
	protected int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age < 0) {
			throw new ageException(age);
		}
		else {
			this.age = age;
		}
	}
	
	
}
