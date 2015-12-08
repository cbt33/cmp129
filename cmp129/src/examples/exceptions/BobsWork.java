package examples.exceptions;

import examples.exceptions.MyLibrary;

public class BobsWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double input = Double.parseDouble(args[0]);
		MyLibrary x = new MyLibrary();
		double r;
		try {
			r = x.FahToCel(input);
			System.out.println("If you " + 
					"convert " + input + " degrees " + 
							"Fahrenheit, you get " + r +
							" degrees Celsius.");
		}
		catch(TempRangeException ex) {
			ex.output();
		}
	}

}
