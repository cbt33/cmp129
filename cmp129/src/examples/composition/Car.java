package examples.composition;

public class Car {
	private Wheel[] wheels = new Wheel[4];
	
	public Car() {
		for (int i=0; i<wheels.length; i++) {
			wheels[i] = new Wheel();
		}
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}
	
}
