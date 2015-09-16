package examples.access;

public class JennysWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person x = new Person();
		try {
			x.setAge(5);
			System.out.println("The age of x is: " + x.getAge());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
