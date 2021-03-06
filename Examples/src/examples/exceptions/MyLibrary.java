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
			try {
				output = input.nextInt();
				isInteger = true;
			} catch (Exception e) {
				// TODO: handle exception
				input.next();
				//e.printStackTrace();
				continue;
			}
		}
		input.close();
		return output;
	}
	
	
	public String Substitute(String input, char orig, char repl) throws InvalidStringException {
		if (input == null)
			throw new InvalidStringException();
		
		char[] output = new char[input.length()];

		for (int i = 0; i < input.length(); i++){
			if (input.charAt(i) == orig)
				output[i] = repl;
			else
				output[i] = input.charAt(i);
		}
		return new String(output);
	}
	
	public double Sine(double x, int terms) throws AngleException {
		if (x < 0 || x > 2*Math.PI)
			throw new AngleException();
		double sum = 0;
		for (int n=0; n <= terms; n++) {
			try {
				sum = sum + Math.pow(x, 2*n+1)*Math.pow(-1, n)/Fac(2*n+1);
			} catch (NotAValidIntegerException e) {
				System.out.println(e.getMessage());
			}
		}
		return sum;
	}
	
}
