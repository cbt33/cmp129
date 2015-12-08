package fraction;

@SuppressWarnings("serial")
public class FractionException extends Exception {

	String message;
	
	public FractionException(String message) {
		this.message = message;
	}
}
