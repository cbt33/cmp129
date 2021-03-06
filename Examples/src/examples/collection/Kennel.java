package examples.collection;

public class Kennel {
	
	private Dog[] dogs;
	private int numCages;
	private int numDogs;
	
	public Kennel(int numCages) throws KennelException {
		if (numCages < 1)
			throw new KennelException("Invalid number of cages:" + numCages);
		this.numCages = numCages;
		dogs = new Dog[numCages];
	}
	
	public Kennel(Dog[] dogs, int numCages) throws KennelException {
		
		if (dogs.length > numCages)
			throw new KennelException("Not enough cages");
		
		this.numCages = numCages;
		dogs = new Dog[numCages];
		int i = 0;
		for (Dog dog : dogs) {
			if (dog != null) {
				this.dogs[i] = dog;
				i++;
			}
		}
		this.numDogs = i;
	}
	
	public void addDog(Dog dog) throws CloneNotSupportedException, KennelException {
		if (numDogs < dogs.length) {
			dogs[numDogs] = new Dog(dog);
			numDogs++;
		}else{
			throw new KennelException("Kennel is full");
		}
	}
	
	public void removeDog() throws KennelException {
		if (numDogs == 0)
			if (dogs[numDogs] == null){
				throw new KennelException("Error, Kennel is empty");
			} else {
				dogs[numDogs].setAge(0);
				dogs[numDogs].setName(null);
				dogs[numDogs] = null; 
			}
		numDogs--;
		dogs[numDogs].setAge(0);
		dogs[numDogs].setName(null);
		dogs[numDogs] = null;
	}
	
	public String toString() {
		if (numDogs == 0)
			return "Kennel is empty";
		
		String output = "";
		for (Dog dog : dogs) {
			if (dog != null)
				output = output + "\n" + dog;
		}
		return output;
	}
	
	public Dog[] getDogs() {
		return dogs;
	}
	public int getNumCages() {
		return numCages;
	}
	public int getNumDogs() {
		return numDogs;
	}
	
	
}
