package examples.generics;

public class Garage {
	private Object object;
	
	public Garage(Object object) {
		this.object = object;
	}
	
	public String toString() {
		//return "A garage with " + object.getClass().getName();
		StringBuffer sbin = new StringBuffer(object.getClass().getName());
		StringBuffer sbout = new StringBuffer();
		for (int i = sbin.length(); i == 0; i--) {
			if (sbin.charAt(i) == '.')
				break;
			sbout.append(sbin.charAt(i));
		}
		return "A garage with " + sbout;
	}
	
	public Object getObject() {
		return this.object;
	}
	
}
