package car_project;

import static org.junit.Assert.*;

import org.junit.*;

public class Assignment5 {
   
	@Test  
	public void toStringTest() throws CarException {  
	  Car test = new Car(2001,15000);
	  assertEquals(true, test.toString().equals("[Year:2001, Price:15000.0, Make:N/A, Vin:N/A]"));
	}  
    
}
