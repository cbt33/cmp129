package my_library;

@SuppressWarnings("serial")
public class InvalidStringException extends Exception {
	private String message = "Invalid String";
	
	@Override
	public String getMessage() {
		return message;
	}
}
