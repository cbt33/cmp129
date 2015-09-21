package fraction;

public class FractionException extends Exception {

	String message;
	
	public FractionException(String message) {
		this.message = message;
	}
}
