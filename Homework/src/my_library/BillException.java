package my_library;

@SuppressWarnings("serial")
public class BillException extends Exception {
	public void output() {
		System.out.println("Invalid input for bill");
	}
}
