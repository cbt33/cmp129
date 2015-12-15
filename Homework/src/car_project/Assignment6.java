package car_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment6 {
	
	
	@Test (expected = CarException.class)
	public void setVinNullTest() throws CarException {
		@SuppressWarnings("unused")
		Car test = new Car(1970, 1, null, null);
	}
	
	@Test (expected = CarException.class)
	public void setVinBlankTest() throws CarException {
		Car test = new Car();
		test.setVin("    ");
	}
	
	@Test (expected = CarException.class)
	public void setMakeNullTest() throws CarException {
		@SuppressWarnings("unused")
		Car test = new Car(1970, 1, null, null);
	}
	
	@Test (expected = CarException.class)
	public void setMakeBlankTest() throws CarException {
		Car test = new Car();
		test.setMake("    ");
	}
	

	
}
