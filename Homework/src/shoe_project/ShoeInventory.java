package shoe_project;

public class ShoeInventory {
	private int capacity;
	private ShoeType[] inventory;
	private int numItems;
	
	
	public ShoeInventory(int capacity) throws ShoeException {
			this.setCapacity(capacity);
			inventory = new ShoeType[capacity];
			numItems = 0;
	}
	
	private void setCapacity(int capacity) throws ShoeException {
				// TODO Auto-generated method stub
			if (capacity >= 0)
				this.capacity = capacity;
			else
				throw new ShoeException("Invalid ShoeInventory capacity");
	}
	
	public boolean isFull() {
		if (numItems == capacity)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {
		if (numItems == 0)
			return true;
		else
			return false;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
		//Finds index of shoe in inventory
	public int find(Shoe shoe) {
		if (isEmpty())
			return -3;
		if (shoe == null)
			return -2;
		int i = 0;
		for (ShoeType shoeType : inventory) {
			if (shoeType != null) {
				if (shoeType.getShoe().equals(inventory[i].getShoe()))
					return i;
			}
			i++;
		}
		return -1;
	}
	
	public void add(ShoeType shoeType) throws ShoeException {
		if (!isFull()) {
			for (ShoeType sT : inventory) {
				if (sT.equals(shoeType))
					sT.setQuantity(sT.getQuantity() + shoeType.getQuantity());
				else
					inventory[numItems] = shoeType;
					numItems++;
			}
		}
	}
	
	public void delete(int index) throws ShoeException {
		if (!isEmpty()) {
			for (int i = 0; i<=numItems; i++) {
				if (i > index)
					inventory[i-1] = inventory[i];
			}
			numItems--;
		}
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (ShoeType shoeType : inventory) {
			if (shoeType!=null)
				sb.append(shoeType + System.getProperty("line.separator"));
		}
		return sb.toString();
	}
	
	@Override
	public Object clone() {}
	@Override
	protected void finalize() {}	
		
		
}

