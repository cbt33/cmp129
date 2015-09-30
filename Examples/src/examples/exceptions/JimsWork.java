package examples.exceptions;

public class JimsWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rocket arianna = new Rocket();
		try {
			Rocket saturn = new Rocket((int) 8e6, 30000.0);
			System.out.println("Rocket Saturn: " + saturn);
		} catch (ThrustException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid thrust.");
		} catch (SizeException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid size.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {}
		System.out.println("Goodbye");
	}

}
