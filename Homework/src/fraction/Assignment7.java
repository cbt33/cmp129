package fraction;

import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment7 {

	@Test
	public void validOverloadedConstructorTest() throws FractionException {
		Fraction x = new Fraction(3,4);
		assertEquals(x.getNumerator(), 3);
		assertEquals(x.getDenominator(), 4);
		assertEquals(x.getSign().toInt(), 1);
	}
	
	@Test (expected = FractionException.class)
	public void invalidOverloadedConstructorTest() throws FractionException {
		Fraction x = new Fraction(3,0);
		x.setDenominator(0);
	}
	
	@Test
	public void toStringTest() throws FractionException {
		Fraction x = new Fraction(7,9);
		assertEquals(true,x.toString().equals("[+7/9]"));
		Fraction y = new Fraction(4,-7);
		assertEquals(true,y.toString().equals("[-4/7]"));
		Fraction z = new Fraction(-9,-20);
		assertEquals(true,z.toString().equals("[+9/20]"));
		Fraction zero = new Fraction(0,12);
		assertEquals(true,zero.toString().equals("[+0/12]"));
		Fraction one = new Fraction(1,1);
		assertEquals(true,one.toString().equals("[+1/1]"));
	}
	
	@Test
	public void simplifyTest() throws FractionException {
		Fraction improper = new Fraction(24, 32);
		improper.simplify();
		System.out.println(improper.getNumerator());
		assertEquals(improper, new Fraction(3,4));
	}

}
