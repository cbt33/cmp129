package examples.inheritance;

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Chair x = new Chair(2, "black");
			Chair y = new Chair(2, "black");
			
			if (x==y)
				System.out.println("Chairs are same");
			else
				System.out.println("Chairs are not same");
	}

}
