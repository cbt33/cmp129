package shoe_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment9ShoeInventory {
	
	@Test
	public void shoeInventoryFindTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		si.add(new ShoeType("id", 2.0, Color.BLACK, 1));
		si.add(new ShoeType("id", 3.0, Color.BLACK, 1));
		assertEquals(1, si.find((new Shoe("id", 3.0, Color.BLACK))));
	}
	
	
	//isFull() returns true when full, false when not
	@Test
	public void shoeInventoryIsFullTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		assertEquals(false, si.isFull());
		si.add(new ShoeType("ida", 2.0, Color.BLACK, 1));
		si.add(new ShoeType("idb", 3.0, Color.GREEN, 2));
		si.add(new ShoeType("idc", 4.0, Color.WHITE, 3));
		assertEquals(true, si.isFull());
	}
	
	//isEmpty() returns true when empty, false when not
	@Test
	public void shoeInventoryIsEmptyTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		assertEquals(true, si.isEmpty());
		si.add(new ShoeType("id", 2.0, Color.BLACK, 1));
		assertEquals(false, si.isEmpty());
	}
	
	@Test
	public void shoeInventoryGetCapacityTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		assertEquals(3, si.getCapacity());
	}
	
	@Test
	public void shoeInventoryGetNumItemsTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		si.add(new ShoeType("id", 2.0, Color.BLACK, 1));
		assertEquals(1, si.getNumItems());
	}
	
	@Test
	public void shoeInventoryFindIsEmptyTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		assertEquals(-3, si.find(new Shoe("id", 2.0, Color.BLACK)));
	}
	
	@Test
	public void shoeInventoryFindIsNullTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		assertEquals(-2, si.find(null));
	}
	
	@Test
	public void shoeInventoryFindNotFoundTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		si.add(new ShoeType("id", 2.0, Color.BLACK, 1));
		assertEquals(-1, si.find((new Shoe("id", 3.0, Color.BLACK))));
	}
	

	
	//Throws exception if full
	@Test (expected = ShoeException.class)
	public void shoeInventoryAddThrowExceptionTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		si.add(new ShoeType("id", 2.0, Color.BLACK, 1));
		si.add(new ShoeType("id", 3.0, Color.BLACK, 1));
		si.add(new ShoeType("id", 4.0, Color.BLACK, 1));
		si.add(new ShoeType("id", 5.0, Color.BLACK, 1));
		//assertEquals(true,true);
	}
	

	
}
