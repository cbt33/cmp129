package examples.access;

public class TimsWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House x = new House();
		System.out.println("x created. Rooms:" + x.getNumRooms() + ", Price:" + x.getPrice() + ".");
		x.setNumRooms(4);
		x.setPrice(70000);
		System.out.println("x created. Rooms:" + x.getNumRooms() + ", Price:" + x.getPrice() + ".");
		System.out.println("x created. " + x);
	}

}
