package car_project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Assignment6IncCarCountTest {

	@Test
	public void incCarCountTest() throws CarException, InterruptedException {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		assertEquals(3, c1.getCarCount());
	}
}
