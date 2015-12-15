package examples.clone;

public class House implements Cloneable {
	private double price;
	
	public House(int price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "The price is:" + price;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
