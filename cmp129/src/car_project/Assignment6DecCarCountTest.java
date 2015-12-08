package car_project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Assignment6DecCarCountTest {
	public void tempCars() throws CarException {
		Car car1 = new Car();
		Car car2 = new Car();
	}
	
	@Test
	public void decCarCountTest() throws CarException, InterruptedException {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		tempCars();
		System.gc();
		System.runFinalization();
		assertEquals(3, c1.getCarCount());
	}
}
