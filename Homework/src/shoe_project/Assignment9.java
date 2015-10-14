package shoe_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment9 {
	
	//If Fulll
	@Test (expected == ShoeException.class)
	public void shoeInventoryAddTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		si.add(new ShoeType("id", 2.0, 1, 1));
		si.add(new ShoeType("id", 3.0, 1, 1));
		si.add(new ShoeType("id", 4.0, 1, 1));
		si.add(new ShoeType("id", 4.0, 1, 1));
		//assertEquals(true,true);
	}
	
	@Test (expected == ShoeException.class)
	public void shoeInventoryAddTest() throws ShoeException {
		ShoeInventory si = new ShoeInventory(3);
		si.add(new ShoeType("id", 2.0, 1, 1));
		si.add(new ShoeType("id", 3.0, 1, 1));
		si.add(new ShoeType("id", 4.0, 1, 1));
		si.add(new ShoeType("id", 4.0, 1, 1));
		//assertEquals(true,true);
	}
	
}
