package car_project;

public class Car {
	private int year;
	private price;
	private static int carCount = 0;
	private String make;
	private String vin;
	
	public Car() {
		year = 1970;
		price = 0.0;
		make = "N/A";
		vin = "N/A";
		carCount++;
	}
	
	public Car(int year, double price) {
		try {
			this.setYear(year);
			this.setPrice(price);
			carCount++;
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public Car(int year, double price, String make, String vin) {
		try {
			this.setYear(year);
			this.setPrice(price);
			this.setMake(make);
			this.setVin(vin);
			carCount++;
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public Car(Car car) {
		this.setYear(car.getYear());
		this.setPrice(car.getPrice());
		this.setMake(car.getMake());
		this.setVin(car.getVin());
		carCount++;
	}
	
	public String toString() {
		return "The current car's stats are [Year:" + this.getYear()", Price:" + this.getPrice() + "]";
	}
	
	public void setYear(int year) throws CarException {
		if (year < 1970 || year > 2011)
			throw new CarException();
		else
			this.year = year;
	}
	
	public void setPrice(double price) throws CarException {
		if (price < 0.0 || price > 10000.0)
			throw new CarException();
		else
			this.price = price;
	}
	
	public int year getYear() {
		return this.year;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getCarCount() {
		return carCount;
	}
	
	public void finalize(){
		System.out.println("The finalize method called.");
	}
}
