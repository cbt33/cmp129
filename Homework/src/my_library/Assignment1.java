package my_library;

import org.junit.Test;

//import examples.exceptions.*;

public class Assignment1 {
	
	@Test
	public static void CalcFeeTest() {
		int[] credits = {13, 5, 34, -5};
		double bill;
		
		for (int c : credits) {
			try {
				bill = MyLibrary.CalcFee(c);
				System.out.format("The bill for %d credits is %f \n", c, bill);
			}
			catch (CreditException cex) {
				System.out.println(cex.getMessage());
			}
		}
		
	}
	
	@Test
	public static void FactorialTest() {
		int[] in = {5, -5, 25, 20};
		long out;
		
		for (int i : in){
			try {
				out = MyLibrary.fac(i);
				System.out.format("%d factorial is %d \n", i, out);
			}
			catch (FacException nex) {
				System.out.println(nex.getMessage());
			}
		}

	}

	@Test
	public static void LocateTest() {
		int k;
		double[] dArray1 = {  8.9 , 1.6 , 10.7 , 8.3 , 10.7 , 9.1 };
		double[] dArray2 = null;
		//Create a "null" array
		double[] dArray3 = new double[ 0 ];
		//Create an empty array object
		double searchValue1 = 10.7;
		double searchValue2 = 3.1;
		
		//See if 10.7 appears in the array named dArray1:
		try {
			k = MyLibrary.locate( dArray1 , searchValue1 );
			if ( k!=-1 )
				System.out.println(searchValue1 + " was found at index: " + k );
		else
			System.out.println(searchValue1 + " was not found in the array.");
		} catch( ArrayException e ) {
			System.out.println("Cannot search array. Array is invalid.");
		}
		
		//See if 3.1 appears in the array named dArray1:
		try {
			k = MyLibrary.locate( dArray1 , searchValue2 );
		if ( k!=-1 )
			System.out.println(searchValue2 + " was found at index: " + k );
		else
			System.out.println(searchValue2 + " was not found in the array.");
		} catch( ArrayException e ) {
			System.out.println("Cannot search array. Array is invalid.");
		}
		
		//See if 3.1 appears in the array named ddArray2:
		try
		{
		k = MyLibrary.locate(dArray2, searchValue2);
		if ( k!=-1 )
			System.out.println(searchValue2 + " was found at index: " + k );
		else
			System.out.println(searchValue2 + " was not found in the array.");
		} catch( ArrayException e ) {
			System.out.println("Cannot search array. Array is invalid.");
		}
		
		//See if 3.1 appears in the array named dArray3:
		try
		{
			k = MyLibrary.locate( dArray3 , searchValue2 );
		if ( k!=-1 )
			System.out.println(searchValue2 + " was found at index: " + k );
		else
			System.out.println(searchValue2 + " was not found in the array.");
		} catch( ArrayException e ) {
		System.out.println("Cannot search array. Array is invalid.");
		}
		
	}
	
	@Test
	public static void getIntegerTest(MyLibrary ml) {
			int out = ml.getInteger();
			System.out.println("The integer entered was " + out);
	}
	
	@Test
	public static void substituteTest(MyLibrary ml) {
		String[] in = {"Roses are Red", "-5", "horse", "3.14", "a1234"};
		char orig = 'o';
		char rep = 'j';
		
		for (
				String i : in){
			try {
				String out = ml.substitute(i, orig, rep);
				System.out.format("The original string was %s \n", i);
				System.out.format("The edited string is %s \n", out);
			} catch (InvalidStringException iex) {
				System.out.println(iex.getMessage());
			}
		}
			
	}
	
	@Test
	public static void sineTest(MyLibrary ml) {
		int terms = 10;
		//double[] in = {-2.0, -1.5, -1.0, -.5, -.4, -.3, -.2, -.1, 0, .1, .2, .3, .4, .5, 1.0, 1.5, 2.0};
		double out;
		
		for (double i = -2.0; i <= 2.0; i+=.1){
			try {
				out = ml.sine(i*Math.PI, terms);
				System.out.format("The sine of %f*pi radians from MyLibrary method is %f \n", i, out);
				System.out.format("The sine of %f*pi radians from standard method is %f \n", i, Math.sin(Math.PI*i));
			} catch (AngleException aex) {
				System.out.println(aex.getMessage());
			} catch (FacException fex) {
				System.out.println(fex.getMessage());
		}
		}
		
		try {
			ml.sine(Math.PI/2.0,11);
		} catch (AngleException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (FacException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) throws FacException, AngleException {
		// TODO Auto-generated method stub
		MyLibrary ml = new MyLibrary();
		double test = ml.cos(1.5*Math.PI, 4);
		System.out.println("The test value is " + test);
		CalcFeeTest();
		FactorialTest();
		LocateTest();
		//getIntegerTest(ml);
		substituteTest(ml);
		sineTest(ml);
	}

}
