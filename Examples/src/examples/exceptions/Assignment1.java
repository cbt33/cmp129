package examples.exceptions;

//import examples.exceptions.*;

public class Assignment1 {
	
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
	
	public static void FactorialTest() {
		int[] in = {5, -5, 25};
		long out;
		
		for (int i : in){
			try {
				out = MyLibrary.Fac(i);
				System.out.format("%d factorial is %d \n", i, out);
			}
			catch (NotAValidIntegerException nex) {
				System.out.println(nex.getMessage());
			}
		}

	}

	public static void LocateTest(MyLibrary ml) {
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
			k = ml.locate( dArray1 , searchValue1 );
			if ( k!=-1 )
				System.out.println(searchValue1 + " was found at index: " + k );
		else
			System.out.println(searchValue1 + " was not found in the array.");
		} catch( ArrayException e ) {
			System.out.println("Cannot search array. Array is invalid.");
		}
		
		//See if 3.1 appears in the array named dArray1:
		try {
			k = ml.locate( dArray1 , searchValue2 );
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
		k = ml.locate(dArray2, searchValue2);
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
			k = ml.locate( dArray3 , searchValue2 );
		if ( k!=-1 )
			System.out.println(searchValue2 + " was found at index: " + k );
		else
			System.out.println(searchValue2 + " was not found in the array.");
		} catch( ArrayException e ) {
		System.out.println("Cannot search array. Array is invalid.");
		}
		
	}
	
	public static getIntegerTest(MyLibrary ml) {
		String[] in = {"5", "-5", "horse", "3.14", "a1234"};
		int out;
		
		for (String i : in){
			try {
				out = ml.getInteger(i);
				System.out.format("The integer in %s is %d \n", i, out);
			}

		}
	}
	
	public static substituteTest(MyLibrary ml) {
		String[] in = {"Roses are Red", "-5", "horse", "3.14", "a1234"};
		char orig = 'o';
		char rep = 'j';
		
		for (String i : in){
			try {
				String out = ml.Substitute(i, orig, rep);
				System.out.format("The original string was %s \n", i);
				System.out.format("The edited string is %s \n", out);
			} catch {
				InvalidStringException isex;
				isex.getMessage();
			}
		}
			
	}
	
	public static sineTest(MyLibrary ml) {
		double[] in = {-2.0, -1.5, -1.0, -.5, -.4, -.3, -.2, -.1, 0, .1, .2, .3, .4, .5, 1.0, 1.5, 2.0};
		double out;
		
		for (double i : in){
			try {
				double out = ml.Sine(i);
				System.out.format("The sine of %f radians is %f \n", i, out);
			} catch {
				AngleException aex;
				aex.getMessage();
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLibrary ml = new MyLibrary();
		CalcFeeTest();
		FactorialTest();
		LocateTest(ml);
	}

}
