package car_project;

@SuppressWarnings("serial")
public class CarException extends Exception {
	String message;
	
	public CarException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return message;
	}
	
	
}
