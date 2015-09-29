package fraction;

public class Fraction {

	private int numerator;
	private int denominator;
	private Sign sign;
	private static int fractionCount;
	
	public int GCD(int numerator, int denominator) {
		numerator = Math.abs(numerator);
		denominator = Math.abs(denominator);
		int gcd = 1;
		for (int i=1; i==numerator; i++) {
			if (numerator % i == 0 && denominator % i == 0)
				gcd = i;
		}
		return gcd;
	}	
	
	
	public Fraction(int numerator, int denominator, Sign sign) throws FractionException {
		fractionCount++;
		this.setNumerator(numerator);
		this.setDenominator(denominator);
		this.setSign(sign);
		simplify();
	}
	
	
	public Fraction(Fraction f) {
		fractionCount++;
		try {
			f.setNumerator(this.getNumerator());
			f.setDenominator(this.getDenominator());
			f.setSign(this.getSign());
		}
		catch (Exception e) {}
	}
	
	public Fraction clone() {
		fractionCount++;
		Fraction f = new Fraction(this);
		return f;
	}
	
	public void opposite() {
		switch (this.getSign()) {
			case POSITIVE:
				this.setSign(Sign.NEGATIVE);
				break;
			case NEGATIVE:
				this.setSign(Sign.POSITIVE);
				break;
			case ZERO:
				this.setSign(Sign.NEGATIVE);
				break;
		}
		simplify();
	}
	
	public void inverse() {
		try {
			int n = this.numerator;
			int d = this.denominator;
			this.setDenominator(n);
			this.setNumerator(d);
			simplify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void add(Fraction fraction) throws FractionException {
		try {
			int comDenom = Math.abs(this.getDenominator()*fraction.getDenominator());
			this.numerator *= comDenom;
			this.denominator *= comDenom;
			fraction.setNumerator(fraction.getNumerator()*comDenom);
			fraction.setDenominator(fraction.getDenominator()*comDenom);
			this.numerator = this.getSign().toInt()*this.numerator + fraction.getSign().toInt()*fraction.getNumerator();
		} catch (FractionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public Fraction(int numerator, int denominator) throws FractionException {
		fractionCount++;
		this.setNumerator(numerator);
		this.setDenominator(denominator);
		if (numerator*denominator > 0)
			this.setSign(Sign.POSITIVE);
		else
			this.setSign(Sign.NEGATIVE);
		simplify();
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) throws FractionException {
			this.numerator = numerator;
			simplify();
	}

	public int getDenominator() {
		return this.denominator;
	}

	public void setDenominator(int denominator) throws FractionException {
		if (denominator != 0)
			this.denominator = denominator;
		else
			throw new FractionException("Error. Attempt to set denominator to 0");
		simplify();
	}

	public Sign getSign() {
		return sign;
	}

	public void setSign(Sign sign) {
		if (this.getNumerator() < 0)
			this.sign = sign;
		else
			this.setSign(Sign.ZERO);
	}
	
	public void setSign() {
		if (this.getNumerator() != 0) {
			if (this.numerator*this.denominator > 0)
				this.setSign(Sign.POSITIVE);
			else if (this.numerator*this.denominator < 0)
				this.setSign(Sign.NEGATIVE);
			else
				this.setSign(Sign.ZERO);
		}
		this.numerator = Math.abs(this.numerator);
		this.denominator = Math.abs(this.denominator);
	}
	
	public void simplify() {
		int gcd = GCD(numerator, denominator);
		this.numerator = numerator/gcd;
		this.denominator = denominator/gcd;
		setSign();
	}

	@Override
	public String toString() {
		switch (this.getSign()) {
		case POSITIVE:
			return ("[+" + this.getNumerator() + "/" + this.getDenominator() + "]");
		case NEGATIVE:
			return ("[-" + this.getNumerator() + "/" + this.getDenominator() + "]");
		case ZERO:
			return "0";
		}
		return "No sign specified";
	}
	
	public double toDouble() {
		return this.getSign().toInt() * this.getNumerator() / this.getDenominator();
	}
	
	public int toInt() {
		if (this.numerator > this.denominator)
			return this.numerator % this.denominator;
		else
			return 0;
	}
	
	public double toPercent() {
		return 100*this.toDouble();
	}
	
	public String toMixed() {
		if (this.numerator > this.denominator) {
			return "[" + this.getSign().toChar() + "]";
		}
	}
	
}
