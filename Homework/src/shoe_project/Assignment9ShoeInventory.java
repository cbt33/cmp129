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
	
	//Find() returns -3 if empty
	@Test
	public void shoeInventoryFindIsEmptyTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		assertEquals(-3, si.find(new Shoe("id", 2.0, Color.BLACK)));
	}
	
	//Find() returns -2 if input is null
	@Test
	public void shoeInventoryFindIsNullTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		assertEquals(-2, si.find(null));
	}
	
	//Find() returns -1 if not found
	@Test
	public void shoeInventoryFindNotFoundTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		si.add(new ShoeType("id", 2.0, Color.BLACK, 1));
		assertEquals(-1, si.find((new Shoe("id", 3.0, Color.BLACK))));
	}
	
	//Add() throws exception if full
	@Test (expected = ShoeException.class)
	public void shoeInventoryAddThrowExceptionTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		si.add(new ShoeType("id", 2.0, Color.BLACK, 1));
		si.add(new ShoeType("id", 3.0, Color.BLACK, 1));
		si.add(new ShoeType("id", 4.0, Color.BLACK, 1));
		si.add(new ShoeType("id", 5.0, Color.BLACK, 1));
		//assertEquals(true,true);
	}
	
	@Test
	public void shoeInventoryAddIncrementsExistingTest() throws ShoeException {
		si.add(new ShoeType("id", 2.0, Color.BLACK, 1));
		si.add(new ShoeType("id", 2.0, Color.BLACK, 1));
		assertEquals(1, si.getNumItems());
	}
	
	@Test
	public void shoeInventoryDeleteTestDecrementsCountTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		si.add(new ShoeType("id", 2.0, Color.BLACK, 1));
		assertEquals(1, si.getNumItems());
		si.delete(0);
		assertEquals(0, si.getNumItems());
		assertEquals(true, isEmpty());
	}
	
	@Test (expected = ShoeException.class)
	public void shoeInventoryDeleteThrowsExceptionIfEmptyTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		si.delete(0);
	}
	
	@Test 
	public void shoeInventoryDeleteTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		si.add(new ShoeType("a", 2.0, Color.BLACK, 1));
		si.add(new ShoeType("b", 3.0, Color.BROWN, 1));
		si.add(new ShoeType("c", 4.0, Color.WHITE, 1));
		si.delete(find(new Shoe("id", 3.0, Color.BLACK));
		assertEquals(Color.WHITE, si.getShoeInventory[1].getShoe().getColor());
		assertEquals(Color.BLACK, si.getShoeInventory[0].getShoe().getColor());
		assertEquals(null, si.getShoeInventory()[2]);
	}

	
}
