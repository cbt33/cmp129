package car_project;

public class CarDealerShip {
	private Car[] cars;
	private int numCars;
	
	//Default constructor, generates object from formatted text file
	public CarDealerShip(String filename) {
		Path path = new File(filename);
		BufferedReader in = File.newBufferedReader(path);
		String line;
		if (make = in.nextLine() != null &&
			year = in.nextLine() != null &&)
	}
	
	//Adds car to cars
	public void Add(Car car) {}
	
	//Delete the last car added from cars
	public boolean Delete() {}
	
	//Outputs each car in cars
	public String toString() {}
	
	//Writes cars into a text file before closing
	@Override
	protected void finalize() {}
	
}
