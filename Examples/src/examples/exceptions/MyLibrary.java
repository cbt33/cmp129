package examples.exceptions;

public class MyLibrary {
	
	public double FahToCel( double f ) throws TempRangeException {
		
		if (f >= -459.67)
			return 5.0/9.0 * (f - 32.2);
		else
			throw new TempRangeException();
			//return 500;
	}
	
	public static double Tip(double b, double p) throws BillException, PercentException{
		
		if (b <= 0)
			throw new BillException();
			
		if (p < 0)
			throw new PercentException();
		
		double tip = b * p;
		return tip;
	}
	
	public static long Fac(int number) throws NotAPositiveIntegerException {
		if (number < 0)
			throw new NotAPositiveIntegerException(); 
		if (number==0)
			return 1;
		else
			return Fac(number-1)*number;
	}

	public static int locate(double value, double[] scores) throws ArrayException{
		if (scores == null)
			return new ArrayException();
		int i = 0;
		for (double score : scores) {
			if (score == value)
				return i;
			i++;
		}
		return -1;
	}
	
	public integer getInteger() {
		Scanner input = new Scanner(System.input);
		boolean isInteger = false;
		while (!isInteger) {
			System.out.println("Please enter an integer value");
		}
	}
	
}
