package fraction;

public enum Sign {
	POSITIVE, 
	NEGATIVE;

	
	public int toInt() {
		switch (this) {
		case POSITIVE:
			return 1;
		case NEGATIVE:
			return -1;
		default:
			return 1;
		}
	}
	
	public char toChar() {
		switch (this) {
		case POSITIVE:
			return '+';
		case NEGATIVE:
			return '-';
		default:
			return ' ';
		}
	}
	
}
	

