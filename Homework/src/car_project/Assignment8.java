package car_project;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class Assignment8 {
	
	public void finalizeTest() throws IOException, CarException {
		File file = new File("src/car_project/carList2.txt");
		file.createNewFile();
		CarDealerShip dealership = new CarDealerShip("src/car_project/carList2.txt");
		dealership.Add(new Car(2003, 7000, "Honda", "asdf4f4f"));
	}
	
	@Test
	public void carDealerShipConstructorTest() throws FileNotFoundException, IOException, CarException {
		System.out.println(new File(".").getAbsoluteFile());
		CarDealerShip dealership = new CarDealerShip("src/car_project/carList.txt");
		assertEquals(3, dealership.getNumCars());
	}
	
	@Test
	public void carDealerShipDeleteTest() throws FileNotFoundException, IOException, CarException {
		System.out.println(new File(".").getAbsoluteFile());
		CarDealerShip dealership = new CarDealerShip("src/car_project/carList.txt");
		dealership.Delete();
		assertEquals(2, dealership.getNumCars());
		assertEquals("Honda", dealership.getCars()[dealership.getNumCars()].getMake());
	}
	
	@Test
	public void carDealerShipToStringTest() throws FileNotFoundException, IOException, CarException {
		System.out.println(new File(".").getAbsoluteFile());
		CarDealerShip dealership = new CarDealerShip("src/car_project/carList.txt");
		assertEquals(true, dealership.toString().equals("[Year:2001, Price:1500.0, Make:Ford, Vin:7YT77612-12]" + System.getProperty("line.separator")
					+ "[Year:2003, Price:7008.0, Make:Honda, Vin:GG7HT99-16]" + System.getProperty("line.separator") 
					+ "[Year:1998, Price:3074.82, Make:Volkswagen, Vin:ERRUQ66-15]" + System.getProperty("line.separator")));
	}
	
	@Test
	public void carDealerShipFinalizeTest() throws FileNotFoundException, IOException, CarException {
		finalizeTest();
		System.gc();
		System.runFinalization();
	}
}

