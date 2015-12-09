package examples.finalize;

public class FredsWork {
	
	public static void run() {
		int x;
		House y = new House();
		House z = new House();
		System.out.println("Test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		run();
		System.gc();
		System.runFinalization();
	}
}
