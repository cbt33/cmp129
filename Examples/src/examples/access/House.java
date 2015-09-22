package examples.access;

public class House {

	private double price;
	private int numRooms;
	
	public House() {
		this.setNumRooms(12);
		this.setPrice(1000000.0);
	}
	
	public House(double price, int numRooms) {
		this.setNumRooms(numRooms);
		this.setPrice(price);
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price >= 0)
			this.price = price;
		else
			this.price = 0;
	}
	
	public int getNumRooms() {
		return numRooms;
	}
	
	public void setNumRooms(int numRooms) {
		if (numRooms > 0) {
			this.numRooms = numRooms;
		}
		else
			this.numRooms = 1;
	}
	
	
}
