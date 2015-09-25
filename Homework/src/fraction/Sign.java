package fraction;

public enum Sign {
	POSITIVE (1), 
	NEGATIVE (-1), 
	ZERO (0);
	
	private final int sign;
	
	private Sign(int sign) {
		this.sign = sign;
	}
	
	public int getSign() {
		return this.sign;
	}
	
}
