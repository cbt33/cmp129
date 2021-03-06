package examples.access;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception {
	private String message;
	
	
	public InvalidAgeException(int a) {
		message = a + " is an invalid age.";
	}
	
	@Override
	public String getMessage() {
		return message;
	};
	
}
