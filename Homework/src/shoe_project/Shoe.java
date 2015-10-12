package shoe_project;

public class Shoe {
	private String id;
	private double size;
	private Color color;
	private static int totalShoeCount;
	private double minSize = 1;
	
	public Shoe(String id, double size, Color color) throws ShoeException {
		this.setId(id);
		this.setSize(size);
		this.setColor(color);
	}
	
	@Override
	public String toString() {
		return "id:" + id + ",size:" + size + ",color:" + color;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shoe other = (Shoe) obj;
		if (color != other.color)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		return true;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Shoe shoe = (Shoe) new Object();
		shoe.setColor(this.getColor());
		shoe.setSize(this.getSize());
		shoe.setId(this.getId());
		return shoe;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public static int getTotalShoeCount() {
		return totalShoeCount;
	}
	public double getMinSize() {
		return minSize;
	}

}
