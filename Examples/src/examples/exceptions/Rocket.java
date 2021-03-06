package examples.exceptions;

// Throws a unique exception for each attribute when invalid input is attempted
public class Rocket {
	
	private int thrust;
	private double size;
	private static int minThrust = 6000;
	private static double minSize = 5000;
	
	public Rocket() {
		this.thrust = minThrust;
		this.size = minSize;
	}
	
	public Rocket(int thrust, double size) throws ThrustException, SizeException {
		this.setThrust(thrust);
		this.setSize(size);
	}
	
	@Override
	public String toString() {
		return "A rocket with thrust " + thrust 
				+ " and a size " + size + ".";
	}
	
	protected void finalize() {
		System.out.println("Finalize Called");
	}

	public int getThrust() {
		return thrust;
	}

	public void setThrust(int thrust) throws ThrustException {
		if (thrust < minThrust)
			throw new ThrustException();
		else
			this.thrust = thrust;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) throws SizeException {
		if (size < minSize)
			throw new SizeException();
		else
			this.size = size;
	}
}
