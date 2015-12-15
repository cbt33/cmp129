package examples.inheritance;

public class Chair {
	private int legs;
	private String color;
	private double height;
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Chair(double height, String color) {
		super();
		this.height = height;
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "A chair with height: " + height + "and color: " + color + ".";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != getClass())
			return false;
		Chair chair = (Chair) obj;
		if (!(this.getColor().equals(chair.getColor())))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(chair.getHeight()))
			return false;
		return true;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chair other = (Chair) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (legs != other.legs)
			return false;
		return true;
	}*/
	
	
	
}
