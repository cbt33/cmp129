package examples.specialclasses.anonymous;

public class AnonTest2 {
	public static void main(String[] args) {
		makeSound( new Animal() {
						public void sound() {
							System.out.println("Woof!");
						}
					});
	}
	
	public static void makeSound(Animal e) {
		e.sound();
	}
	
}
