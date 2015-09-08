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

}
