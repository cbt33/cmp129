package examples.inheritance.case1;

public class Case1 {
	public static void main(String args[]) {
		Bicycle x = new Bicycle();
		x.cost();
		x = new Motorcycle();
		x.cost();
	}
}
