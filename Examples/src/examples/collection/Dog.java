package examples.collection;

public class Dog {
	public String name;
	public int age;
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Dog(Dog dog) {
		this.setName(dog.getName());
		this.setAge(dog.getAge());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
}
