package examples.exceptions;

import examples.exceptions.MyLibrary;

public class SusansWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b = Double.parseDouble(args[0]);
		double p = Double.parseDouble(args[1]);
		try {
			double tip = MyLibrary.Tip(b, p);
			System.out.println("The tip for " + p + " percent of " + b + " is " + tip);
		}
		catch(BillException bex) {
			bex.output();
		}
		catch(PercentException pex) {
			System.out.println(pex.getMessage());
		}
	}

}
