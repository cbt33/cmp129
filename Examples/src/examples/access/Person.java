package examples.access;

public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws InvalidAgeException {
		if (age >= 0)
			this.age = age;
		else
			throw new InvalidAgeException(age);
	}
	

}
