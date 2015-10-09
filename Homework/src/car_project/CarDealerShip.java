package car_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class CarDealerShip {
	
	private Car[] cars = new Car[100];
	private int numCars = 0;
	private String filename;
	
	//Default constructor, generates object from formatted text file
	public CarDealerShip(String filename) throws FileNotFoundException, IOException, CarException {
		this.filename = filename;
		FileReader in = new FileReader(this.filename);
		Scanner s = new Scanner(in);
		StringBuffer make, year, vin, price;
		while ( s.hasNextLine() ) {
				 make = new StringBuffer(s.nextLine());
				 System.out.println(make);
				 year = new StringBuffer(s.nextLine());
				 System.out.println(year);
				 price = new StringBuffer(s.nextLine());
				 System.out.println(price);
				 vin = new StringBuffer(s.nextLine());
				 System.out.println(vin);
				 Car car = new Car(Integer.parseInt(year.toString()), 
						 Double.parseDouble(price.toString()), 
						 make.toString(), vin.toString());
				 System.out.println(car);
				 this.Add(car);
			 }
		s.close();
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
		FileWriter out = new FileWriter(this.filename);
		Scanner s = new Scanner(out);
		for (Car car in cars) {
			if (car!=null) {
				sb.append(car);
				sb.append(System.getProperty("line.separator"));
			}
				
		}
	}
	
	//Writes cars into a text file before closing
	@Override
	protected void finalize() {
		FileWriter out = new FileWriter(this.filename);
		Scanner s = new Scanner(out);
		for (Car car in cars) {
			if (car!=null) {
				s.writeLine(car.make);
				s.writeLine(car.year);
				s.writeLine(car.price);
				s.writeLine(car.vin);
			}
				
		}
	}
	
}
