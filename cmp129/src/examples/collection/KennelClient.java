package examples.collection;

public class KennelClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Kennel kennel = new Kennel(3);
			System.out.println(kennel.getNumDogs());
			System.out.println("Fido");
			try {
				kennel.addDog(new Dog("Fido",3));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(kennel.getNumDogs());
			System.out.println("Rex");
			try {
				kennel.addDog(new Dog("Rex",3));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(kennel.getNumDogs());
			System.out.println("Santa's Little Helper");
			try {
				kennel.addDog(new Dog("Santa's Little Helper",3));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(kennel.getNumDogs());
			System.out.println("Lani");
			try {
				kennel.addDog(new Dog("Lani", 3));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(kennel.getNumDogs() + "\n");
			System.out.println(kennel);
			try {
				kennel.removeDog();
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			System.out.println(kennel);
			try {
				kennel.addDog(new Dog("Lani", 3));
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println(kennel);
			try {
				kennel.removeDog();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(kennel);
			try {
				kennel.removeDog();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(kennel);
			try {
				kennel.removeDog();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(kennel);
			try {
				kennel.removeDog();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				kennel.addDog(new Dog("Fido",3));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(kennel);
		} catch (KennelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
