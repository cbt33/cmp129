package examples.exceptions;

@SuppressWarnings("serial")
public class PercentException extends Exception {
	public void output() {
		System.out.println("Invalid input for percentage");
	}
}
