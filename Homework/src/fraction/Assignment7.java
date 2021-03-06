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
		assertEquals(15, r.getNumerator());
		assertEquals(17, r.getDenominator());
		assertEquals(1, r.getSign().toInt());
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
		Fraction w2 = new Fraction(w);
		w2.opposite();
		assertEquals(true, w.toString().equals("[+13/8]"));
		assertEquals(true, w2.toString().equals("[-13/8]"));
	}
	
	@Test
	public void inverseTest() throws FractionException {
		Fraction w = new Fraction(4, -9);
		Fraction w2 = new Fraction(w);
		w2.inverse();
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
		Fraction result = Fraction.add(new Fraction( 2 , 3 ), new Fraction( 3 , -4 ));
		assertEquals(true, result.toString().equals("[-1/12]"));
	}
	
	@Test
	public void memberSubtractTest() throws FractionException {
		Fraction  k = new Fraction( 1 , 7 );
		Fraction  r  = new Fraction( 4 , 5 );
		k.subtract( r );
		System.out.println(k + " " + r);
		assertEquals(true, k.toString().equals("[-23/35]"));
		assertEquals(true, r.toString().equals("[+4/5]"));
	}
	
	@Test
	public void staticSubtractTest() throws FractionException {
		Fraction result = Fraction.subtract(new Fraction( -14 , 7 ), new Fraction( 11 , 3 ));
		assertEquals(true, result.toString().equals("[-17/3]"));
	}
	
	@Test
	public void memberMultiplyTest() throws FractionException {
		Fraction  k = new Fraction( 1 , 7 );
		Fraction  r  = new Fraction( 4 , 5 );
		r.multiply( k );
		assertEquals(true, r.toString().equals("[+4/35]"));
		assertEquals(true, k.toString().equals("[+1/7]"));
	}
	
	@Test
	public void staticMultiplyTest() throws FractionException {
		Fraction result = Fraction.multiply(new Fraction( -14 , 7 ), new Fraction( 11 , 3 ));
		assertEquals(true, result.toString().equals("[-22/3]"));
	}
	
	@Test
	public void toDoubleTest() throws FractionException {
		Fraction m = new Fraction( -1 , 4 );
		assertEquals(-.25, m.toDouble(), .001);
	}
	
	@Test
	public void toIntTest1() throws FractionException {
		Fraction m = new Fraction( -1 , 4 );
		assertEquals(m.toInt(), 0);
	}
	
	@Test
	public void toIntTest2() throws FractionException {
		Fraction m = new Fraction( 5 , 4 );
		assertEquals(m.toInt(), 1);
	}
	
	@Test
	public void toPercentTest() throws FractionException {
		Fraction m = new Fraction( 1 , -4 );
		assertEquals(-25.0, m.toPercent(), .001);
	}
	
	@Test
	public void toMixedTest() throws FractionException {
		Fraction m = new Fraction( 10 , 4 );
		Fraction q = new Fraction( 5 , -7 );
		assertEquals(true, m.toMixed().equals("[+2 1/2]"));
		assertEquals(true, q.toMixed().equals("[-0 5/7]"));
	}
	
	
	

}
