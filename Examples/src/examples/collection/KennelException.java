package examples.collection;

public class KennelException extends Exception {
	private String message;
	
	public KennelException(String message) {
		this.message = message;
	}
	
	public String toString() {
		return message;
	}
	
}
