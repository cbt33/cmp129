package examples.generics;

public class GenericDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			Car x = new Car();
//  			Garage myGarage = new Garage(x);
//			System.out.println("myGarage " + myGarage);
//			
//			Bicycle y = new Bicycle();
//			Garage yourGarage = new Garage(y);
//			System.out.println("yourGarage " + yourGarage);
		
		String in = ".String";
		StringBuffer sbout = new StringBuffer();
		//System.out.println(sbin.length());
		//if (sbin.charAt(sbin.length()-1) == '.')
		//	System.out.println("space equals .");
		for (int i = in.length()-1; i >= 0; i--) {
			System.out.println(in.charAt(i));
			if (in.charAt(i) == '.')
				break;
			else
				sbout.append(in.charAt(i));
		}
		System.out.println(sbout.reverse());
	}

}
