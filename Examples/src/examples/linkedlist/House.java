package examples.linkedlist;

public class House {
	private int rooms;
	private double price;
	
	public House(int rooms, double price) {
		super();
		this.rooms = rooms;
		this.price = price;
	}

	public int getRooms() {
		return rooms;
	}
	
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "House [rooms=" + rooms + ", price=" + price + "]";
	}
	
}
