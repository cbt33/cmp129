package examples.composition;

public class Car {
	private Wheel[] wheels = new Wheel[4];
	
	public Car() {
		for (Wheel wheel : wheels) {
			wheel = new Wheel();
		}
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}
	
	
	
	
}
