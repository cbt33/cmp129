package fraction;

public enum Sign {
	POSITIVE, 
	NEGATIVE, 
	ZERO;
	
	public int toInt() {
		switch (this) {
		case POSITIVE:
			return 1;
		case NEGATIVE:
			return -1;
		case ZERO:
			return 0;
		default:
			return 0;
		}
	}
	
	public char toChar() {
		switch (this) {
		case POSITIVE:
			return '+';
		case NEGATIVE:
			return '-';
		case ZERO:
			return '0';
		default:
			return ' ';
		}
	}
	
}
	

