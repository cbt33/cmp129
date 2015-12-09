package examples.composition;

public class Government {
	private Person president;
	private Person vicePresident;
	double psal;
	double vpsal;
	
	public Government(Person president, double psal, Person vicePresident, double vpsal) {
		this.president = president;
		this.psal = psal;
		this.vicePresident = vicePresident;
		this.vpsal = vpsal;
	}
	
	@Override
	public String toString() {
		return "\nPresident:\n" + president + ", Salary:" + psal +
				"\nVice President:\n" + vicePresident + ", Salary:" + vpsal;
	}
	
}
