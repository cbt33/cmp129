package examples.generics;

public class GenericDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car x = new Car();
		GenericGarage<Car> myGarage = new GenericGarage<Car>(x);
		System.out.println("myGarage " + myGarage);
		
		Bicycle y = new Bicycle();
		GenericGarage<Bicycle> yourGarage = new GenericGarage<Bicycle>(y);
		System.out.println("yourGarage " + yourGarage);
	}

}
