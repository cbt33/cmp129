package car_project;

public class Car {
	private double price;
	private int year;
	private static int carCount = 0;
	private String make;
	private String vin;
	
	public Car() {
		carCount++;
		year = 1970;
		price = 0.0;
		make = "N/A";
		vin = "N/A";
	}
	
	public Car(int year, double price) {
		try {
			carCount++;
			this.setYear(year);
			this.setPrice(price);
			make = "N/A";
			vin = "N/A";
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public Car(int year, double price, String make, String vin) {
		try {
			carCount++;
			this.setYear(year);
			this.setPrice(price);
			this.setMake(make);
			this.setVin(vin);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public Car(Car car) {
		try {
			carCount++;
			this.setYear(car.getYear());
			this.setPrice(car.getPrice());
			this.setMake(car.getMake());
			this.setVin(car.getVin());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public String toString() {
		String output = null;
		try {
			output = "The current car's stats are "
				+ "[Year:" + this.getYear()
				+ ", Price:" + this.getPrice()
				+ ", Make:" + this.getPrice()
				+ ", Vin:" + this.getPrice()
				+ "]";
		} catch (Exception e) {}
		return output;
	}
	
	public void setPrice(double price) throws CarException {
		if (price < 0.0 || price > 10000.0)
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
	
	public void finalize(){
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

	public String getMake() throws CarException {
		if (this.make == null)
			throw new CarException("Make is null.");
		else
			return make;
	}

	public void setMake(String make) throws CarException {
		if (make != null)
			this.make = make;
		else
			throw new CarException("Invalid Make");
	}

	public String getVin() throws CarException {
		if (this.vin == null)
			throw new CarException("Vin is null.");
		else
			return vin;
	}

	public void setVin(String vin) throws CarException {
		if (vin != null)
			this.vin = vin;
		else
			throw new CarException("Invalid Vin");
	}

}
