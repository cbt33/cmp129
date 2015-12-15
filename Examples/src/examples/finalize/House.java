package examples.finalize;

public class House implements Runnable {

	public void run() {}
	protected void finalize() {
		System.out.println("Goodbye, cruel world!");
	}
	
}
