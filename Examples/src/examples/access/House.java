package examples.access;

public class House {

	private double price;
	private int numRooms;
	private static double minPrice = 0;
	private static int minRooms = 1;
	
	public House() {
		this.setNumRooms(12);
		this.setPrice(1000000.0);
	}
	
	public House(double price, int numRooms) {
		this.setNumRooms(numRooms);
		this.setPrice(price);
	}
	
	@Override
	public String toString() {
		return "Rooms:" + numRooms + ", Price:" + price + ".";
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price >= minPrice)
			this.price = price;
		else
			this.price = minPrice;
	}
	
	public int getNumRooms() {
		return numRooms;
	}
	
	public void setNumRooms(int numRooms) {
		if (numRooms > minRooms) {
			this.numRooms = numRooms;
		}
		else
			this.numRooms = minRooms;
	}
	
	
}
