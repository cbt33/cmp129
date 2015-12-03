package examples.interfaces;

public class Mammal implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat grass");
	}

	@Override
	public double move() {
		// TODO Auto-generated method stub
		System.out.println("Move slowly");
		return 0;
	}

}
