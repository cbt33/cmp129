package fraction;

public class Fraction {

	private int numerator = 1;
	private int denominator = 1;
	private Sign sign = Sign.POSITIVE;
	private static int fractionCount;
	
	public int GCD(int num, int den) {
		num = Math.abs(num);
		den = Math.abs(den);
		int gcd = 1;
		for (int i=1; i<=num; i++) {
			if (num % i == 0 && den % i == 0)
				gcd = i;
		}
		return gcd;
	}	
	
	public Fraction(int numerator, int denominator) throws FractionException {
		fractionCount++;
		this.setNumerator(numerator);
		this.setDenominator(denominator);
		simplify();
	}
	
	@SuppressWarnings("static-access")
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
		if (numerator != 0) {
			switch (this.getSign()) {
				case POSITIVE:
					this.setSign(Sign.NEGATIVE);
					break;
				case NEGATIVE:
					this.setSign(Sign.POSITIVE);
					break;
					}
			} else { this.setSign(Sign.POSITIVE); }
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
	

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
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
		correctSign();
	}

	public Sign getSign() {
		return sign;
	}

	public void setSign(Sign sign) {
			this.sign = sign;
	}
	
	public void correctSign() {
			if (this.numerator*this.denominator*this.getSign().toInt() >= 0)
				this.setSign(Sign.POSITIVE);
			else
				this.setSign(Sign.NEGATIVE);
		this.numerator = Math.abs(this.numerator);
		this.denominator = Math.abs(this.denominator);
	}
	
	public void simplify() {
		correctSign();
		int gcd = GCD(numerator, denominator);
		this.numerator = this.numerator/gcd;
		this.denominator = this.denominator/gcd;
	}

	@Override
	public String toString() {
			return ("[" + getSign().toChar() + this.getNumerator() + "/" + this.getDenominator() + "]");
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
		int remainder = numerator % denominator;
		return "[" + getSign().toChar() + " " 
			+ (numerator-remainder)/denominator + " " 
			+ remainder + " / " + denominator + "]";
	}
	
}
