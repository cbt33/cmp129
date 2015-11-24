package shoe_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment9ShoeTest {

	@Test
	public void ShoeEqualsTest() throws ShoeException {
		Shoe a = new Shoe("a", 1.0, Color.BLACK);
		Shoe b = new Shoe("a", 1.0, Color.BLACK);
		assertEquals(true, a.equals(b));
	}
	
	@Test
	public void ShoeUnequalsTest() throws ShoeException {
		Shoe a = new Shoe("a", 1.0, Color.BLACK);
		Shoe b = new Shoe("b", 1.0, Color.BLACK);
		Shoe c = new Shoe("a", 2.0, Color.BLACK);
		Shoe d = new Shoe("a", 1.0, Color.WHITE);
		assertEquals(false, a.equals(b));
		assertEquals(false, a.equals(c));
		assertEquals(false, a.equals(d));
	}
	
}
