package car_project;

public class Car {
	private double price;
	private int year;
	private static int carCount;
	private String make;
	private String vin;
	public static double minPrice = 0.0;
	public static double maxPrice = 100000.0;
	public static int minYear = 1970;
	
	
	public Car() {
		year = minYear;
		price = minPrice;
		make = "N/A";
		vin = "N/A";
		++carCount;
	}
	
	public Car(int year, double price) throws CarException {
		try {
			this.setYear(year);
			this.setPrice(price);
			this.make = "N/A";
			this.vin = "N/A";
			++carCount;
		} catch (CarException ce) {
			throw ce;
		}
	}
	
	public Car(int year, double price, String make, String vin) throws CarException {
		try {
			this.setYear(year);
			this.setPrice(price);
			this.setMake(make);
			this.setVin(vin);
			++carCount; 
		} catch (CarException ce) {
			throw ce;
		}
	}
	
	public Car(Car car) throws CarException {
		try {
			this.setYear(car.getYear());
			this.setPrice(car.getPrice());
			this.setMake(car.getMake());
			this.setVin(car.getVin());
			++carCount;
		} catch (CarException ce) {
			throw ce;
		}
	}

	public String toString() {
		return "[Year:" + this.getYear()
			+ ", Price:" + this.getPrice()
			+ ", Make:" + this.getMake()
			+ ", Vin:" + this.getVin()
			+ "]";
	}
	
	public void setPrice(double price) throws CarException {
		if (price < minPrice || price > maxPrice)
			throw new CarException(price + " is an invalid price.");
		else
			this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getCarCount() {
		return carCount;
	}
	
	protected void finalize() {
		System.out.println("The finalize method called.");
		carCount--;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws CarException {
		if (year <1970 || year > 2011)
			throw new CarException(year + " is an invalid year.");
		else
			this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) throws CarException {
		if (make.trim().isEmpty() || make == null)
			throw new CarException("Invalid Make");
		else
			this.make = make;
			
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) throws CarException {
		if (vin.trim().isEmpty() || vin == null)
			throw new CarException("Invalid Vin");
		else
			this.vin = vin;
	}

	public static double getMinPrice() {
		return minPrice;
	}

	public static int getMinYear() {
		return minYear;
	}

}
