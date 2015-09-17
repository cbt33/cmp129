package car_project;

public class Car {
	private int year;
	private price;
	
	public Car() {
		year = 1970;
		price = 0.0;
	}
	
	public Car(int year, double price) {
		try {
			this.setYear(year);
			this.setPrice(price);
		} catch (Exception e) {}
	}
	
	public void setYear(int year) {
		if (year < 1970 || year > 2011)
			throw new Exception();
		else
			this.year = year;
	}
	
	public void setPrice(double price) {
		if (price < 0.0 || price > 10000.0)
			throw new Exception();
		else
			this.price = price;
	}
	
	public int year getYear() {
		return this.year;
	}
	
	public double getPrice() {
		return this.price;
	}
}
