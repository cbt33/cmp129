package examples.specialclasses.anonymous;

public class AnonTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog x = new Dog();
		makeSound(x);
		Cat y = new Cat();
		makeSound(y);
	}
	
	public static void makeSound(Animal e) {
		e.sound();
	}

}
