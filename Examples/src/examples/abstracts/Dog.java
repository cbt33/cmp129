package examples.abstracts;

public class Dog extends Mammal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Just ate");
	}

	@Override
	public double move() {
		// TODO Auto-generated method stub
		System.out.println("Just moved");
		return 0;
	}

}
