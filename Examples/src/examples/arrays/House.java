package examples.arrays;

public class House {
	private int rooms;
	private double price;
	
	public House() {
		rooms = 15;
		price = 3e5;
	}
	
	public House(int rooms, double price) {
		this.rooms = rooms;
		this.price = price;
	}
	
	public House(House house) {
		this.setPrice(house.getPrice());
		this.setRooms(house.getRooms());
	}

	@Override
	public String toString() {
		return "A House with " + rooms + " rooms, costing $" + price + ".";
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
	
	
}
