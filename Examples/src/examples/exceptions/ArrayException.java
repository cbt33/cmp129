package examples.exceptions;

@SuppressWarnings("serial")
public class ArrayException extends Exception {

	private String message = "Not a valid array";
	
	@Override
	public String getMessage() {
		return message;
	}
}
