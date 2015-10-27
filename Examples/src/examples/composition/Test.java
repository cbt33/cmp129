package examples.composition;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		if (car.getWheels()[2] != null)
			car.getWheels()[2].setSize(3);
		else
			System.out.println("Wheel is null");
	}

}
