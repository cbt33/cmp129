package examples.composition;

public class Person {
	
	private String name;
	private double height;
	private int age;
	private static int minAge = 0;
	private static int maxAge = 150;
	
	public Person(String name, double height, int age) throws Exception {
		this.setName(name);
		this.setHeight(height);
		this.setAge(age);
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if (age < minAge || age > maxAge)
			throw new Exception();
		else
			this.age = age;
	}
	
	
	
	
}
