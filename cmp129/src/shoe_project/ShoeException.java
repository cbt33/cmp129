package shoe_project;

public class ShoeException extends Exception {
	private String message;
	
	public ShoeException(String message) {
		if (message != null)
			this.message = message;
	}
	
	public String getMessage() { 
		return message; 
	}
}
