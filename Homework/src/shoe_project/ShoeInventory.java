package shoe_project;

public class ShoeInventory {
	private int capacity;
	private ShoeType[] inventory;
	private int numItems;
	
	
	public ShoeType[] getInventory() {
		return inventory;
	}

	public int getNumItems() {
		return numItems;
	}

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
		if (numItems == capacity) {
			return true;
		} else {
			return false;
		}
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
		if (shoe == null)
			return -2;
		if (isEmpty())
			return -3;
		
		
		int i = 0;
		for (ShoeType shoeType : inventory) {
			if (shoeType != null) {
				if (shoeType.getShoe().equals(shoe))
					return i;
			}
			i++;
		}
		return -1;
	}
	
	public void add(ShoeType shoeType) throws ShoeException {
		
		//Throw exception if full
		if (isFull()) {
			throw new ShoeException("Inventory is full");
		}
		
		//Check to see if ShoeType already listed if not empty
		if (!isEmpty()) {
			int index;
			if ((index = find(shoeType.getShoe()))>=0) {
				inventory[index].setQuantity(inventory[index].getQuantity() + shoeType.getQuantity());
				return;
			}
		}
		
		//If not present, add shoetype, increment number of items
		inventory[numItems] = new ShoeType(shoeType);
		numItems++;
		
	}

	
	public void delete(int index) throws ShoeException {
		if (!isEmpty()) {
			for (int i = 1; i<=numItems; i++) {
				if (i > index)
					inventory[i-1] = inventory[i];
			}
			inventory[numItems] = null;
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
	public Object clone() {
		ShoeInventory shoeInventory = (ShoeInventory) new Object();
		shoeInventory.inventory = this.inventory;
		shoeInventory.capacity = this.capacity;
		shoeInventory.numItems = this.numItems;
		return shoeInventory;
	}
	
	@Override
	protected void finalize() {}
		
		
}

