package shoe_project;

public class ShoeType {
	private Shoe shoe;
	private int quantity;

	public ShoeType(Shoe shoe, int quantity) throws ShoeException {
		this.setShoe(shoe);
		this.setQuantity(quantity);
	}
	
	public ShoeType(String id, double size, Color color, int quantity) throws ShoeException {
		this(new Shoe(id, size, color), quantity);
	}
	
	public ShoeType(ShoeType shoeType) throws ShoeException {
		this(shoeType.getShoe(), shoeType.getQuantity());
	}
	
	@Override
	public Object clone() {
		ShoeType shoeType = (ShoeType) new Object();
		shoeType.setShoe(this.getShoe());
		shoeType.setQuantity(this.getQuantity());
		return shoeType;
	}
	
	@Override
	protected void finalize() {}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShoeType other = (ShoeType) obj;
		if (shoe == null) {
			if (other.shoe != null)
				return false;
		} else if (!shoe.equals(other.shoe))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return shoe + ",quantity:" + quantity;
	}

	public Shoe getShoe() {
		return shoe;
	}
	
	private void setShoe(Shoe shoe) {
		this.shoe = shoe;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}