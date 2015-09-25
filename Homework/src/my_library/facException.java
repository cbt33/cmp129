package my_library;

@SuppressWarnings("serial")
public class facException extends Exception {
	
	private String message = "Not a valid integer";
	
	@Override
	public String getMessage() {
		return message;
	}

}
