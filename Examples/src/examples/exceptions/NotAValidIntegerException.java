package examples.exceptions;

@SuppressWarnings("serial")
public class NotAValidIntegerException extends Exception {
	
	private String message = "Not a valid integer";
	
	@Override
	public String getMessage() {
		return message;
	}

}
