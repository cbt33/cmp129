package my_library;

@SuppressWarnings("serial")
public class AngleException extends Exception {
	
	private String message = "Not a valid angle";
	
	@Override
	public String getMessage() {
		return message;
	}
	
	
}
