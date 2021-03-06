package examples.clone;

public class ShallowCloningTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		House x = new House(4000);
		System.out.println("House x. " + x);
		
		House y;
		y = (House) x.clone();
		System.out.println("House y. " + y);
		
		System.out.println("Now changing the price for x.");
		x.setPrice(2000);
		
		System.out.println("Now changing the price for x.");
		x.setPrice(2000);
		
		System.out.println("House x. " + x);
		System.out.println("House y. " + y);
		
	}

}
