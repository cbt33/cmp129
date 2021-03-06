package fraction;

public class Fraction implements Cloneable {

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
		try {
			this.setNumerator(numerator);
			this.setDenominator(denominator);
			simplify();
			fractionCount++;
		} catch (FractionException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}
	
	@SuppressWarnings("static-access")
	public Fraction(int numerator, int denominator, Sign sign) throws FractionException {	
		try {
			this.setNumerator(numerator);
			this.setDenominator(denominator);
			this.setSign(sign);
			simplify();
			fractionCount++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}
	
	
	public Fraction(Fraction f) throws FractionException {
		fractionCount++;
		try {
			this.setNumerator(f.getNumerator());
			this.setDenominator(f.getDenominator());
			this.setSign(f.getSign());
		}
		catch (Exception e) { 
			throw e; }
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Fraction f;
		try {
			f = (Fraction)super.clone();
			fractionCount++;
			return f;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}
	
	public void opposite() {
		this.setSign(sign.toInt()*-1);
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
			Fraction result = add(this, fraction);
			this.setNumerator(result.getNumerator());
			this.setDenominator(result.getDenominator());
			this.setSign(result.getSign());
		} catch (FractionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Fraction add(Fraction f1, Fraction f2) throws FractionException {
		return new Fraction(f1.getSign().toInt()*f1.getNumerator()*f2.getDenominator() + f2.getSign().toInt()*f2.getNumerator()*f1.getDenominator(), 
					f1.getDenominator()*f2.getDenominator());
	}
	
	public void subtract(Fraction fraction) throws FractionException {
		Fraction opposite = new Fraction(fraction);
		opposite.opposite();
		this.add(opposite);
	}
	
	public static Fraction subtract(Fraction f1, Fraction f2) throws FractionException {
		return new Fraction(f1.getSign().toInt()*f1.getNumerator()*f2.getDenominator() - f2.getSign().toInt()*f2.getNumerator()*f1.getDenominator(), 
					f1.getDenominator()*f2.getDenominator());
	}
	
	public void multiply(Fraction fraction) throws FractionException {
		this.setNumerator(this.numerator*fraction.getNumerator());
		this.setDenominator(this.denominator*fraction.getDenominator());
		this.setSign(this.sign.toInt()*fraction.getSign().toInt());
	}
	
	public static Fraction multiply(Fraction f1, Fraction f2) throws FractionException {
		return new Fraction(f1.getNumerator()*f2.getNumerator()*f1.getSign().toInt()*f2.getSign().toInt(), 
				f2.getDenominator()*f1.getDenominator());
	}
	
	public void divide(Fraction fraction) throws FractionException {
		this.setNumerator(this.numerator*fraction.getDenominator());
		this.setDenominator(this.denominator*fraction.getNumerator());
		this.setSign(this.sign.toInt()*fraction.getSign().toInt());
	}
	
	public static Fraction divide(Fraction f1, Fraction f2) throws FractionException {
		return new Fraction(f1.getNumerator()*f2.getDenominator()*f1.getSign().toInt()*f2.getSign().toInt(), 
				f2.getNumerator()*f1.getDenominator());
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
	
	private void setSign(int sign) {
		if (sign < 1)
			setSign(Sign.NEGATIVE);
		else
			setSign(Sign.POSITIVE);
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
		return this.getSign().toInt() * 1.0*this.getNumerator()/ this.getDenominator();
	}
	
	public int toInt() {
		if (this.numerator > this.denominator)
			return this.getSign().toInt() * this.numerator % this.denominator;
		else
			return 0;
	}
	
	public double toPercent() {
		return 100*this.toDouble();
	}
	
	public String toMixed() {
		int remainder = numerator % denominator;
		return "[" + getSign().toChar() 
			+ (numerator-remainder)/denominator + " " 
			+ remainder + "/" + denominator + "]";
	}
	
	public int getCount() {
		return fractionCount;
	}
	
}
