package car_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CarDealerShip {
	
	private Car[] cars = new Car[100];
	private int numCars = 0;
	private String fileName;
	
	//Default constructor, generates object from formatted text file
	public CarDealerShip(String fileName) throws FileNotFoundException, IOException, CarException {
		this.fileName = fileName;
		File file = new File(this.fileName);
		FileReader in = new FileReader(file);
		BufferedReader bfr = new BufferedReader(in);
		String line, make = null, year = null, price = null, vin = null;
		boolean endOfFile = false;
		while (!endOfFile) {
			for (int i=0; i<=3; i++) {
				if ((line = bfr.readLine()) != null) {
					//System.out.println(line + " " + i);
					switch (i) {
						case 0:	
							make = line;
							break;
						case 1:
							year = line;
							break;
						case 2:
							price = line;
							break;
						case 3:
							vin = line;
							Car car = new Car(Integer.parseInt(year.toString()), 
									 Double.parseDouble(price.toString()), 
									 make.toString(), vin.toString());
							this.Add(car);
							break;
						}
				} else {
					endOfFile = true;
				}	 
			}
		}
		bfr.close();
		in.close();
	}
	
	//Adds car to cars
	public void Add(Car car) {
		numCars++;
		cars[numCars] = car;
	}
	
	//Delete the last car added from cars
	public boolean Delete() {
		if (numCars > 0) {
			cars[numCars] = null;
			numCars--;
			return true;
		} else {
			return false;
		}
	}
	
	//Outputs each car in cars
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Car car : cars) {
			if (car!=null) {
				sb.append(car);
				sb.append(System.getProperty("line.separator"));
			}
				
		}
		return sb.toString();
	}
	
	//Writes cars into a text file before closing
	@Override
	protected void finalize() throws FileNotFoundException, IOException {
		File file = new File(this.fileName);
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bWriter = new BufferedWriter(fileWriter);
		try {
			for (Car car : cars) {
				if (car!=null) {
					bWriter.write(car.getMake() + System.getProperty("line.separator"));
					bWriter.write(car.getYear() + System.getProperty("line.separator"));
					bWriter.write(car.getPrice() + System.getProperty("line.separator"));
					bWriter.write(car.getVin() + System.getProperty("line.separator"));
				}
			}
		} catch (Exception e) {} 
		finally {
			bWriter.close();
			fileWriter.close();
		}
	}

	public int getNumCars() {
		return this.numCars;
	}
	
	public Car[] getCars() {
		return cars;
	}
}