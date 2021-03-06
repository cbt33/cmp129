package my_library;

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
		double labFee = 50.0;
		double techFee = 20.0;
		double perCredit = 110.0;
		//Cannot take no credits and cannot take more than 33
		if (credits <= 0 || credits > 33)
			throw new CreditException();
		//More than 12 credits is equivalent to 12
		if (credits >= 12)
			credits = 12;
		//Part time students pay no lab fee
		if (credits < 12)
			techFee = 0;
		return labFee + techFee + credits*perCredit;
	}
	
	public static long fac(int number) throws FacException {
		if (number < 0 || number > 20)
			throw new FacException(); 
		if (number==0)
			return 1;
		else
			return fac(number-1)*number;
	}

	public static int locate(double[] scores, double value) throws ArrayException {
		if (scores == null || scores.length == 0)
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
				System.out.println("Not a valid integer");
				input.next();
				//e.printStackTrace();
				continue;
			}
		}
		input.close();
		return output;
	}
	
	
	public String substitute(String input, char orig, char repl) throws InvalidStringException {
		if (input == null || input.isEmpty())
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
	
	public double cos(double x, int terms) throws AngleException, FacException {
			
		if (x < 0 || x >= 2*Math.PI)
			throw new AngleException();
			
		double cos = 0;
		for (int n=0; n <= terms; n++) {
			cos = cos + Math.pow(x, 2*n)*Math.pow(-1, n)/fac(2*n);
		}
			
		return cos;
	}
	
	public double sine(double x, int terms) throws AngleException, FacException {
		
		double cos = cos(x, terms);
		
		int sign = 1;
		if (x > Math.PI)
			sign = -1;
		else if (x == Math.PI)
			sign = 0;
		
		if (cos == 1)
			return 0;
		return sign * Math.pow(1 - Math.pow(Math.abs(cos), 2), .5);
	}
	
	//What I had originally, failed because cannot run with 10 terms, had to use cos instead
/*	public double sine(double x, int terms) throws AngleException, FacException {
		if (x < 0 || x >= 2*Math.PI)
			throw new AngleException();
		double sum = 0;
		for (int n=0; n <= terms; n++) {
			sum = sum + Math.pow(x, 2*n+1)*Math.pow(-1, n)/fac(2*n+1);
			}
		return sum;
	}*/
	
}