package examples.exceptions;

@SuppressWarnings("serial")
public class PercentException extends Exception {

	private String message = "Invalid input for percentage";
	
	@Override
	public String getMessage() {
		return message;
	}
}
