package examples.exceptions;

@SuppressWarnings("serial")
public class BillException extends Exception {
	public void output() {
		System.out.println("Invalid input for bill");
	}
}
