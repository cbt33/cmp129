package examples.exceptions;

import java.util.Scanner;

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
	
	public static double CalcFee(int credits) throws CreditException {
		if (credits < 0 || credits > 33)
			throw new CreditException();
		if (credits >= 12)
			credits = 12;
		return 70.00 + credits*110.00;
	}
	
	public static long Fac(int number) throws NotAValidIntegerException {

		if (number < 0 || number > 20)
			throw new NotAValidIntegerException(); 
		if (number==0)
			return 1;
		else
			return Fac(number-1)*number;
	}

	public static int locate(double[] scores, double value) throws ArrayException {
		if (scores == null)
			throw new ArrayException();
		int i = 0;
		for (double score : scores) {
			if (score == value)
				return i;
			i++;
		}
		return -1;
	}
	
	public int getInteger() {
		Scanner input = new Scanner(System.in);
		boolean isInteger = false;
		int output = 0;
		while (!isInteger) {
			System.out.println("Please enter an integer value");
			output = input.nextInt();
			if (input.hasNextInt()) 
				output = input.nextInt();
				isInteger = true;
		}
		input.close();
		return output;
	}
	
	public String Substitute(String input, char orig, char repl) {
		char[input.length()] output;
		for (char c : input){
			if (c = repl)
			
		}
		return String(output);
	}
	
}
