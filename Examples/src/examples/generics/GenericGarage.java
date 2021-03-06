package examples.generics;

public class GenericGarage<T> {
	private T object;
	
	public GenericGarage( T object ) {
		this.object = object;
	}
	
	public String toString() {return "A garage with " + object;}
	
	public T getObject() {return object;}
	
}
