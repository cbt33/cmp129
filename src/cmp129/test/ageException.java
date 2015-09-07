package cmp129.test;

@SuppressWarnings("serial")
public class ageException extends Exception {
	
	protected String message;

	public ageException(int age) {
		message = "Invalid age: " + age + " years";
	}
	
	public String getMessage() {
		return message;
	}

	//public void setMessage(String message) {
	//	this.message = message;
	//}
	
	
}
