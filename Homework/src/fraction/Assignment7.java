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
	public void simplifyTest1() throws FractionException {
		Fraction improper = new Fraction(24, 32);
		improper.simplify();
		assertEquals(true, improper.toString().equals("[+3/4]"));
	}
	
	@Test
	public void simplifyTest2() throws FractionException {
		Fraction improper = new Fraction(15, 3);
		improper.simplify();
		assertEquals(true, improper.toString().equals("[+5/1]"));
	}
	
	@Test
	public void copyConstructorTest() throws FractionException {
		Fraction f = new Fraction(15, 17);
		Fraction r = new Fraction( f );
		assertEquals(true, f.toString().equals(r.toString()));
	}
	
	@Test
	public void cloneTest() throws FractionException, CloneNotSupportedException {
		Fraction orig = new Fraction(13, 8);
		Fraction c = (Fraction)orig.clone();
		assertEquals(orig.getNumerator(), c.getNumerator());
		assertEquals(orig.getDenominator(), c.getDenominator());
	}
	
	@Test
	public void oppositeTest() throws FractionException {
		Fraction w = new Fraction(13, 8);
		Fraction w2 = w.opposite();
		assertEquals(true, w2.toString().equals("[-13/8]"));
		assertEquals(true, w.toString().equals("[+13/8]"));
	}
	
	@Test
	public void inverseTest() throws FractionException {
		Fraction w = new Fraction(4, -9);
		Fraction w2 = w.inverse();
		assertEquals(true, w2.toString().equals("[-9/4]"));
		assertEquals(true, w.toString().equals("[-4/9]"));
	}
	
	@Test
	public void memberAddTest() throws FractionException {
		Fraction  k = new Fraction( 1 , 7 );
		Fraction  r  = new Fraction( 4 , 5 );
		r.add( k );
		assertEquals(true, r.toString().equals("[+33/35]"));
		assertEquals(true, k.toString().equals("[+1/7]"));
	}
	
	@Test
	public void staticAddTest() throws FractionException {
		Fraction result = Add(new Fraction( 2 , 7 ), new Fraction( 4 , 5 ));
		assertEquals(true, k.toString().equals("[+1/7]"));
	}

}
